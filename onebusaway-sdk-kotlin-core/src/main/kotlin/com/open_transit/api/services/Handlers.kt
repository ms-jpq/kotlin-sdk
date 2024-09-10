@file:JvmName("Handlers")

package com.open_transit.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.open_transit.api.core.http.BinaryResponseContent
import com.open_transit.api.core.http.HttpResponse
import com.open_transit.api.core.http.HttpResponse.Handler
import com.open_transit.api.errors.BadRequestException
import com.open_transit.api.errors.InternalServerException
import com.open_transit.api.errors.NotFoundException
import com.open_transit.api.errors.OnebusawaySdkError
import com.open_transit.api.errors.OnebusawaySdkException
import com.open_transit.api.errors.PermissionDeniedException
import com.open_transit.api.errors.RateLimitException
import com.open_transit.api.errors.UnauthorizedException
import com.open_transit.api.errors.UnexpectedStatusCodeException
import com.open_transit.api.errors.UnprocessableEntityException
import java.io.InputStream
import java.io.OutputStream

internal fun emptyHandler(): Handler<Void?> = EmptyHandler

private object EmptyHandler : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}

internal fun stringHandler(): Handler<String> = StringHandler

internal fun binaryHandler(): Handler<BinaryResponseContent> = BinaryHandler

private object StringHandler : Handler<String> {
    override fun handle(response: HttpResponse): String {
        return response.body().readBytes().toString(Charsets.UTF_8)
    }
}

private object BinaryHandler : Handler<BinaryResponseContent> {
    override fun handle(response: HttpResponse): BinaryResponseContent {
        return object : BinaryResponseContent {
            override fun contentType(): String? =
                response.headers().get("Content-Type").firstOrNull()

            override fun body(): InputStream = response.body()

            override fun close() = response.close()

            override fun writeTo(outputStream: OutputStream) {
                response.body().copyTo(outputStream)
            }
        }
    }
}

internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> {
    return object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw OnebusawaySdkException("Error reading response", e)
            }
        }
    }
}

internal fun errorHandler(jsonMapper: JsonMapper): Handler<OnebusawaySdkError> {
    val handler = jsonHandler<OnebusawaySdkError>(jsonMapper)

    return object : Handler<OnebusawaySdkError> {
        override fun handle(response: HttpResponse): OnebusawaySdkError {
            try {
                return handler.handle(response)
            } catch (e: Exception) {
                return OnebusawaySdkError.builder().build()
            }
        }
    }
}

internal fun <T> Handler<T>.withErrorHandler(
    errorHandler: Handler<OnebusawaySdkError>
): Handler<T> {
    return object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            when (val statusCode = response.statusCode()) {
                in 200..299 -> return this@withErrorHandler.handle(response)
                400 -> throw BadRequestException(response.headers(), errorHandler.handle(response))
                401 ->
                    throw UnauthorizedException(response.headers(), errorHandler.handle(response))
                403 ->
                    throw PermissionDeniedException(
                        response.headers(),
                        errorHandler.handle(response)
                    )
                404 -> throw NotFoundException(response.headers(), errorHandler.handle(response))
                422 ->
                    throw UnprocessableEntityException(
                        response.headers(),
                        errorHandler.handle(response)
                    )
                429 -> throw RateLimitException(response.headers(), errorHandler.handle(response))
                in 500..599 ->
                    throw InternalServerException(
                        statusCode,
                        response.headers(),
                        errorHandler.handle(response)
                    )
                else ->
                    throw UnexpectedStatusCodeException(
                        statusCode,
                        response.headers(),
                        StringHandler.handle(response)
                    )
            }
        }
    }
}
