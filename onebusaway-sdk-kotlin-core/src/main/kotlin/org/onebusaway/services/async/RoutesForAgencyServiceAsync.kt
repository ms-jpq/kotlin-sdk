// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.RoutesForAgencyListParams
import org.onebusaway.models.RoutesForAgencyListResponse

interface RoutesForAgencyServiceAsync {

    /** Retrieve the list of all routes for a particular agency by id */
    suspend fun list(
        params: RoutesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RoutesForAgencyListResponse
}
