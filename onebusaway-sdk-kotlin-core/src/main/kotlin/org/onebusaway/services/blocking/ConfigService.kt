// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.ConfigRetrieveParams
import org.onebusaway.models.ConfigRetrieveResponse

interface ConfigService {

    /** config */
    fun retrieve(
        params: ConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ConfigRetrieveResponse
}
