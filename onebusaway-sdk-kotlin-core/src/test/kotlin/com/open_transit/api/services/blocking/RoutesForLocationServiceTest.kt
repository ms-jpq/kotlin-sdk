// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services.blocking

import com.open_transit.api.TestServerExtension
import com.open_transit.api.client.okhttp.OnebusawaySdkOkHttpClient
import com.open_transit.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RoutesForLocationServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routesForLocationService = client.routesForLocation()
        val routesForLocationListResponse =
            routesForLocationService.list(
                RoutesForLocationListParams.builder()
                    .lat(42.23)
                    .lon(42.23)
                    .latSpan(42.23)
                    .lonSpan(42.23)
                    .query("query")
                    .radius(42.23)
                    .build()
            )
        println(routesForLocationListResponse)
    }
}
