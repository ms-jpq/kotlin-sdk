// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.blocking

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.TripRetrieveParams
import com.open_transit.api.models.TripRetrieveResponse

interface TripService {

    /** Get details of a specific trip */
    fun retrieve(
        params: TripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripRetrieveResponse
}
