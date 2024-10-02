// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.models.*

class StopIdsForAgencyListParamsTest {

    @Test
    fun createStopIdsForAgencyListParams() {
        StopIdsForAgencyListParams.builder().agencyId("agencyID").build()
    }

    @Test
    fun getPathParam() {
        val params = StopIdsForAgencyListParams.builder().agencyId("agencyID").build()
        assertThat(params).isNotNull
        // path param "agencyId"
        assertThat(params.getPathParam(0)).isEqualTo("agencyID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}