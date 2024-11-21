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
import org.onebusaway.core.toImmutable

@JsonDeserialize(builder = TripsForLocationListResponse.Builder::class)
@NoAutoDetect
class TripsForLocationListResponse
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

    fun validate(): TripsForLocationListResponse = apply {
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

        internal fun from(tripsForLocationListResponse: TripsForLocationListResponse) = apply {
            this.code = tripsForLocationListResponse.code
            this.currentTime = tripsForLocationListResponse.currentTime
            this.text = tripsForLocationListResponse.text
            this.version = tripsForLocationListResponse.version
            this.data = tripsForLocationListResponse.data
            additionalProperties(tripsForLocationListResponse.additionalProperties)
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

        fun build(): TripsForLocationListResponse =
            TripsForLocationListResponse(
                code,
                currentTime,
                text,
                version,
                data,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val limitExceeded: JsonField<Boolean>,
        private val list: JsonField<kotlin.collections.List<List>>,
        private val outOfRange: JsonField<Boolean>,
        private val references: JsonField<References>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Indicates if the limit of trips has been exceeded */
        fun limitExceeded(): Boolean = limitExceeded.getRequired("limitExceeded")

        fun list(): kotlin.collections.List<List> = list.getRequired("list")

        /** Indicates if the search location is out of range */
        fun outOfRange(): Boolean? = outOfRange.getNullable("outOfRange")

        fun references(): References = references.getRequired("references")

        /** Indicates if the limit of trips has been exceeded */
        @JsonProperty("limitExceeded") @ExcludeMissing fun _limitExceeded() = limitExceeded

        @JsonProperty("list") @ExcludeMissing fun _list() = list

        /** Indicates if the search location is out of range */
        @JsonProperty("outOfRange") @ExcludeMissing fun _outOfRange() = outOfRange

        @JsonProperty("references") @ExcludeMissing fun _references() = references

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                limitExceeded()
                list().forEach { it.validate() }
                outOfRange()
                references().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var limitExceeded: JsonField<Boolean> = JsonMissing.of()
            private var list: JsonField<kotlin.collections.List<List>> = JsonMissing.of()
            private var outOfRange: JsonField<Boolean> = JsonMissing.of()
            private var references: JsonField<References> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                this.limitExceeded = data.limitExceeded
                this.list = data.list
                this.outOfRange = data.outOfRange
                this.references = data.references
                additionalProperties(data.additionalProperties)
            }

            /** Indicates if the limit of trips has been exceeded */
            fun limitExceeded(limitExceeded: Boolean) = limitExceeded(JsonField.of(limitExceeded))

            /** Indicates if the limit of trips has been exceeded */
            @JsonProperty("limitExceeded")
            @ExcludeMissing
            fun limitExceeded(limitExceeded: JsonField<Boolean>) = apply {
                this.limitExceeded = limitExceeded
            }

            fun list(list: kotlin.collections.List<List>) = list(JsonField.of(list))

            @JsonProperty("list")
            @ExcludeMissing
            fun list(list: JsonField<kotlin.collections.List<List>>) = apply { this.list = list }

            /** Indicates if the search location is out of range */
            fun outOfRange(outOfRange: Boolean) = outOfRange(JsonField.of(outOfRange))

            /** Indicates if the search location is out of range */
            @JsonProperty("outOfRange")
            @ExcludeMissing
            fun outOfRange(outOfRange: JsonField<Boolean>) = apply { this.outOfRange = outOfRange }

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
                    limitExceeded,
                    list.map { it.toImmutable() },
                    outOfRange,
                    references,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = List.Builder::class)
        @NoAutoDetect
        class List
        private constructor(
            private val frequency: JsonField<String>,
            private val serviceDate: JsonField<Long>,
            private val situationIds: JsonField<kotlin.collections.List<String>>,
            private val tripId: JsonField<String>,
            private val schedule: JsonField<Schedule>,
            private val status: JsonField<Status>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun frequency(): String? = frequency.getNullable("frequency")

            fun serviceDate(): Long? = serviceDate.getNullable("serviceDate")

            fun situationIds(): kotlin.collections.List<String>? =
                situationIds.getNullable("situationIds")

            fun tripId(): String = tripId.getRequired("tripId")

            fun schedule(): Schedule = schedule.getRequired("schedule")

            fun status(): Status = status.getRequired("status")

            @JsonProperty("frequency") @ExcludeMissing fun _frequency() = frequency

            @JsonProperty("serviceDate") @ExcludeMissing fun _serviceDate() = serviceDate

            @JsonProperty("situationIds") @ExcludeMissing fun _situationIds() = situationIds

            @JsonProperty("tripId") @ExcludeMissing fun _tripId() = tripId

            @JsonProperty("schedule") @ExcludeMissing fun _schedule() = schedule

            @JsonProperty("status") @ExcludeMissing fun _status() = status

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): List = apply {
                if (!validated) {
                    frequency()
                    serviceDate()
                    situationIds()
                    tripId()
                    schedule().validate()
                    status().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var frequency: JsonField<String> = JsonMissing.of()
                private var serviceDate: JsonField<Long> = JsonMissing.of()
                private var situationIds: JsonField<kotlin.collections.List<String>> =
                    JsonMissing.of()
                private var tripId: JsonField<String> = JsonMissing.of()
                private var schedule: JsonField<Schedule> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(list: List) = apply {
                    this.frequency = list.frequency
                    this.serviceDate = list.serviceDate
                    this.situationIds = list.situationIds
                    this.tripId = list.tripId
                    this.schedule = list.schedule
                    this.status = list.status
                    additionalProperties(list.additionalProperties)
                }

                fun frequency(frequency: String) = frequency(JsonField.of(frequency))

                @JsonProperty("frequency")
                @ExcludeMissing
                fun frequency(frequency: JsonField<String>) = apply { this.frequency = frequency }

                fun serviceDate(serviceDate: Long) = serviceDate(JsonField.of(serviceDate))

                @JsonProperty("serviceDate")
                @ExcludeMissing
                fun serviceDate(serviceDate: JsonField<Long>) = apply {
                    this.serviceDate = serviceDate
                }

                fun situationIds(situationIds: kotlin.collections.List<String>) =
                    situationIds(JsonField.of(situationIds))

                @JsonProperty("situationIds")
                @ExcludeMissing
                fun situationIds(situationIds: JsonField<kotlin.collections.List<String>>) = apply {
                    this.situationIds = situationIds
                }

                fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                @JsonProperty("tripId")
                @ExcludeMissing
                fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

                fun schedule(schedule: Schedule) = schedule(JsonField.of(schedule))

                @JsonProperty("schedule")
                @ExcludeMissing
                fun schedule(schedule: JsonField<Schedule>) = apply { this.schedule = schedule }

                fun status(status: Status) = status(JsonField.of(status))

                @JsonProperty("status")
                @ExcludeMissing
                fun status(status: JsonField<Status>) = apply { this.status = status }

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
                        frequency,
                        serviceDate,
                        situationIds.map { it.toImmutable() },
                        tripId,
                        schedule,
                        status,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = Schedule.Builder::class)
            @NoAutoDetect
            class Schedule
            private constructor(
                private val frequency: JsonField<String>,
                private val nextTripId: JsonField<String>,
                private val previousTripId: JsonField<String>,
                private val stopTimes: JsonField<kotlin.collections.List<StopTime>>,
                private val timeZone: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun frequency(): String? = frequency.getNullable("frequency")

                fun nextTripId(): String = nextTripId.getRequired("nextTripId")

                fun previousTripId(): String = previousTripId.getRequired("previousTripId")

                fun stopTimes(): kotlin.collections.List<StopTime> =
                    stopTimes.getRequired("stopTimes")

                fun timeZone(): String = timeZone.getRequired("timeZone")

                @JsonProperty("frequency") @ExcludeMissing fun _frequency() = frequency

                @JsonProperty("nextTripId") @ExcludeMissing fun _nextTripId() = nextTripId

                @JsonProperty("previousTripId")
                @ExcludeMissing
                fun _previousTripId() = previousTripId

                @JsonProperty("stopTimes") @ExcludeMissing fun _stopTimes() = stopTimes

                @JsonProperty("timeZone") @ExcludeMissing fun _timeZone() = timeZone

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Schedule = apply {
                    if (!validated) {
                        frequency()
                        nextTripId()
                        previousTripId()
                        stopTimes().forEach { it.validate() }
                        timeZone()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var frequency: JsonField<String> = JsonMissing.of()
                    private var nextTripId: JsonField<String> = JsonMissing.of()
                    private var previousTripId: JsonField<String> = JsonMissing.of()
                    private var stopTimes: JsonField<kotlin.collections.List<StopTime>> =
                        JsonMissing.of()
                    private var timeZone: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(schedule: Schedule) = apply {
                        this.frequency = schedule.frequency
                        this.nextTripId = schedule.nextTripId
                        this.previousTripId = schedule.previousTripId
                        this.stopTimes = schedule.stopTimes
                        this.timeZone = schedule.timeZone
                        additionalProperties(schedule.additionalProperties)
                    }

                    fun frequency(frequency: String) = frequency(JsonField.of(frequency))

                    @JsonProperty("frequency")
                    @ExcludeMissing
                    fun frequency(frequency: JsonField<String>) = apply {
                        this.frequency = frequency
                    }

                    fun nextTripId(nextTripId: String) = nextTripId(JsonField.of(nextTripId))

                    @JsonProperty("nextTripId")
                    @ExcludeMissing
                    fun nextTripId(nextTripId: JsonField<String>) = apply {
                        this.nextTripId = nextTripId
                    }

                    fun previousTripId(previousTripId: String) =
                        previousTripId(JsonField.of(previousTripId))

                    @JsonProperty("previousTripId")
                    @ExcludeMissing
                    fun previousTripId(previousTripId: JsonField<String>) = apply {
                        this.previousTripId = previousTripId
                    }

                    fun stopTimes(stopTimes: kotlin.collections.List<StopTime>) =
                        stopTimes(JsonField.of(stopTimes))

                    @JsonProperty("stopTimes")
                    @ExcludeMissing
                    fun stopTimes(stopTimes: JsonField<kotlin.collections.List<StopTime>>) = apply {
                        this.stopTimes = stopTimes
                    }

                    fun timeZone(timeZone: String) = timeZone(JsonField.of(timeZone))

                    @JsonProperty("timeZone")
                    @ExcludeMissing
                    fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

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

                    fun build(): Schedule =
                        Schedule(
                            frequency,
                            nextTripId,
                            previousTripId,
                            stopTimes.map { it.toImmutable() },
                            timeZone,
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = StopTime.Builder::class)
                @NoAutoDetect
                class StopTime
                private constructor(
                    private val arrivalTime: JsonField<Long>,
                    private val departureTime: JsonField<Long>,
                    private val distanceAlongTrip: JsonField<Double>,
                    private val historicalOccupancy: JsonField<String>,
                    private val stopHeadsign: JsonField<String>,
                    private val stopId: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun arrivalTime(): Long? = arrivalTime.getNullable("arrivalTime")

                    fun departureTime(): Long? = departureTime.getNullable("departureTime")

                    fun distanceAlongTrip(): Double? =
                        distanceAlongTrip.getNullable("distanceAlongTrip")

                    fun historicalOccupancy(): String? =
                        historicalOccupancy.getNullable("historicalOccupancy")

                    fun stopHeadsign(): String? = stopHeadsign.getNullable("stopHeadsign")

                    fun stopId(): String? = stopId.getNullable("stopId")

                    @JsonProperty("arrivalTime") @ExcludeMissing fun _arrivalTime() = arrivalTime

                    @JsonProperty("departureTime")
                    @ExcludeMissing
                    fun _departureTime() = departureTime

                    @JsonProperty("distanceAlongTrip")
                    @ExcludeMissing
                    fun _distanceAlongTrip() = distanceAlongTrip

                    @JsonProperty("historicalOccupancy")
                    @ExcludeMissing
                    fun _historicalOccupancy() = historicalOccupancy

                    @JsonProperty("stopHeadsign") @ExcludeMissing fun _stopHeadsign() = stopHeadsign

                    @JsonProperty("stopId") @ExcludeMissing fun _stopId() = stopId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): StopTime = apply {
                        if (!validated) {
                            arrivalTime()
                            departureTime()
                            distanceAlongTrip()
                            historicalOccupancy()
                            stopHeadsign()
                            stopId()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var arrivalTime: JsonField<Long> = JsonMissing.of()
                        private var departureTime: JsonField<Long> = JsonMissing.of()
                        private var distanceAlongTrip: JsonField<Double> = JsonMissing.of()
                        private var historicalOccupancy: JsonField<String> = JsonMissing.of()
                        private var stopHeadsign: JsonField<String> = JsonMissing.of()
                        private var stopId: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(stopTime: StopTime) = apply {
                            this.arrivalTime = stopTime.arrivalTime
                            this.departureTime = stopTime.departureTime
                            this.distanceAlongTrip = stopTime.distanceAlongTrip
                            this.historicalOccupancy = stopTime.historicalOccupancy
                            this.stopHeadsign = stopTime.stopHeadsign
                            this.stopId = stopTime.stopId
                            additionalProperties(stopTime.additionalProperties)
                        }

                        fun arrivalTime(arrivalTime: Long) = arrivalTime(JsonField.of(arrivalTime))

                        @JsonProperty("arrivalTime")
                        @ExcludeMissing
                        fun arrivalTime(arrivalTime: JsonField<Long>) = apply {
                            this.arrivalTime = arrivalTime
                        }

                        fun departureTime(departureTime: Long) =
                            departureTime(JsonField.of(departureTime))

                        @JsonProperty("departureTime")
                        @ExcludeMissing
                        fun departureTime(departureTime: JsonField<Long>) = apply {
                            this.departureTime = departureTime
                        }

                        fun distanceAlongTrip(distanceAlongTrip: Double) =
                            distanceAlongTrip(JsonField.of(distanceAlongTrip))

                        @JsonProperty("distanceAlongTrip")
                        @ExcludeMissing
                        fun distanceAlongTrip(distanceAlongTrip: JsonField<Double>) = apply {
                            this.distanceAlongTrip = distanceAlongTrip
                        }

                        fun historicalOccupancy(historicalOccupancy: String) =
                            historicalOccupancy(JsonField.of(historicalOccupancy))

                        @JsonProperty("historicalOccupancy")
                        @ExcludeMissing
                        fun historicalOccupancy(historicalOccupancy: JsonField<String>) = apply {
                            this.historicalOccupancy = historicalOccupancy
                        }

                        fun stopHeadsign(stopHeadsign: String) =
                            stopHeadsign(JsonField.of(stopHeadsign))

                        @JsonProperty("stopHeadsign")
                        @ExcludeMissing
                        fun stopHeadsign(stopHeadsign: JsonField<String>) = apply {
                            this.stopHeadsign = stopHeadsign
                        }

                        fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                        @JsonProperty("stopId")
                        @ExcludeMissing
                        fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

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

                        fun build(): StopTime =
                            StopTime(
                                arrivalTime,
                                departureTime,
                                distanceAlongTrip,
                                historicalOccupancy,
                                stopHeadsign,
                                stopId,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is StopTime && arrivalTime == other.arrivalTime && departureTime == other.departureTime && distanceAlongTrip == other.distanceAlongTrip && historicalOccupancy == other.historicalOccupancy && stopHeadsign == other.stopHeadsign && stopId == other.stopId && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(arrivalTime, departureTime, distanceAlongTrip, historicalOccupancy, stopHeadsign, stopId, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "StopTime{arrivalTime=$arrivalTime, departureTime=$departureTime, distanceAlongTrip=$distanceAlongTrip, historicalOccupancy=$historicalOccupancy, stopHeadsign=$stopHeadsign, stopId=$stopId, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Schedule && frequency == other.frequency && nextTripId == other.nextTripId && previousTripId == other.previousTripId && stopTimes == other.stopTimes && timeZone == other.timeZone && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(frequency, nextTripId, previousTripId, stopTimes, timeZone, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Schedule{frequency=$frequency, nextTripId=$nextTripId, previousTripId=$previousTripId, stopTimes=$stopTimes, timeZone=$timeZone, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = Status.Builder::class)
            @NoAutoDetect
            class Status
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
                private val situationIds: JsonField<kotlin.collections.List<String>>,
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
                fun situationIds(): kotlin.collections.List<String>? =
                    situationIds.getNullable("situationIds")

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

                fun validate(): Status = apply {
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
                    private var situationIds: JsonField<kotlin.collections.List<String>> =
                        JsonMissing.of()
                    private var status: JsonField<String> = JsonMissing.of()
                    private var totalDistanceAlongTrip: JsonField<Double> = JsonMissing.of()
                    private var vehicleId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(status: Status) = apply {
                        this.activeTripId = status.activeTripId
                        this.blockTripSequence = status.blockTripSequence
                        this.closestStop = status.closestStop
                        this.closestStopTimeOffset = status.closestStopTimeOffset
                        this.distanceAlongTrip = status.distanceAlongTrip
                        this.frequency = status.frequency
                        this.lastKnownDistanceAlongTrip = status.lastKnownDistanceAlongTrip
                        this.lastKnownLocation = status.lastKnownLocation
                        this.lastKnownOrientation = status.lastKnownOrientation
                        this.lastLocationUpdateTime = status.lastLocationUpdateTime
                        this.lastUpdateTime = status.lastUpdateTime
                        this.nextStop = status.nextStop
                        this.nextStopTimeOffset = status.nextStopTimeOffset
                        this.occupancyCapacity = status.occupancyCapacity
                        this.occupancyCount = status.occupancyCount
                        this.occupancyStatus = status.occupancyStatus
                        this.orientation = status.orientation
                        this.phase = status.phase
                        this.position = status.position
                        this.predicted = status.predicted
                        this.scheduleDeviation = status.scheduleDeviation
                        this.scheduledDistanceAlongTrip = status.scheduledDistanceAlongTrip
                        this.serviceDate = status.serviceDate
                        this.situationIds = status.situationIds
                        this.status = status.status
                        this.totalDistanceAlongTrip = status.totalDistanceAlongTrip
                        this.vehicleId = status.vehicleId
                        additionalProperties(status.additionalProperties)
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
                    fun situationIds(situationIds: kotlin.collections.List<String>) =
                        situationIds(JsonField.of(situationIds))

                    /** References to situation elements (if any) applicable to this trip. */
                    @JsonProperty("situationIds")
                    @ExcludeMissing
                    fun situationIds(situationIds: JsonField<kotlin.collections.List<String>>) =
                        apply {
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

                    fun build(): Status =
                        Status(
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
                            situationIds.map { it.toImmutable() },
                            status,
                            totalDistanceAlongTrip,
                            vehicleId,
                            additionalProperties.toImmutable(),
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
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LastKnownLocation && lat == other.lat && lon == other.lon && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(lat, lon, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

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
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Position && lat == other.lat && lon == other.lon && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(lat, lon, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Position{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Status && activeTripId == other.activeTripId && blockTripSequence == other.blockTripSequence && closestStop == other.closestStop && closestStopTimeOffset == other.closestStopTimeOffset && distanceAlongTrip == other.distanceAlongTrip && frequency == other.frequency && lastKnownDistanceAlongTrip == other.lastKnownDistanceAlongTrip && lastKnownLocation == other.lastKnownLocation && lastKnownOrientation == other.lastKnownOrientation && lastLocationUpdateTime == other.lastLocationUpdateTime && lastUpdateTime == other.lastUpdateTime && nextStop == other.nextStop && nextStopTimeOffset == other.nextStopTimeOffset && occupancyCapacity == other.occupancyCapacity && occupancyCount == other.occupancyCount && occupancyStatus == other.occupancyStatus && orientation == other.orientation && phase == other.phase && position == other.position && predicted == other.predicted && scheduleDeviation == other.scheduleDeviation && scheduledDistanceAlongTrip == other.scheduledDistanceAlongTrip && serviceDate == other.serviceDate && situationIds == other.situationIds && status == other.status && totalDistanceAlongTrip == other.totalDistanceAlongTrip && vehicleId == other.vehicleId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(activeTripId, blockTripSequence, closestStop, closestStopTimeOffset, distanceAlongTrip, frequency, lastKnownDistanceAlongTrip, lastKnownLocation, lastKnownOrientation, lastLocationUpdateTime, lastUpdateTime, nextStop, nextStopTimeOffset, occupancyCapacity, occupancyCount, occupancyStatus, orientation, phase, position, predicted, scheduleDeviation, scheduledDistanceAlongTrip, serviceDate, situationIds, status, totalDistanceAlongTrip, vehicleId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Status{activeTripId=$activeTripId, blockTripSequence=$blockTripSequence, closestStop=$closestStop, closestStopTimeOffset=$closestStopTimeOffset, distanceAlongTrip=$distanceAlongTrip, frequency=$frequency, lastKnownDistanceAlongTrip=$lastKnownDistanceAlongTrip, lastKnownLocation=$lastKnownLocation, lastKnownOrientation=$lastKnownOrientation, lastLocationUpdateTime=$lastLocationUpdateTime, lastUpdateTime=$lastUpdateTime, nextStop=$nextStop, nextStopTimeOffset=$nextStopTimeOffset, occupancyCapacity=$occupancyCapacity, occupancyCount=$occupancyCount, occupancyStatus=$occupancyStatus, orientation=$orientation, phase=$phase, position=$position, predicted=$predicted, scheduleDeviation=$scheduleDeviation, scheduledDistanceAlongTrip=$scheduledDistanceAlongTrip, serviceDate=$serviceDate, situationIds=$situationIds, status=$status, totalDistanceAlongTrip=$totalDistanceAlongTrip, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is List && frequency == other.frequency && serviceDate == other.serviceDate && situationIds == other.situationIds && tripId == other.tripId && schedule == other.schedule && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(frequency, serviceDate, situationIds, tripId, schedule, status, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "List{frequency=$frequency, serviceDate=$serviceDate, situationIds=$situationIds, tripId=$tripId, schedule=$schedule, status=$status, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && limitExceeded == other.limitExceeded && list == other.list && outOfRange == other.outOfRange && references == other.references && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(limitExceeded, list, outOfRange, references, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{limitExceeded=$limitExceeded, list=$list, outOfRange=$outOfRange, references=$references, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TripsForLocationListResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TripsForLocationListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
