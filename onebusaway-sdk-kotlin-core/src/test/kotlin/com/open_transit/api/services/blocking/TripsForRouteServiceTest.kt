// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services.blocking

import com.open_transit.api.TestServerExtension
import com.open_transit.api.client.okhttp.OnebusawaySdkOkHttpClient
import com.open_transit.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TripsForRouteServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripsForRouteService = client.tripsForRoute()
        val tripsForRouteListResponse =
            tripsForRouteService.list(
                TripsForRouteListParams.builder()
                    .routeId("routeID")
                    .includeSchedule(true)
                    .includeStatus(true)
                    .time(123L)
                    .build()
            )
        println(tripsForRouteListResponse)
    }
}
