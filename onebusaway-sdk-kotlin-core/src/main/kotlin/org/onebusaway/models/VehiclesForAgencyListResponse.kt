// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import org.onebusaway.core.ExcludeMissing
import org.onebusaway.core.JsonField
import org.onebusaway.core.JsonMissing
import org.onebusaway.core.JsonValue
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toUnmodifiable

@JsonDeserialize(builder = VehiclesForAgencyListResponse.Builder::class)
@NoAutoDetect
class VehiclesForAgencyListResponse
private constructor(
    private val code: JsonField<Long>,
    private val currentTime: JsonField<Long>,
    private val text: JsonField<String>,
    private val version: JsonField<Long>,
    private val data: JsonField<Data>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun code(): Long = code.getRequired("code")

    fun currentTime(): Long = currentTime.getRequired("currentTime")

    fun text(): String = text.getRequired("text")

    fun version(): Long = version.getRequired("version")

    fun data(): Data = data.getRequired("data")

    fun toResponseWrapper(): ResponseWrapper =
        ResponseWrapper.builder()
            .code(code)
            .currentTime(currentTime)
            .text(text)
            .version(version)
            .build()

    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("currentTime") @ExcludeMissing fun _currentTime() = currentTime

    @JsonProperty("text") @ExcludeMissing fun _text() = text

    @JsonProperty("version") @ExcludeMissing fun _version() = version

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): VehiclesForAgencyListResponse = apply {
        if (!validated) {
            code()
            currentTime()
            text()
            version()
            data().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var code: JsonField<Long> = JsonMissing.of()
        private var currentTime: JsonField<Long> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(vehiclesForAgencyListResponse: VehiclesForAgencyListResponse) = apply {
            this.code = vehiclesForAgencyListResponse.code
            this.currentTime = vehiclesForAgencyListResponse.currentTime
            this.text = vehiclesForAgencyListResponse.text
            this.version = vehiclesForAgencyListResponse.version
            this.data = vehiclesForAgencyListResponse.data
            additionalProperties(vehiclesForAgencyListResponse.additionalProperties)
        }

        fun code(code: Long) = code(JsonField.of(code))

        @JsonProperty("code")
        @ExcludeMissing
        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun currentTime(currentTime: Long) = currentTime(JsonField.of(currentTime))

        @JsonProperty("currentTime")
        @ExcludeMissing
        fun currentTime(currentTime: JsonField<Long>) = apply { this.currentTime = currentTime }

        fun text(text: String) = text(JsonField.of(text))

        @JsonProperty("text")
        @ExcludeMissing
        fun text(text: JsonField<String>) = apply { this.text = text }

        fun version(version: Long) = version(JsonField.of(version))

        @JsonProperty("version")
        @ExcludeMissing
        fun version(version: JsonField<Long>) = apply { this.version = version }

        fun data(data: Data) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): VehiclesForAgencyListResponse =
            VehiclesForAgencyListResponse(
                code,
                currentTime,
                text,
                version,
                data,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val list: JsonField<List<List>>,
        private val limitExceeded: JsonField<Boolean>,
        private val references: JsonField<References>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun list(): List<List> = list.getRequired("list")

        fun limitExceeded(): Boolean = limitExceeded.getRequired("limitExceeded")

        fun references(): References = references.getRequired("references")

        @JsonProperty("list") @ExcludeMissing fun _list() = list

        @JsonProperty("limitExceeded") @ExcludeMissing fun _limitExceeded() = limitExceeded

        @JsonProperty("references") @ExcludeMissing fun _references() = references

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                list().forEach { it.validate() }
                limitExceeded()
                references().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var list: JsonField<List<List>> = JsonMissing.of()
            private var limitExceeded: JsonField<Boolean> = JsonMissing.of()
            private var references: JsonField<References> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                this.list = data.list
                this.limitExceeded = data.limitExceeded
                this.references = data.references
                additionalProperties(data.additionalProperties)
            }

            fun list(list: List<List>) = list(JsonField.of(list))

            @JsonProperty("list")
            @ExcludeMissing
            fun list(list: JsonField<List<List>>) = apply { this.list = list }

            fun limitExceeded(limitExceeded: Boolean) = limitExceeded(JsonField.of(limitExceeded))

            @JsonProperty("limitExceeded")
            @ExcludeMissing
            fun limitExceeded(limitExceeded: JsonField<Boolean>) = apply {
                this.limitExceeded = limitExceeded
            }

            fun references(references: References) = references(JsonField.of(references))

            @JsonProperty("references")
            @ExcludeMissing
            fun references(references: JsonField<References>) = apply {
                this.references = references
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Data =
                Data(
                    list.map { it.toUnmodifiable() },
                    limitExceeded,
                    references,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = List.Builder::class)
        @NoAutoDetect
        class List
        private constructor(
            private val vehicleId: JsonField<String>,
            private val lastUpdateTime: JsonField<Long>,
            private val lastLocationUpdateTime: JsonField<Long>,
            private val location: JsonField<Location>,
            private val tripId: JsonField<String>,
            private val tripStatus: JsonField<TripStatus>,
            private val occupancyCapacity: JsonField<Long>,
            private val occupancyCount: JsonField<Long>,
            private val occupancyStatus: JsonField<String>,
            private val phase: JsonField<String>,
            private val status: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun vehicleId(): String = vehicleId.getRequired("vehicleId")

            fun lastUpdateTime(): Long = lastUpdateTime.getRequired("lastUpdateTime")

            fun lastLocationUpdateTime(): Long =
                lastLocationUpdateTime.getRequired("lastLocationUpdateTime")

            fun location(): Location = location.getRequired("location")

            fun tripId(): String = tripId.getRequired("tripId")

            fun tripStatus(): TripStatus = tripStatus.getRequired("tripStatus")

            fun occupancyCapacity(): Long? = occupancyCapacity.getNullable("occupancyCapacity")

            fun occupancyCount(): Long? = occupancyCount.getNullable("occupancyCount")

            fun occupancyStatus(): String? = occupancyStatus.getNullable("occupancyStatus")

            fun phase(): String? = phase.getNullable("phase")

            fun status(): String? = status.getNullable("status")

            @JsonProperty("vehicleId") @ExcludeMissing fun _vehicleId() = vehicleId

            @JsonProperty("lastUpdateTime") @ExcludeMissing fun _lastUpdateTime() = lastUpdateTime

            @JsonProperty("lastLocationUpdateTime")
            @ExcludeMissing
            fun _lastLocationUpdateTime() = lastLocationUpdateTime

            @JsonProperty("location") @ExcludeMissing fun _location() = location

            @JsonProperty("tripId") @ExcludeMissing fun _tripId() = tripId

            @JsonProperty("tripStatus") @ExcludeMissing fun _tripStatus() = tripStatus

            @JsonProperty("occupancyCapacity")
            @ExcludeMissing
            fun _occupancyCapacity() = occupancyCapacity

            @JsonProperty("occupancyCount") @ExcludeMissing fun _occupancyCount() = occupancyCount

            @JsonProperty("occupancyStatus")
            @ExcludeMissing
            fun _occupancyStatus() = occupancyStatus

            @JsonProperty("phase") @ExcludeMissing fun _phase() = phase

            @JsonProperty("status") @ExcludeMissing fun _status() = status

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): List = apply {
                if (!validated) {
                    vehicleId()
                    lastUpdateTime()
                    lastLocationUpdateTime()
                    location().validate()
                    tripId()
                    tripStatus().validate()
                    occupancyCapacity()
                    occupancyCount()
                    occupancyStatus()
                    phase()
                    status()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var vehicleId: JsonField<String> = JsonMissing.of()
                private var lastUpdateTime: JsonField<Long> = JsonMissing.of()
                private var lastLocationUpdateTime: JsonField<Long> = JsonMissing.of()
                private var location: JsonField<Location> = JsonMissing.of()
                private var tripId: JsonField<String> = JsonMissing.of()
                private var tripStatus: JsonField<TripStatus> = JsonMissing.of()
                private var occupancyCapacity: JsonField<Long> = JsonMissing.of()
                private var occupancyCount: JsonField<Long> = JsonMissing.of()
                private var occupancyStatus: JsonField<String> = JsonMissing.of()
                private var phase: JsonField<String> = JsonMissing.of()
                private var status: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(list: List) = apply {
                    this.vehicleId = list.vehicleId
                    this.lastUpdateTime = list.lastUpdateTime
                    this.lastLocationUpdateTime = list.lastLocationUpdateTime
                    this.location = list.location
                    this.tripId = list.tripId
                    this.tripStatus = list.tripStatus
                    this.occupancyCapacity = list.occupancyCapacity
                    this.occupancyCount = list.occupancyCount
                    this.occupancyStatus = list.occupancyStatus
                    this.phase = list.phase
                    this.status = list.status
                    additionalProperties(list.additionalProperties)
                }

                fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

                @JsonProperty("vehicleId")
                @ExcludeMissing
                fun vehicleId(vehicleId: JsonField<String>) = apply { this.vehicleId = vehicleId }

                fun lastUpdateTime(lastUpdateTime: Long) =
                    lastUpdateTime(JsonField.of(lastUpdateTime))

                @JsonProperty("lastUpdateTime")
                @ExcludeMissing
                fun lastUpdateTime(lastUpdateTime: JsonField<Long>) = apply {
                    this.lastUpdateTime = lastUpdateTime
                }

                fun lastLocationUpdateTime(lastLocationUpdateTime: Long) =
                    lastLocationUpdateTime(JsonField.of(lastLocationUpdateTime))

                @JsonProperty("lastLocationUpdateTime")
                @ExcludeMissing
                fun lastLocationUpdateTime(lastLocationUpdateTime: JsonField<Long>) = apply {
                    this.lastLocationUpdateTime = lastLocationUpdateTime
                }

                fun location(location: Location) = location(JsonField.of(location))

                @JsonProperty("location")
                @ExcludeMissing
                fun location(location: JsonField<Location>) = apply { this.location = location }

                fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                @JsonProperty("tripId")
                @ExcludeMissing
                fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

                fun tripStatus(tripStatus: TripStatus) = tripStatus(JsonField.of(tripStatus))

                @JsonProperty("tripStatus")
                @ExcludeMissing
                fun tripStatus(tripStatus: JsonField<TripStatus>) = apply {
                    this.tripStatus = tripStatus
                }

                fun occupancyCapacity(occupancyCapacity: Long) =
                    occupancyCapacity(JsonField.of(occupancyCapacity))

                @JsonProperty("occupancyCapacity")
                @ExcludeMissing
                fun occupancyCapacity(occupancyCapacity: JsonField<Long>) = apply {
                    this.occupancyCapacity = occupancyCapacity
                }

                fun occupancyCount(occupancyCount: Long) =
                    occupancyCount(JsonField.of(occupancyCount))

                @JsonProperty("occupancyCount")
                @ExcludeMissing
                fun occupancyCount(occupancyCount: JsonField<Long>) = apply {
                    this.occupancyCount = occupancyCount
                }

                fun occupancyStatus(occupancyStatus: String) =
                    occupancyStatus(JsonField.of(occupancyStatus))

                @JsonProperty("occupancyStatus")
                @ExcludeMissing
                fun occupancyStatus(occupancyStatus: JsonField<String>) = apply {
                    this.occupancyStatus = occupancyStatus
                }

                fun phase(phase: String) = phase(JsonField.of(phase))

                @JsonProperty("phase")
                @ExcludeMissing
                fun phase(phase: JsonField<String>) = apply { this.phase = phase }

                fun status(status: String) = status(JsonField.of(status))

                @JsonProperty("status")
                @ExcludeMissing
                fun status(status: JsonField<String>) = apply { this.status = status }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): List =
                    List(
                        vehicleId,
                        lastUpdateTime,
                        lastLocationUpdateTime,
                        location,
                        tripId,
                        tripStatus,
                        occupancyCapacity,
                        occupancyCount,
                        occupancyStatus,
                        phase,
                        status,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = Location.Builder::class)
            @NoAutoDetect
            class Location
            private constructor(
                private val lat: JsonField<Double>,
                private val lon: JsonField<Double>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun lat(): Double? = lat.getNullable("lat")

                fun lon(): Double? = lon.getNullable("lon")

                @JsonProperty("lat") @ExcludeMissing fun _lat() = lat

                @JsonProperty("lon") @ExcludeMissing fun _lon() = lon

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Location = apply {
                    if (!validated) {
                        lat()
                        lon()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var lat: JsonField<Double> = JsonMissing.of()
                    private var lon: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(location: Location) = apply {
                        this.lat = location.lat
                        this.lon = location.lon
                        additionalProperties(location.additionalProperties)
                    }

                    fun lat(lat: Double) = lat(JsonField.of(lat))

                    @JsonProperty("lat")
                    @ExcludeMissing
                    fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                    fun lon(lon: Double) = lon(JsonField.of(lon))

                    @JsonProperty("lon")
                    @ExcludeMissing
                    fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Location =
                        Location(
                            lat,
                            lon,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Location &&
                        this.lat == other.lat &&
                        this.lon == other.lon &&
                        this.additionalProperties == other.additionalProperties
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                lat,
                                lon,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Location{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = TripStatus.Builder::class)
            @NoAutoDetect
            class TripStatus
            private constructor(
                private val activeTripId: JsonField<String>,
                private val blockTripSequence: JsonField<Long>,
                private val closestStop: JsonField<String>,
                private val closestStopTimeOffset: JsonField<Long>,
                private val distanceAlongTrip: JsonField<Double>,
                private val frequency: JsonField<String>,
                private val lastKnownDistanceAlongTrip: JsonField<Double>,
                private val lastKnownLocation: JsonField<LastKnownLocation>,
                private val lastKnownOrientation: JsonField<Double>,
                private val lastLocationUpdateTime: JsonField<Long>,
                private val lastUpdateTime: JsonField<Long>,
                private val nextStop: JsonField<String>,
                private val nextStopTimeOffset: JsonField<Long>,
                private val occupancyCapacity: JsonField<Long>,
                private val occupancyCount: JsonField<Long>,
                private val occupancyStatus: JsonField<String>,
                private val orientation: JsonField<Double>,
                private val phase: JsonField<String>,
                private val position: JsonField<Position>,
                private val predicted: JsonField<Boolean>,
                private val scheduleDeviation: JsonField<Long>,
                private val scheduledDistanceAlongTrip: JsonField<Double>,
                private val serviceDate: JsonField<Long>,
                private val situationIds: JsonField<List<String>>,
                private val status: JsonField<String>,
                private val totalDistanceAlongTrip: JsonField<Double>,
                private val vehicleId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** Trip ID of the trip the vehicle is actively serving. */
                fun activeTripId(): String = activeTripId.getRequired("activeTripId")

                /** Index of the active trip into the sequence of trips for the active block. */
                fun blockTripSequence(): Long = blockTripSequence.getRequired("blockTripSequence")

                /** ID of the closest stop to the current location of the transit vehicle. */
                fun closestStop(): String = closestStop.getRequired("closestStop")

                /**
                 * Time offset from the closest stop to the current position of the transit vehicle
                 * (in seconds).
                 */
                fun closestStopTimeOffset(): Long? =
                    closestStopTimeOffset.getNullable("closestStopTimeOffset")

                /**
                 * Distance, in meters, the transit vehicle has progressed along the active trip.
                 */
                fun distanceAlongTrip(): Double = distanceAlongTrip.getRequired("distanceAlongTrip")

                /** Information about frequency-based scheduling, if applicable to the trip. */
                fun frequency(): String? = frequency.getNullable("frequency")

                /**
                 * Last known distance along the trip received in real-time from the transit
                 * vehicle.
                 */
                fun lastKnownDistanceAlongTrip(): Double =
                    lastKnownDistanceAlongTrip.getRequired("lastKnownDistanceAlongTrip")

                /** Last known location of the transit vehicle. */
                fun lastKnownLocation(): LastKnownLocation? =
                    lastKnownLocation.getNullable("lastKnownLocation")

                /** Last known orientation value received in real-time from the transit vehicle. */
                fun lastKnownOrientation(): Double? =
                    lastKnownOrientation.getNullable("lastKnownOrientation")

                /**
                 * Timestamp of the last known real-time location update from the transit vehicle.
                 */
                fun lastLocationUpdateTime(): Long =
                    lastLocationUpdateTime.getRequired("lastLocationUpdateTime")

                /** Timestamp of the last known real-time update from the transit vehicle. */
                fun lastUpdateTime(): Long = lastUpdateTime.getRequired("lastUpdateTime")

                /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                fun nextStop(): String? = nextStop.getNullable("nextStop")

                /**
                 * Time offset from the next stop to the current position of the transit vehicle (in
                 * seconds).
                 */
                fun nextStopTimeOffset(): Long? =
                    nextStopTimeOffset.getNullable("nextStopTimeOffset")

                /** Capacity of the transit vehicle in terms of occupancy. */
                fun occupancyCapacity(): Long = occupancyCapacity.getRequired("occupancyCapacity")

                /** Current count of occupants in the transit vehicle. */
                fun occupancyCount(): Long = occupancyCount.getRequired("occupancyCount")

                /** Current occupancy status of the transit vehicle. */
                fun occupancyStatus(): String = occupancyStatus.getRequired("occupancyStatus")

                /** Orientation of the transit vehicle, represented as an angle in degrees. */
                fun orientation(): Double? = orientation.getNullable("orientation")

                /** Current journey phase of the trip. */
                fun phase(): String = phase.getRequired("phase")

                /** Current position of the transit vehicle. */
                fun position(): Position? = position.getNullable("position")

                /** Indicates if real-time arrival info is available for this trip. */
                fun predicted(): Boolean = predicted.getRequired("predicted")

                /**
                 * Deviation from the schedule in seconds (positive for late, negative for early).
                 */
                fun scheduleDeviation(): Long = scheduleDeviation.getRequired("scheduleDeviation")

                /**
                 * Distance, in meters, the transit vehicle is scheduled to have progressed along
                 * the active trip.
                 */
                fun scheduledDistanceAlongTrip(): Double? =
                    scheduledDistanceAlongTrip.getNullable("scheduledDistanceAlongTrip")

                /**
                 * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                 * service date for the trip.
                 */
                fun serviceDate(): Long = serviceDate.getRequired("serviceDate")

                /** References to situation elements (if any) applicable to this trip. */
                fun situationIds(): List<String>? = situationIds.getNullable("situationIds")

                /** Current status modifiers for the trip. */
                fun status(): String = status.getRequired("status")

                /** Total length of the trip, in meters. */
                fun totalDistanceAlongTrip(): Double =
                    totalDistanceAlongTrip.getRequired("totalDistanceAlongTrip")

                /** ID of the transit vehicle currently serving the trip. */
                fun vehicleId(): String? = vehicleId.getNullable("vehicleId")

                /** Trip ID of the trip the vehicle is actively serving. */
                @JsonProperty("activeTripId") @ExcludeMissing fun _activeTripId() = activeTripId

                /** Index of the active trip into the sequence of trips for the active block. */
                @JsonProperty("blockTripSequence")
                @ExcludeMissing
                fun _blockTripSequence() = blockTripSequence

                /** ID of the closest stop to the current location of the transit vehicle. */
                @JsonProperty("closestStop") @ExcludeMissing fun _closestStop() = closestStop

                /**
                 * Time offset from the closest stop to the current position of the transit vehicle
                 * (in seconds).
                 */
                @JsonProperty("closestStopTimeOffset")
                @ExcludeMissing
                fun _closestStopTimeOffset() = closestStopTimeOffset

                /**
                 * Distance, in meters, the transit vehicle has progressed along the active trip.
                 */
                @JsonProperty("distanceAlongTrip")
                @ExcludeMissing
                fun _distanceAlongTrip() = distanceAlongTrip

                /** Information about frequency-based scheduling, if applicable to the trip. */
                @JsonProperty("frequency") @ExcludeMissing fun _frequency() = frequency

                /**
                 * Last known distance along the trip received in real-time from the transit
                 * vehicle.
                 */
                @JsonProperty("lastKnownDistanceAlongTrip")
                @ExcludeMissing
                fun _lastKnownDistanceAlongTrip() = lastKnownDistanceAlongTrip

                /** Last known location of the transit vehicle. */
                @JsonProperty("lastKnownLocation")
                @ExcludeMissing
                fun _lastKnownLocation() = lastKnownLocation

                /** Last known orientation value received in real-time from the transit vehicle. */
                @JsonProperty("lastKnownOrientation")
                @ExcludeMissing
                fun _lastKnownOrientation() = lastKnownOrientation

                /**
                 * Timestamp of the last known real-time location update from the transit vehicle.
                 */
                @JsonProperty("lastLocationUpdateTime")
                @ExcludeMissing
                fun _lastLocationUpdateTime() = lastLocationUpdateTime

                /** Timestamp of the last known real-time update from the transit vehicle. */
                @JsonProperty("lastUpdateTime")
                @ExcludeMissing
                fun _lastUpdateTime() = lastUpdateTime

                /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                @JsonProperty("nextStop") @ExcludeMissing fun _nextStop() = nextStop

                /**
                 * Time offset from the next stop to the current position of the transit vehicle (in
                 * seconds).
                 */
                @JsonProperty("nextStopTimeOffset")
                @ExcludeMissing
                fun _nextStopTimeOffset() = nextStopTimeOffset

                /** Capacity of the transit vehicle in terms of occupancy. */
                @JsonProperty("occupancyCapacity")
                @ExcludeMissing
                fun _occupancyCapacity() = occupancyCapacity

                /** Current count of occupants in the transit vehicle. */
                @JsonProperty("occupancyCount")
                @ExcludeMissing
                fun _occupancyCount() = occupancyCount

                /** Current occupancy status of the transit vehicle. */
                @JsonProperty("occupancyStatus")
                @ExcludeMissing
                fun _occupancyStatus() = occupancyStatus

                /** Orientation of the transit vehicle, represented as an angle in degrees. */
                @JsonProperty("orientation") @ExcludeMissing fun _orientation() = orientation

                /** Current journey phase of the trip. */
                @JsonProperty("phase") @ExcludeMissing fun _phase() = phase

                /** Current position of the transit vehicle. */
                @JsonProperty("position") @ExcludeMissing fun _position() = position

                /** Indicates if real-time arrival info is available for this trip. */
                @JsonProperty("predicted") @ExcludeMissing fun _predicted() = predicted

                /**
                 * Deviation from the schedule in seconds (positive for late, negative for early).
                 */
                @JsonProperty("scheduleDeviation")
                @ExcludeMissing
                fun _scheduleDeviation() = scheduleDeviation

                /**
                 * Distance, in meters, the transit vehicle is scheduled to have progressed along
                 * the active trip.
                 */
                @JsonProperty("scheduledDistanceAlongTrip")
                @ExcludeMissing
                fun _scheduledDistanceAlongTrip() = scheduledDistanceAlongTrip

                /**
                 * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                 * service date for the trip.
                 */
                @JsonProperty("serviceDate") @ExcludeMissing fun _serviceDate() = serviceDate

                /** References to situation elements (if any) applicable to this trip. */
                @JsonProperty("situationIds") @ExcludeMissing fun _situationIds() = situationIds

                /** Current status modifiers for the trip. */
                @JsonProperty("status") @ExcludeMissing fun _status() = status

                /** Total length of the trip, in meters. */
                @JsonProperty("totalDistanceAlongTrip")
                @ExcludeMissing
                fun _totalDistanceAlongTrip() = totalDistanceAlongTrip

                /** ID of the transit vehicle currently serving the trip. */
                @JsonProperty("vehicleId") @ExcludeMissing fun _vehicleId() = vehicleId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): TripStatus = apply {
                    if (!validated) {
                        activeTripId()
                        blockTripSequence()
                        closestStop()
                        closestStopTimeOffset()
                        distanceAlongTrip()
                        frequency()
                        lastKnownDistanceAlongTrip()
                        lastKnownLocation()?.validate()
                        lastKnownOrientation()
                        lastLocationUpdateTime()
                        lastUpdateTime()
                        nextStop()
                        nextStopTimeOffset()
                        occupancyCapacity()
                        occupancyCount()
                        occupancyStatus()
                        orientation()
                        phase()
                        position()?.validate()
                        predicted()
                        scheduleDeviation()
                        scheduledDistanceAlongTrip()
                        serviceDate()
                        situationIds()
                        status()
                        totalDistanceAlongTrip()
                        vehicleId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var activeTripId: JsonField<String> = JsonMissing.of()
                    private var blockTripSequence: JsonField<Long> = JsonMissing.of()
                    private var closestStop: JsonField<String> = JsonMissing.of()
                    private var closestStopTimeOffset: JsonField<Long> = JsonMissing.of()
                    private var distanceAlongTrip: JsonField<Double> = JsonMissing.of()
                    private var frequency: JsonField<String> = JsonMissing.of()
                    private var lastKnownDistanceAlongTrip: JsonField<Double> = JsonMissing.of()
                    private var lastKnownLocation: JsonField<LastKnownLocation> = JsonMissing.of()
                    private var lastKnownOrientation: JsonField<Double> = JsonMissing.of()
                    private var lastLocationUpdateTime: JsonField<Long> = JsonMissing.of()
                    private var lastUpdateTime: JsonField<Long> = JsonMissing.of()
                    private var nextStop: JsonField<String> = JsonMissing.of()
                    private var nextStopTimeOffset: JsonField<Long> = JsonMissing.of()
                    private var occupancyCapacity: JsonField<Long> = JsonMissing.of()
                    private var occupancyCount: JsonField<Long> = JsonMissing.of()
                    private var occupancyStatus: JsonField<String> = JsonMissing.of()
                    private var orientation: JsonField<Double> = JsonMissing.of()
                    private var phase: JsonField<String> = JsonMissing.of()
                    private var position: JsonField<Position> = JsonMissing.of()
                    private var predicted: JsonField<Boolean> = JsonMissing.of()
                    private var scheduleDeviation: JsonField<Long> = JsonMissing.of()
                    private var scheduledDistanceAlongTrip: JsonField<Double> = JsonMissing.of()
                    private var serviceDate: JsonField<Long> = JsonMissing.of()
                    private var situationIds: JsonField<List<String>> = JsonMissing.of()
                    private var status: JsonField<String> = JsonMissing.of()
                    private var totalDistanceAlongTrip: JsonField<Double> = JsonMissing.of()
                    private var vehicleId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tripStatus: TripStatus) = apply {
                        this.activeTripId = tripStatus.activeTripId
                        this.blockTripSequence = tripStatus.blockTripSequence
                        this.closestStop = tripStatus.closestStop
                        this.closestStopTimeOffset = tripStatus.closestStopTimeOffset
                        this.distanceAlongTrip = tripStatus.distanceAlongTrip
                        this.frequency = tripStatus.frequency
                        this.lastKnownDistanceAlongTrip = tripStatus.lastKnownDistanceAlongTrip
                        this.lastKnownLocation = tripStatus.lastKnownLocation
                        this.lastKnownOrientation = tripStatus.lastKnownOrientation
                        this.lastLocationUpdateTime = tripStatus.lastLocationUpdateTime
                        this.lastUpdateTime = tripStatus.lastUpdateTime
                        this.nextStop = tripStatus.nextStop
                        this.nextStopTimeOffset = tripStatus.nextStopTimeOffset
                        this.occupancyCapacity = tripStatus.occupancyCapacity
                        this.occupancyCount = tripStatus.occupancyCount
                        this.occupancyStatus = tripStatus.occupancyStatus
                        this.orientation = tripStatus.orientation
                        this.phase = tripStatus.phase
                        this.position = tripStatus.position
                        this.predicted = tripStatus.predicted
                        this.scheduleDeviation = tripStatus.scheduleDeviation
                        this.scheduledDistanceAlongTrip = tripStatus.scheduledDistanceAlongTrip
                        this.serviceDate = tripStatus.serviceDate
                        this.situationIds = tripStatus.situationIds
                        this.status = tripStatus.status
                        this.totalDistanceAlongTrip = tripStatus.totalDistanceAlongTrip
                        this.vehicleId = tripStatus.vehicleId
                        additionalProperties(tripStatus.additionalProperties)
                    }

                    /** Trip ID of the trip the vehicle is actively serving. */
                    fun activeTripId(activeTripId: String) =
                        activeTripId(JsonField.of(activeTripId))

                    /** Trip ID of the trip the vehicle is actively serving. */
                    @JsonProperty("activeTripId")
                    @ExcludeMissing
                    fun activeTripId(activeTripId: JsonField<String>) = apply {
                        this.activeTripId = activeTripId
                    }

                    /** Index of the active trip into the sequence of trips for the active block. */
                    fun blockTripSequence(blockTripSequence: Long) =
                        blockTripSequence(JsonField.of(blockTripSequence))

                    /** Index of the active trip into the sequence of trips for the active block. */
                    @JsonProperty("blockTripSequence")
                    @ExcludeMissing
                    fun blockTripSequence(blockTripSequence: JsonField<Long>) = apply {
                        this.blockTripSequence = blockTripSequence
                    }

                    /** ID of the closest stop to the current location of the transit vehicle. */
                    fun closestStop(closestStop: String) = closestStop(JsonField.of(closestStop))

                    /** ID of the closest stop to the current location of the transit vehicle. */
                    @JsonProperty("closestStop")
                    @ExcludeMissing
                    fun closestStop(closestStop: JsonField<String>) = apply {
                        this.closestStop = closestStop
                    }

                    /**
                     * Time offset from the closest stop to the current position of the transit
                     * vehicle (in seconds).
                     */
                    fun closestStopTimeOffset(closestStopTimeOffset: Long) =
                        closestStopTimeOffset(JsonField.of(closestStopTimeOffset))

                    /**
                     * Time offset from the closest stop to the current position of the transit
                     * vehicle (in seconds).
                     */
                    @JsonProperty("closestStopTimeOffset")
                    @ExcludeMissing
                    fun closestStopTimeOffset(closestStopTimeOffset: JsonField<Long>) = apply {
                        this.closestStopTimeOffset = closestStopTimeOffset
                    }

                    /**
                     * Distance, in meters, the transit vehicle has progressed along the active
                     * trip.
                     */
                    fun distanceAlongTrip(distanceAlongTrip: Double) =
                        distanceAlongTrip(JsonField.of(distanceAlongTrip))

                    /**
                     * Distance, in meters, the transit vehicle has progressed along the active
                     * trip.
                     */
                    @JsonProperty("distanceAlongTrip")
                    @ExcludeMissing
                    fun distanceAlongTrip(distanceAlongTrip: JsonField<Double>) = apply {
                        this.distanceAlongTrip = distanceAlongTrip
                    }

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    fun frequency(frequency: String) = frequency(JsonField.of(frequency))

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    @JsonProperty("frequency")
                    @ExcludeMissing
                    fun frequency(frequency: JsonField<String>) = apply {
                        this.frequency = frequency
                    }

                    /**
                     * Last known distance along the trip received in real-time from the transit
                     * vehicle.
                     */
                    fun lastKnownDistanceAlongTrip(lastKnownDistanceAlongTrip: Double) =
                        lastKnownDistanceAlongTrip(JsonField.of(lastKnownDistanceAlongTrip))

                    /**
                     * Last known distance along the trip received in real-time from the transit
                     * vehicle.
                     */
                    @JsonProperty("lastKnownDistanceAlongTrip")
                    @ExcludeMissing
                    fun lastKnownDistanceAlongTrip(lastKnownDistanceAlongTrip: JsonField<Double>) =
                        apply {
                            this.lastKnownDistanceAlongTrip = lastKnownDistanceAlongTrip
                        }

                    /** Last known location of the transit vehicle. */
                    fun lastKnownLocation(lastKnownLocation: LastKnownLocation) =
                        lastKnownLocation(JsonField.of(lastKnownLocation))

                    /** Last known location of the transit vehicle. */
                    @JsonProperty("lastKnownLocation")
                    @ExcludeMissing
                    fun lastKnownLocation(lastKnownLocation: JsonField<LastKnownLocation>) = apply {
                        this.lastKnownLocation = lastKnownLocation
                    }

                    /**
                     * Last known orientation value received in real-time from the transit vehicle.
                     */
                    fun lastKnownOrientation(lastKnownOrientation: Double) =
                        lastKnownOrientation(JsonField.of(lastKnownOrientation))

                    /**
                     * Last known orientation value received in real-time from the transit vehicle.
                     */
                    @JsonProperty("lastKnownOrientation")
                    @ExcludeMissing
                    fun lastKnownOrientation(lastKnownOrientation: JsonField<Double>) = apply {
                        this.lastKnownOrientation = lastKnownOrientation
                    }

                    /**
                     * Timestamp of the last known real-time location update from the transit
                     * vehicle.
                     */
                    fun lastLocationUpdateTime(lastLocationUpdateTime: Long) =
                        lastLocationUpdateTime(JsonField.of(lastLocationUpdateTime))

                    /**
                     * Timestamp of the last known real-time location update from the transit
                     * vehicle.
                     */
                    @JsonProperty("lastLocationUpdateTime")
                    @ExcludeMissing
                    fun lastLocationUpdateTime(lastLocationUpdateTime: JsonField<Long>) = apply {
                        this.lastLocationUpdateTime = lastLocationUpdateTime
                    }

                    /** Timestamp of the last known real-time update from the transit vehicle. */
                    fun lastUpdateTime(lastUpdateTime: Long) =
                        lastUpdateTime(JsonField.of(lastUpdateTime))

                    /** Timestamp of the last known real-time update from the transit vehicle. */
                    @JsonProperty("lastUpdateTime")
                    @ExcludeMissing
                    fun lastUpdateTime(lastUpdateTime: JsonField<Long>) = apply {
                        this.lastUpdateTime = lastUpdateTime
                    }

                    /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                    fun nextStop(nextStop: String) = nextStop(JsonField.of(nextStop))

                    /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                    @JsonProperty("nextStop")
                    @ExcludeMissing
                    fun nextStop(nextStop: JsonField<String>) = apply { this.nextStop = nextStop }

                    /**
                     * Time offset from the next stop to the current position of the transit vehicle
                     * (in seconds).
                     */
                    fun nextStopTimeOffset(nextStopTimeOffset: Long) =
                        nextStopTimeOffset(JsonField.of(nextStopTimeOffset))

                    /**
                     * Time offset from the next stop to the current position of the transit vehicle
                     * (in seconds).
                     */
                    @JsonProperty("nextStopTimeOffset")
                    @ExcludeMissing
                    fun nextStopTimeOffset(nextStopTimeOffset: JsonField<Long>) = apply {
                        this.nextStopTimeOffset = nextStopTimeOffset
                    }

                    /** Capacity of the transit vehicle in terms of occupancy. */
                    fun occupancyCapacity(occupancyCapacity: Long) =
                        occupancyCapacity(JsonField.of(occupancyCapacity))

                    /** Capacity of the transit vehicle in terms of occupancy. */
                    @JsonProperty("occupancyCapacity")
                    @ExcludeMissing
                    fun occupancyCapacity(occupancyCapacity: JsonField<Long>) = apply {
                        this.occupancyCapacity = occupancyCapacity
                    }

                    /** Current count of occupants in the transit vehicle. */
                    fun occupancyCount(occupancyCount: Long) =
                        occupancyCount(JsonField.of(occupancyCount))

                    /** Current count of occupants in the transit vehicle. */
                    @JsonProperty("occupancyCount")
                    @ExcludeMissing
                    fun occupancyCount(occupancyCount: JsonField<Long>) = apply {
                        this.occupancyCount = occupancyCount
                    }

                    /** Current occupancy status of the transit vehicle. */
                    fun occupancyStatus(occupancyStatus: String) =
                        occupancyStatus(JsonField.of(occupancyStatus))

                    /** Current occupancy status of the transit vehicle. */
                    @JsonProperty("occupancyStatus")
                    @ExcludeMissing
                    fun occupancyStatus(occupancyStatus: JsonField<String>) = apply {
                        this.occupancyStatus = occupancyStatus
                    }

                    /** Orientation of the transit vehicle, represented as an angle in degrees. */
                    fun orientation(orientation: Double) = orientation(JsonField.of(orientation))

                    /** Orientation of the transit vehicle, represented as an angle in degrees. */
                    @JsonProperty("orientation")
                    @ExcludeMissing
                    fun orientation(orientation: JsonField<Double>) = apply {
                        this.orientation = orientation
                    }

                    /** Current journey phase of the trip. */
                    fun phase(phase: String) = phase(JsonField.of(phase))

                    /** Current journey phase of the trip. */
                    @JsonProperty("phase")
                    @ExcludeMissing
                    fun phase(phase: JsonField<String>) = apply { this.phase = phase }

                    /** Current position of the transit vehicle. */
                    fun position(position: Position) = position(JsonField.of(position))

                    /** Current position of the transit vehicle. */
                    @JsonProperty("position")
                    @ExcludeMissing
                    fun position(position: JsonField<Position>) = apply { this.position = position }

                    /** Indicates if real-time arrival info is available for this trip. */
                    fun predicted(predicted: Boolean) = predicted(JsonField.of(predicted))

                    /** Indicates if real-time arrival info is available for this trip. */
                    @JsonProperty("predicted")
                    @ExcludeMissing
                    fun predicted(predicted: JsonField<Boolean>) = apply {
                        this.predicted = predicted
                    }

                    /**
                     * Deviation from the schedule in seconds (positive for late, negative for
                     * early).
                     */
                    fun scheduleDeviation(scheduleDeviation: Long) =
                        scheduleDeviation(JsonField.of(scheduleDeviation))

                    /**
                     * Deviation from the schedule in seconds (positive for late, negative for
                     * early).
                     */
                    @JsonProperty("scheduleDeviation")
                    @ExcludeMissing
                    fun scheduleDeviation(scheduleDeviation: JsonField<Long>) = apply {
                        this.scheduleDeviation = scheduleDeviation
                    }

                    /**
                     * Distance, in meters, the transit vehicle is scheduled to have progressed
                     * along the active trip.
                     */
                    fun scheduledDistanceAlongTrip(scheduledDistanceAlongTrip: Double) =
                        scheduledDistanceAlongTrip(JsonField.of(scheduledDistanceAlongTrip))

                    /**
                     * Distance, in meters, the transit vehicle is scheduled to have progressed
                     * along the active trip.
                     */
                    @JsonProperty("scheduledDistanceAlongTrip")
                    @ExcludeMissing
                    fun scheduledDistanceAlongTrip(scheduledDistanceAlongTrip: JsonField<Double>) =
                        apply {
                            this.scheduledDistanceAlongTrip = scheduledDistanceAlongTrip
                        }

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    fun serviceDate(serviceDate: Long) = serviceDate(JsonField.of(serviceDate))

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    @JsonProperty("serviceDate")
                    @ExcludeMissing
                    fun serviceDate(serviceDate: JsonField<Long>) = apply {
                        this.serviceDate = serviceDate
                    }

                    /** References to situation elements (if any) applicable to this trip. */
                    fun situationIds(situationIds: List<String>) =
                        situationIds(JsonField.of(situationIds))

                    /** References to situation elements (if any) applicable to this trip. */
                    @JsonProperty("situationIds")
                    @ExcludeMissing
                    fun situationIds(situationIds: JsonField<List<String>>) = apply {
                        this.situationIds = situationIds
                    }

                    /** Current status modifiers for the trip. */
                    fun status(status: String) = status(JsonField.of(status))

                    /** Current status modifiers for the trip. */
                    @JsonProperty("status")
                    @ExcludeMissing
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    /** Total length of the trip, in meters. */
                    fun totalDistanceAlongTrip(totalDistanceAlongTrip: Double) =
                        totalDistanceAlongTrip(JsonField.of(totalDistanceAlongTrip))

                    /** Total length of the trip, in meters. */
                    @JsonProperty("totalDistanceAlongTrip")
                    @ExcludeMissing
                    fun totalDistanceAlongTrip(totalDistanceAlongTrip: JsonField<Double>) = apply {
                        this.totalDistanceAlongTrip = totalDistanceAlongTrip
                    }

                    /** ID of the transit vehicle currently serving the trip. */
                    fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

                    /** ID of the transit vehicle currently serving the trip. */
                    @JsonProperty("vehicleId")
                    @ExcludeMissing
                    fun vehicleId(vehicleId: JsonField<String>) = apply {
                        this.vehicleId = vehicleId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): TripStatus =
                        TripStatus(
                            activeTripId,
                            blockTripSequence,
                            closestStop,
                            closestStopTimeOffset,
                            distanceAlongTrip,
                            frequency,
                            lastKnownDistanceAlongTrip,
                            lastKnownLocation,
                            lastKnownOrientation,
                            lastLocationUpdateTime,
                            lastUpdateTime,
                            nextStop,
                            nextStopTimeOffset,
                            occupancyCapacity,
                            occupancyCount,
                            occupancyStatus,
                            orientation,
                            phase,
                            position,
                            predicted,
                            scheduleDeviation,
                            scheduledDistanceAlongTrip,
                            serviceDate,
                            situationIds.map { it.toUnmodifiable() },
                            status,
                            totalDistanceAlongTrip,
                            vehicleId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** Last known location of the transit vehicle. */
                @JsonDeserialize(builder = LastKnownLocation.Builder::class)
                @NoAutoDetect
                class LastKnownLocation
                private constructor(
                    private val lat: JsonField<Double>,
                    private val lon: JsonField<Double>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** Latitude of the last known location of the transit vehicle. */
                    fun lat(): Double? = lat.getNullable("lat")

                    /** Longitude of the last known location of the transit vehicle. */
                    fun lon(): Double? = lon.getNullable("lon")

                    /** Latitude of the last known location of the transit vehicle. */
                    @JsonProperty("lat") @ExcludeMissing fun _lat() = lat

                    /** Longitude of the last known location of the transit vehicle. */
                    @JsonProperty("lon") @ExcludeMissing fun _lon() = lon

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): LastKnownLocation = apply {
                        if (!validated) {
                            lat()
                            lon()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var lat: JsonField<Double> = JsonMissing.of()
                        private var lon: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(lastKnownLocation: LastKnownLocation) = apply {
                            this.lat = lastKnownLocation.lat
                            this.lon = lastKnownLocation.lon
                            additionalProperties(lastKnownLocation.additionalProperties)
                        }

                        /** Latitude of the last known location of the transit vehicle. */
                        fun lat(lat: Double) = lat(JsonField.of(lat))

                        /** Latitude of the last known location of the transit vehicle. */
                        @JsonProperty("lat")
                        @ExcludeMissing
                        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                        /** Longitude of the last known location of the transit vehicle. */
                        fun lon(lon: Double) = lon(JsonField.of(lon))

                        /** Longitude of the last known location of the transit vehicle. */
                        @JsonProperty("lon")
                        @ExcludeMissing
                        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): LastKnownLocation =
                            LastKnownLocation(
                                lat,
                                lon,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is LastKnownLocation &&
                            this.lat == other.lat &&
                            this.lon == other.lon &&
                            this.additionalProperties == other.additionalProperties
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    lat,
                                    lon,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "LastKnownLocation{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
                }

                /** Current position of the transit vehicle. */
                @JsonDeserialize(builder = Position.Builder::class)
                @NoAutoDetect
                class Position
                private constructor(
                    private val lat: JsonField<Double>,
                    private val lon: JsonField<Double>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** Latitude of the current position of the transit vehicle. */
                    fun lat(): Double? = lat.getNullable("lat")

                    /** Longitude of the current position of the transit vehicle. */
                    fun lon(): Double? = lon.getNullable("lon")

                    /** Latitude of the current position of the transit vehicle. */
                    @JsonProperty("lat") @ExcludeMissing fun _lat() = lat

                    /** Longitude of the current position of the transit vehicle. */
                    @JsonProperty("lon") @ExcludeMissing fun _lon() = lon

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Position = apply {
                        if (!validated) {
                            lat()
                            lon()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var lat: JsonField<Double> = JsonMissing.of()
                        private var lon: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(position: Position) = apply {
                            this.lat = position.lat
                            this.lon = position.lon
                            additionalProperties(position.additionalProperties)
                        }

                        /** Latitude of the current position of the transit vehicle. */
                        fun lat(lat: Double) = lat(JsonField.of(lat))

                        /** Latitude of the current position of the transit vehicle. */
                        @JsonProperty("lat")
                        @ExcludeMissing
                        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                        /** Longitude of the current position of the transit vehicle. */
                        fun lon(lon: Double) = lon(JsonField.of(lon))

                        /** Longitude of the current position of the transit vehicle. */
                        @JsonProperty("lon")
                        @ExcludeMissing
                        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Position =
                            Position(
                                lat,
                                lon,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Position &&
                            this.lat == other.lat &&
                            this.lon == other.lon &&
                            this.additionalProperties == other.additionalProperties
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    lat,
                                    lon,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Position{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TripStatus &&
                        this.activeTripId == other.activeTripId &&
                        this.blockTripSequence == other.blockTripSequence &&
                        this.closestStop == other.closestStop &&
                        this.closestStopTimeOffset == other.closestStopTimeOffset &&
                        this.distanceAlongTrip == other.distanceAlongTrip &&
                        this.frequency == other.frequency &&
                        this.lastKnownDistanceAlongTrip == other.lastKnownDistanceAlongTrip &&
                        this.lastKnownLocation == other.lastKnownLocation &&
                        this.lastKnownOrientation == other.lastKnownOrientation &&
                        this.lastLocationUpdateTime == other.lastLocationUpdateTime &&
                        this.lastUpdateTime == other.lastUpdateTime &&
                        this.nextStop == other.nextStop &&
                        this.nextStopTimeOffset == other.nextStopTimeOffset &&
                        this.occupancyCapacity == other.occupancyCapacity &&
                        this.occupancyCount == other.occupancyCount &&
                        this.occupancyStatus == other.occupancyStatus &&
                        this.orientation == other.orientation &&
                        this.phase == other.phase &&
                        this.position == other.position &&
                        this.predicted == other.predicted &&
                        this.scheduleDeviation == other.scheduleDeviation &&
                        this.scheduledDistanceAlongTrip == other.scheduledDistanceAlongTrip &&
                        this.serviceDate == other.serviceDate &&
                        this.situationIds == other.situationIds &&
                        this.status == other.status &&
                        this.totalDistanceAlongTrip == other.totalDistanceAlongTrip &&
                        this.vehicleId == other.vehicleId &&
                        this.additionalProperties == other.additionalProperties
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                activeTripId,
                                blockTripSequence,
                                closestStop,
                                closestStopTimeOffset,
                                distanceAlongTrip,
                                frequency,
                                lastKnownDistanceAlongTrip,
                                lastKnownLocation,
                                lastKnownOrientation,
                                lastLocationUpdateTime,
                                lastUpdateTime,
                                nextStop,
                                nextStopTimeOffset,
                                occupancyCapacity,
                                occupancyCount,
                                occupancyStatus,
                                orientation,
                                phase,
                                position,
                                predicted,
                                scheduleDeviation,
                                scheduledDistanceAlongTrip,
                                serviceDate,
                                situationIds,
                                status,
                                totalDistanceAlongTrip,
                                vehicleId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "TripStatus{activeTripId=$activeTripId, blockTripSequence=$blockTripSequence, closestStop=$closestStop, closestStopTimeOffset=$closestStopTimeOffset, distanceAlongTrip=$distanceAlongTrip, frequency=$frequency, lastKnownDistanceAlongTrip=$lastKnownDistanceAlongTrip, lastKnownLocation=$lastKnownLocation, lastKnownOrientation=$lastKnownOrientation, lastLocationUpdateTime=$lastLocationUpdateTime, lastUpdateTime=$lastUpdateTime, nextStop=$nextStop, nextStopTimeOffset=$nextStopTimeOffset, occupancyCapacity=$occupancyCapacity, occupancyCount=$occupancyCount, occupancyStatus=$occupancyStatus, orientation=$orientation, phase=$phase, position=$position, predicted=$predicted, scheduleDeviation=$scheduleDeviation, scheduledDistanceAlongTrip=$scheduledDistanceAlongTrip, serviceDate=$serviceDate, situationIds=$situationIds, status=$status, totalDistanceAlongTrip=$totalDistanceAlongTrip, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is List &&
                    this.vehicleId == other.vehicleId &&
                    this.lastUpdateTime == other.lastUpdateTime &&
                    this.lastLocationUpdateTime == other.lastLocationUpdateTime &&
                    this.location == other.location &&
                    this.tripId == other.tripId &&
                    this.tripStatus == other.tripStatus &&
                    this.occupancyCapacity == other.occupancyCapacity &&
                    this.occupancyCount == other.occupancyCount &&
                    this.occupancyStatus == other.occupancyStatus &&
                    this.phase == other.phase &&
                    this.status == other.status &&
                    this.additionalProperties == other.additionalProperties
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            vehicleId,
                            lastUpdateTime,
                            lastLocationUpdateTime,
                            location,
                            tripId,
                            tripStatus,
                            occupancyCapacity,
                            occupancyCount,
                            occupancyStatus,
                            phase,
                            status,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "List{vehicleId=$vehicleId, lastUpdateTime=$lastUpdateTime, lastLocationUpdateTime=$lastLocationUpdateTime, location=$location, tripId=$tripId, tripStatus=$tripStatus, occupancyCapacity=$occupancyCapacity, occupancyCount=$occupancyCount, occupancyStatus=$occupancyStatus, phase=$phase, status=$status, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.list == other.list &&
                this.limitExceeded == other.limitExceeded &&
                this.references == other.references &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        list,
                        limitExceeded,
                        references,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{list=$list, limitExceeded=$limitExceeded, references=$references, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VehiclesForAgencyListResponse &&
            this.code == other.code &&
            this.currentTime == other.currentTime &&
            this.text == other.text &&
            this.version == other.version &&
            this.data == other.data &&
            this.additionalProperties == other.additionalProperties
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    code,
                    currentTime,
                    text,
                    version,
                    data,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "VehiclesForAgencyListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
