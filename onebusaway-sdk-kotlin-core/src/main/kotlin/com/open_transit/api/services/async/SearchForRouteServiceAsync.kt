// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.SearchForRouteListParams
import com.open_transit.api.models.SearchForRouteListResponse

interface SearchForRouteServiceAsync {

    /** Search for a route based on its name. */
    suspend fun list(
        params: SearchForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SearchForRouteListResponse
}
