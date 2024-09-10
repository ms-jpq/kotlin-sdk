// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.client

import com.open_transit.api.models.*
import com.open_transit.api.services.async.*

interface OnebusawaySdkClientAsync {

    fun sync(): OnebusawaySdkClient

    fun agenciesWithCoverage(): AgenciesWithCoverageServiceAsync

    fun agency(): AgencyServiceAsync

    fun vehiclesForAgency(): VehiclesForAgencyServiceAsync

    fun config(): ConfigServiceAsync

    fun currentTime(): CurrentTimeServiceAsync

    fun stopsForLocation(): StopsForLocationServiceAsync

    fun stopsForRoute(): StopsForRouteServiceAsync

    fun stop(): StopServiceAsync

    fun stopIdsForAgency(): StopIdsForAgencyServiceAsync

    fun scheduleForStop(): ScheduleForStopServiceAsync

    fun route(): RouteServiceAsync

    fun routeIdsForAgency(): RouteIdsForAgencyServiceAsync

    fun routesForLocation(): RoutesForLocationServiceAsync

    fun routesForAgency(): RoutesForAgencyServiceAsync

    fun scheduleForRoute(): ScheduleForRouteServiceAsync

    fun arrivalAndDeparture(): ArrivalAndDepartureServiceAsync

    fun trip(): TripServiceAsync

    fun tripsForLocation(): TripsForLocationServiceAsync

    fun tripDetails(): TripDetailServiceAsync

    fun tripForVehicle(): TripForVehicleServiceAsync

    fun tripsForRoute(): TripsForRouteServiceAsync

    fun reportProblemWithStop(): ReportProblemWithStopServiceAsync

    fun reportProblemWithTrip(): ReportProblemWithTripServiceAsync

    fun searchForStop(): SearchForStopServiceAsync

    fun searchForRoute(): SearchForRouteServiceAsync

    fun block(): BlockServiceAsync

    fun shape(): ShapeServiceAsync
}
