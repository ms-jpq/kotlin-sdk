// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services.blocking

import com.open_transit.api.TestServerExtension
import com.open_transit.api.client.okhttp.OnebusawaySdkOkHttpClient
import com.open_transit.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ConfigServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val configService = client.config()
        val configRetrieveResponse = configService.retrieve(ConfigRetrieveParams.builder().build())
        println(configRetrieveResponse)
    }
}
