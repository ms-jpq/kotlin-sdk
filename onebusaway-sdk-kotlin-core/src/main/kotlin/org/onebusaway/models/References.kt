// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import org.onebusaway.core.Enum
import org.onebusaway.core.ExcludeMissing
import org.onebusaway.core.JsonField
import org.onebusaway.core.JsonMissing
import org.onebusaway.core.JsonValue
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toImmutable
import org.onebusaway.errors.OnebusawaySdkInvalidDataException

@JsonDeserialize(builder = References.Builder::class)
@NoAutoDetect
class References
private constructor(
    private val agencies: JsonField<List<Agency>>,
    private val routes: JsonField<List<Route>>,
    private val situations: JsonField<List<Situation>>,
    private val stopTimes: JsonField<List<StopTime>>,
    private val stops: JsonField<List<Stop>>,
    private val trips: JsonField<List<Trip>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun agencies(): List<Agency> = agencies.getRequired("agencies")

    fun routes(): List<Route> = routes.getRequired("routes")

    fun situations(): List<Situation> = situations.getRequired("situations")

    fun stopTimes(): List<StopTime> = stopTimes.getRequired("stopTimes")

    fun stops(): List<Stop> = stops.getRequired("stops")

    fun trips(): List<Trip> = trips.getRequired("trips")

    @JsonProperty("agencies") @ExcludeMissing fun _agencies() = agencies

    @JsonProperty("routes") @ExcludeMissing fun _routes() = routes

    @JsonProperty("situations") @ExcludeMissing fun _situations() = situations

    @JsonProperty("stopTimes") @ExcludeMissing fun _stopTimes() = stopTimes

    @JsonProperty("stops") @ExcludeMissing fun _stops() = stops

    @JsonProperty("trips") @ExcludeMissing fun _trips() = trips

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): References = apply {
        if (!validated) {
            agencies().forEach { it.validate() }
            routes().forEach { it.validate() }
            situations().forEach { it.validate() }
            stopTimes().forEach { it.validate() }
            stops().forEach { it.validate() }
            trips().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var agencies: JsonField<List<Agency>> = JsonMissing.of()
        private var routes: JsonField<List<Route>> = JsonMissing.of()
        private var situations: JsonField<List<Situation>> = JsonMissing.of()
        private var stopTimes: JsonField<List<StopTime>> = JsonMissing.of()
        private var stops: JsonField<List<Stop>> = JsonMissing.of()
        private var trips: JsonField<List<Trip>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(references: References) = apply {
            this.agencies = references.agencies
            this.routes = references.routes
            this.situations = references.situations
            this.stopTimes = references.stopTimes
            this.stops = references.stops
            this.trips = references.trips
            additionalProperties(references.additionalProperties)
        }

        fun agencies(agencies: List<Agency>) = agencies(JsonField.of(agencies))

        @JsonProperty("agencies")
        @ExcludeMissing
        fun agencies(agencies: JsonField<List<Agency>>) = apply { this.agencies = agencies }

        fun routes(routes: List<Route>) = routes(JsonField.of(routes))

        @JsonProperty("routes")
        @ExcludeMissing
        fun routes(routes: JsonField<List<Route>>) = apply { this.routes = routes }

        fun situations(situations: List<Situation>) = situations(JsonField.of(situations))

        @JsonProperty("situations")
        @ExcludeMissing
        fun situations(situations: JsonField<List<Situation>>) = apply {
            this.situations = situations
        }

        fun stopTimes(stopTimes: List<StopTime>) = stopTimes(JsonField.of(stopTimes))

        @JsonProperty("stopTimes")
        @ExcludeMissing
        fun stopTimes(stopTimes: JsonField<List<StopTime>>) = apply { this.stopTimes = stopTimes }

        fun stops(stops: List<Stop>) = stops(JsonField.of(stops))

        @JsonProperty("stops")
        @ExcludeMissing
        fun stops(stops: JsonField<List<Stop>>) = apply { this.stops = stops }

        fun trips(trips: List<Trip>) = trips(JsonField.of(trips))

        @JsonProperty("trips")
        @ExcludeMissing
        fun trips(trips: JsonField<List<Trip>>) = apply { this.trips = trips }

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

        fun build(): References =
            References(
                agencies.map { it.toImmutable() },
                routes.map { it.toImmutable() },
                situations.map { it.toImmutable() },
                stopTimes.map { it.toImmutable() },
                stops.map { it.toImmutable() },
                trips.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Agency.Builder::class)
    @NoAutoDetect
    class Agency
    private constructor(
        private val disclaimer: JsonField<String>,
        private val email: JsonField<String>,
        private val fareUrl: JsonField<String>,
        private val id: JsonField<String>,
        private val lang: JsonField<String>,
        private val name: JsonField<String>,
        private val phone: JsonField<String>,
        private val privateService: JsonField<Boolean>,
        private val timezone: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun disclaimer(): String? = disclaimer.getNullable("disclaimer")

        fun email(): String? = email.getNullable("email")

        fun fareUrl(): String? = fareUrl.getNullable("fareUrl")

        fun id(): String = id.getRequired("id")

        fun lang(): String? = lang.getNullable("lang")

        fun name(): String = name.getRequired("name")

        fun phone(): String? = phone.getNullable("phone")

        fun privateService(): Boolean? = privateService.getNullable("privateService")

        fun timezone(): String = timezone.getRequired("timezone")

        fun url(): String = url.getRequired("url")

        @JsonProperty("disclaimer") @ExcludeMissing fun _disclaimer() = disclaimer

        @JsonProperty("email") @ExcludeMissing fun _email() = email

        @JsonProperty("fareUrl") @ExcludeMissing fun _fareUrl() = fareUrl

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("lang") @ExcludeMissing fun _lang() = lang

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("phone") @ExcludeMissing fun _phone() = phone

        @JsonProperty("privateService") @ExcludeMissing fun _privateService() = privateService

        @JsonProperty("timezone") @ExcludeMissing fun _timezone() = timezone

        @JsonProperty("url") @ExcludeMissing fun _url() = url

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Agency = apply {
            if (!validated) {
                disclaimer()
                email()
                fareUrl()
                id()
                lang()
                name()
                phone()
                privateService()
                timezone()
                url()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var disclaimer: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var fareUrl: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var lang: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var phone: JsonField<String> = JsonMissing.of()
            private var privateService: JsonField<Boolean> = JsonMissing.of()
            private var timezone: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(agency: Agency) = apply {
                this.disclaimer = agency.disclaimer
                this.email = agency.email
                this.fareUrl = agency.fareUrl
                this.id = agency.id
                this.lang = agency.lang
                this.name = agency.name
                this.phone = agency.phone
                this.privateService = agency.privateService
                this.timezone = agency.timezone
                this.url = agency.url
                additionalProperties(agency.additionalProperties)
            }

            fun disclaimer(disclaimer: String) = disclaimer(JsonField.of(disclaimer))

            @JsonProperty("disclaimer")
            @ExcludeMissing
            fun disclaimer(disclaimer: JsonField<String>) = apply { this.disclaimer = disclaimer }

            fun email(email: String) = email(JsonField.of(email))

            @JsonProperty("email")
            @ExcludeMissing
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun fareUrl(fareUrl: String) = fareUrl(JsonField.of(fareUrl))

            @JsonProperty("fareUrl")
            @ExcludeMissing
            fun fareUrl(fareUrl: JsonField<String>) = apply { this.fareUrl = fareUrl }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun lang(lang: String) = lang(JsonField.of(lang))

            @JsonProperty("lang")
            @ExcludeMissing
            fun lang(lang: JsonField<String>) = apply { this.lang = lang }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun phone(phone: String) = phone(JsonField.of(phone))

            @JsonProperty("phone")
            @ExcludeMissing
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            fun privateService(privateService: Boolean) =
                privateService(JsonField.of(privateService))

            @JsonProperty("privateService")
            @ExcludeMissing
            fun privateService(privateService: JsonField<Boolean>) = apply {
                this.privateService = privateService
            }

            fun timezone(timezone: String) = timezone(JsonField.of(timezone))

            @JsonProperty("timezone")
            @ExcludeMissing
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

            fun url(url: String) = url(JsonField.of(url))

            @JsonProperty("url")
            @ExcludeMissing
            fun url(url: JsonField<String>) = apply { this.url = url }

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

            fun build(): Agency =
                Agency(
                    disclaimer,
                    email,
                    fareUrl,
                    id,
                    lang,
                    name,
                    phone,
                    privateService,
                    timezone,
                    url,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Agency && disclaimer == other.disclaimer && email == other.email && fareUrl == other.fareUrl && id == other.id && lang == other.lang && name == other.name && phone == other.phone && privateService == other.privateService && timezone == other.timezone && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(disclaimer, email, fareUrl, id, lang, name, phone, privateService, timezone, url, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Agency{disclaimer=$disclaimer, email=$email, fareUrl=$fareUrl, id=$id, lang=$lang, name=$name, phone=$phone, privateService=$privateService, timezone=$timezone, url=$url, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Route.Builder::class)
    @NoAutoDetect
    class Route
    private constructor(
        private val agencyId: JsonField<String>,
        private val color: JsonField<String>,
        private val description: JsonField<String>,
        private val id: JsonField<String>,
        private val longName: JsonField<String>,
        private val nullSafeShortName: JsonField<String>,
        private val shortName: JsonField<String>,
        private val textColor: JsonField<String>,
        private val type: JsonField<Long>,
        private val url: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun agencyId(): String = agencyId.getRequired("agencyId")

        fun color(): String? = color.getNullable("color")

        fun description(): String? = description.getNullable("description")

        fun id(): String = id.getRequired("id")

        fun longName(): String? = longName.getNullable("longName")

        fun nullSafeShortName(): String? = nullSafeShortName.getNullable("nullSafeShortName")

        fun shortName(): String? = shortName.getNullable("shortName")

        fun textColor(): String? = textColor.getNullable("textColor")

        fun type(): Long = type.getRequired("type")

        fun url(): String? = url.getNullable("url")

        @JsonProperty("agencyId") @ExcludeMissing fun _agencyId() = agencyId

        @JsonProperty("color") @ExcludeMissing fun _color() = color

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("longName") @ExcludeMissing fun _longName() = longName

        @JsonProperty("nullSafeShortName")
        @ExcludeMissing
        fun _nullSafeShortName() = nullSafeShortName

        @JsonProperty("shortName") @ExcludeMissing fun _shortName() = shortName

        @JsonProperty("textColor") @ExcludeMissing fun _textColor() = textColor

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("url") @ExcludeMissing fun _url() = url

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Route = apply {
            if (!validated) {
                agencyId()
                color()
                description()
                id()
                longName()
                nullSafeShortName()
                shortName()
                textColor()
                type()
                url()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var agencyId: JsonField<String> = JsonMissing.of()
            private var color: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var longName: JsonField<String> = JsonMissing.of()
            private var nullSafeShortName: JsonField<String> = JsonMissing.of()
            private var shortName: JsonField<String> = JsonMissing.of()
            private var textColor: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Long> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(route: Route) = apply {
                this.agencyId = route.agencyId
                this.color = route.color
                this.description = route.description
                this.id = route.id
                this.longName = route.longName
                this.nullSafeShortName = route.nullSafeShortName
                this.shortName = route.shortName
                this.textColor = route.textColor
                this.type = route.type
                this.url = route.url
                additionalProperties(route.additionalProperties)
            }

            fun agencyId(agencyId: String) = agencyId(JsonField.of(agencyId))

            @JsonProperty("agencyId")
            @ExcludeMissing
            fun agencyId(agencyId: JsonField<String>) = apply { this.agencyId = agencyId }

            fun color(color: String) = color(JsonField.of(color))

            @JsonProperty("color")
            @ExcludeMissing
            fun color(color: JsonField<String>) = apply { this.color = color }

            fun description(description: String) = description(JsonField.of(description))

            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun longName(longName: String) = longName(JsonField.of(longName))

            @JsonProperty("longName")
            @ExcludeMissing
            fun longName(longName: JsonField<String>) = apply { this.longName = longName }

            fun nullSafeShortName(nullSafeShortName: String) =
                nullSafeShortName(JsonField.of(nullSafeShortName))

            @JsonProperty("nullSafeShortName")
            @ExcludeMissing
            fun nullSafeShortName(nullSafeShortName: JsonField<String>) = apply {
                this.nullSafeShortName = nullSafeShortName
            }

            fun shortName(shortName: String) = shortName(JsonField.of(shortName))

            @JsonProperty("shortName")
            @ExcludeMissing
            fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

            fun textColor(textColor: String) = textColor(JsonField.of(textColor))

            @JsonProperty("textColor")
            @ExcludeMissing
            fun textColor(textColor: JsonField<String>) = apply { this.textColor = textColor }

            fun type(type: Long) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Long>) = apply { this.type = type }

            fun url(url: String) = url(JsonField.of(url))

            @JsonProperty("url")
            @ExcludeMissing
            fun url(url: JsonField<String>) = apply { this.url = url }

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

            fun build(): Route =
                Route(
                    agencyId,
                    color,
                    description,
                    id,
                    longName,
                    nullSafeShortName,
                    shortName,
                    textColor,
                    type,
                    url,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Route && agencyId == other.agencyId && color == other.color && description == other.description && id == other.id && longName == other.longName && nullSafeShortName == other.nullSafeShortName && shortName == other.shortName && textColor == other.textColor && type == other.type && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(agencyId, color, description, id, longName, nullSafeShortName, shortName, textColor, type, url, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Route{agencyId=$agencyId, color=$color, description=$description, id=$id, longName=$longName, nullSafeShortName=$nullSafeShortName, shortName=$shortName, textColor=$textColor, type=$type, url=$url, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Situation.Builder::class)
    @NoAutoDetect
    class Situation
    private constructor(
        private val id: JsonField<String>,
        private val creationTime: JsonField<Long>,
        private val reason: JsonField<Reason>,
        private val summary: JsonField<Summary>,
        private val description: JsonField<Description>,
        private val url: JsonField<Url>,
        private val activeWindows: JsonField<List<ActiveWindow>>,
        private val allAffects: JsonField<List<AllAffect>>,
        private val consequences: JsonField<List<Consequence>>,
        private val publicationWindows: JsonField<List<PublicationWindow>>,
        private val severity: JsonField<String>,
        private val consequenceMessage: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Unique identifier for the situation. */
        fun id(): String = id.getRequired("id")

        /** Unix timestamp of when this situation was created. */
        fun creationTime(): Long = creationTime.getRequired("creationTime")

        /** Reason for the service alert, taken from TPEG codes. */
        fun reason(): Reason? = reason.getNullable("reason")

        fun summary(): Summary? = summary.getNullable("summary")

        fun description(): Description? = description.getNullable("description")

        fun url(): Url? = url.getNullable("url")

        fun activeWindows(): List<ActiveWindow>? = activeWindows.getNullable("activeWindows")

        fun allAffects(): List<AllAffect>? = allAffects.getNullable("allAffects")

        fun consequences(): List<Consequence>? = consequences.getNullable("consequences")

        fun publicationWindows(): List<PublicationWindow>? =
            publicationWindows.getNullable("publicationWindows")

        /** Severity of the situation. */
        fun severity(): String? = severity.getNullable("severity")

        /** Message regarding the consequence of the situation. */
        fun consequenceMessage(): String? = consequenceMessage.getNullable("consequenceMessage")

        /** Unique identifier for the situation. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** Unix timestamp of when this situation was created. */
        @JsonProperty("creationTime") @ExcludeMissing fun _creationTime() = creationTime

        /** Reason for the service alert, taken from TPEG codes. */
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        @JsonProperty("summary") @ExcludeMissing fun _summary() = summary

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("url") @ExcludeMissing fun _url() = url

        @JsonProperty("activeWindows") @ExcludeMissing fun _activeWindows() = activeWindows

        @JsonProperty("allAffects") @ExcludeMissing fun _allAffects() = allAffects

        @JsonProperty("consequences") @ExcludeMissing fun _consequences() = consequences

        @JsonProperty("publicationWindows")
        @ExcludeMissing
        fun _publicationWindows() = publicationWindows

        /** Severity of the situation. */
        @JsonProperty("severity") @ExcludeMissing fun _severity() = severity

        /** Message regarding the consequence of the situation. */
        @JsonProperty("consequenceMessage")
        @ExcludeMissing
        fun _consequenceMessage() = consequenceMessage

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Situation = apply {
            if (!validated) {
                id()
                creationTime()
                reason()
                summary()?.validate()
                description()?.validate()
                url()?.validate()
                activeWindows()?.forEach { it.validate() }
                allAffects()?.forEach { it.validate() }
                consequences()?.forEach { it.validate() }
                publicationWindows()?.forEach { it.validate() }
                severity()
                consequenceMessage()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var creationTime: JsonField<Long> = JsonMissing.of()
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var summary: JsonField<Summary> = JsonMissing.of()
            private var description: JsonField<Description> = JsonMissing.of()
            private var url: JsonField<Url> = JsonMissing.of()
            private var activeWindows: JsonField<List<ActiveWindow>> = JsonMissing.of()
            private var allAffects: JsonField<List<AllAffect>> = JsonMissing.of()
            private var consequences: JsonField<List<Consequence>> = JsonMissing.of()
            private var publicationWindows: JsonField<List<PublicationWindow>> = JsonMissing.of()
            private var severity: JsonField<String> = JsonMissing.of()
            private var consequenceMessage: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(situation: Situation) = apply {
                this.id = situation.id
                this.creationTime = situation.creationTime
                this.reason = situation.reason
                this.summary = situation.summary
                this.description = situation.description
                this.url = situation.url
                this.activeWindows = situation.activeWindows
                this.allAffects = situation.allAffects
                this.consequences = situation.consequences
                this.publicationWindows = situation.publicationWindows
                this.severity = situation.severity
                this.consequenceMessage = situation.consequenceMessage
                additionalProperties(situation.additionalProperties)
            }

            /** Unique identifier for the situation. */
            fun id(id: String) = id(JsonField.of(id))

            /** Unique identifier for the situation. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Unix timestamp of when this situation was created. */
            fun creationTime(creationTime: Long) = creationTime(JsonField.of(creationTime))

            /** Unix timestamp of when this situation was created. */
            @JsonProperty("creationTime")
            @ExcludeMissing
            fun creationTime(creationTime: JsonField<Long>) = apply {
                this.creationTime = creationTime
            }

            /** Reason for the service alert, taken from TPEG codes. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** Reason for the service alert, taken from TPEG codes. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            fun summary(summary: Summary) = summary(JsonField.of(summary))

            @JsonProperty("summary")
            @ExcludeMissing
            fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

            fun description(description: Description) = description(JsonField.of(description))

            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<Description>) = apply {
                this.description = description
            }

            fun url(url: Url) = url(JsonField.of(url))

            @JsonProperty("url")
            @ExcludeMissing
            fun url(url: JsonField<Url>) = apply { this.url = url }

            fun activeWindows(activeWindows: List<ActiveWindow>) =
                activeWindows(JsonField.of(activeWindows))

            @JsonProperty("activeWindows")
            @ExcludeMissing
            fun activeWindows(activeWindows: JsonField<List<ActiveWindow>>) = apply {
                this.activeWindows = activeWindows
            }

            fun allAffects(allAffects: List<AllAffect>) = allAffects(JsonField.of(allAffects))

            @JsonProperty("allAffects")
            @ExcludeMissing
            fun allAffects(allAffects: JsonField<List<AllAffect>>) = apply {
                this.allAffects = allAffects
            }

            fun consequences(consequences: List<Consequence>) =
                consequences(JsonField.of(consequences))

            @JsonProperty("consequences")
            @ExcludeMissing
            fun consequences(consequences: JsonField<List<Consequence>>) = apply {
                this.consequences = consequences
            }

            fun publicationWindows(publicationWindows: List<PublicationWindow>) =
                publicationWindows(JsonField.of(publicationWindows))

            @JsonProperty("publicationWindows")
            @ExcludeMissing
            fun publicationWindows(publicationWindows: JsonField<List<PublicationWindow>>) = apply {
                this.publicationWindows = publicationWindows
            }

            /** Severity of the situation. */
            fun severity(severity: String) = severity(JsonField.of(severity))

            /** Severity of the situation. */
            @JsonProperty("severity")
            @ExcludeMissing
            fun severity(severity: JsonField<String>) = apply { this.severity = severity }

            /** Message regarding the consequence of the situation. */
            fun consequenceMessage(consequenceMessage: String) =
                consequenceMessage(JsonField.of(consequenceMessage))

            /** Message regarding the consequence of the situation. */
            @JsonProperty("consequenceMessage")
            @ExcludeMissing
            fun consequenceMessage(consequenceMessage: JsonField<String>) = apply {
                this.consequenceMessage = consequenceMessage
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

            fun build(): Situation =
                Situation(
                    id,
                    creationTime,
                    reason,
                    summary,
                    description,
                    url,
                    activeWindows.map { it.toImmutable() },
                    allAffects.map { it.toImmutable() },
                    consequences.map { it.toImmutable() },
                    publicationWindows.map { it.toImmutable() },
                    severity,
                    consequenceMessage,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = ActiveWindow.Builder::class)
        @NoAutoDetect
        class ActiveWindow
        private constructor(
            private val from: JsonField<Long>,
            private val to: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** Start time of the active window as a Unix timestamp. */
            fun from(): Long? = from.getNullable("from")

            /** End time of the active window as a Unix timestamp. */
            fun to(): Long? = to.getNullable("to")

            /** Start time of the active window as a Unix timestamp. */
            @JsonProperty("from") @ExcludeMissing fun _from() = from

            /** End time of the active window as a Unix timestamp. */
            @JsonProperty("to") @ExcludeMissing fun _to() = to

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ActiveWindow = apply {
                if (!validated) {
                    from()
                    to()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var from: JsonField<Long> = JsonMissing.of()
                private var to: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(activeWindow: ActiveWindow) = apply {
                    this.from = activeWindow.from
                    this.to = activeWindow.to
                    additionalProperties(activeWindow.additionalProperties)
                }

                /** Start time of the active window as a Unix timestamp. */
                fun from(from: Long) = from(JsonField.of(from))

                /** Start time of the active window as a Unix timestamp. */
                @JsonProperty("from")
                @ExcludeMissing
                fun from(from: JsonField<Long>) = apply { this.from = from }

                /** End time of the active window as a Unix timestamp. */
                fun to(to: Long) = to(JsonField.of(to))

                /** End time of the active window as a Unix timestamp. */
                @JsonProperty("to")
                @ExcludeMissing
                fun to(to: JsonField<Long>) = apply { this.to = to }

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

                fun build(): ActiveWindow =
                    ActiveWindow(
                        from,
                        to,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ActiveWindow && from == other.from && to == other.to && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(from, to, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ActiveWindow{from=$from, to=$to, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = AllAffect.Builder::class)
        @NoAutoDetect
        class AllAffect
        private constructor(
            private val agencyId: JsonField<String>,
            private val applicationId: JsonField<String>,
            private val directionId: JsonField<String>,
            private val routeId: JsonField<String>,
            private val stopId: JsonField<String>,
            private val tripId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** Identifier for the agency. */
            fun agencyId(): String? = agencyId.getNullable("agencyId")

            /** Identifier for the application. */
            fun applicationId(): String? = applicationId.getNullable("applicationId")

            /** Identifier for the direction. */
            fun directionId(): String? = directionId.getNullable("directionId")

            /** Identifier for the route. */
            fun routeId(): String? = routeId.getNullable("routeId")

            /** Identifier for the stop. */
            fun stopId(): String? = stopId.getNullable("stopId")

            /** Identifier for the trip. */
            fun tripId(): String? = tripId.getNullable("tripId")

            /** Identifier for the agency. */
            @JsonProperty("agencyId") @ExcludeMissing fun _agencyId() = agencyId

            /** Identifier for the application. */
            @JsonProperty("applicationId") @ExcludeMissing fun _applicationId() = applicationId

            /** Identifier for the direction. */
            @JsonProperty("directionId") @ExcludeMissing fun _directionId() = directionId

            /** Identifier for the route. */
            @JsonProperty("routeId") @ExcludeMissing fun _routeId() = routeId

            /** Identifier for the stop. */
            @JsonProperty("stopId") @ExcludeMissing fun _stopId() = stopId

            /** Identifier for the trip. */
            @JsonProperty("tripId") @ExcludeMissing fun _tripId() = tripId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AllAffect = apply {
                if (!validated) {
                    agencyId()
                    applicationId()
                    directionId()
                    routeId()
                    stopId()
                    tripId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var agencyId: JsonField<String> = JsonMissing.of()
                private var applicationId: JsonField<String> = JsonMissing.of()
                private var directionId: JsonField<String> = JsonMissing.of()
                private var routeId: JsonField<String> = JsonMissing.of()
                private var stopId: JsonField<String> = JsonMissing.of()
                private var tripId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(allAffect: AllAffect) = apply {
                    this.agencyId = allAffect.agencyId
                    this.applicationId = allAffect.applicationId
                    this.directionId = allAffect.directionId
                    this.routeId = allAffect.routeId
                    this.stopId = allAffect.stopId
                    this.tripId = allAffect.tripId
                    additionalProperties(allAffect.additionalProperties)
                }

                /** Identifier for the agency. */
                fun agencyId(agencyId: String) = agencyId(JsonField.of(agencyId))

                /** Identifier for the agency. */
                @JsonProperty("agencyId")
                @ExcludeMissing
                fun agencyId(agencyId: JsonField<String>) = apply { this.agencyId = agencyId }

                /** Identifier for the application. */
                fun applicationId(applicationId: String) =
                    applicationId(JsonField.of(applicationId))

                /** Identifier for the application. */
                @JsonProperty("applicationId")
                @ExcludeMissing
                fun applicationId(applicationId: JsonField<String>) = apply {
                    this.applicationId = applicationId
                }

                /** Identifier for the direction. */
                fun directionId(directionId: String) = directionId(JsonField.of(directionId))

                /** Identifier for the direction. */
                @JsonProperty("directionId")
                @ExcludeMissing
                fun directionId(directionId: JsonField<String>) = apply {
                    this.directionId = directionId
                }

                /** Identifier for the route. */
                fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                /** Identifier for the route. */
                @JsonProperty("routeId")
                @ExcludeMissing
                fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                /** Identifier for the stop. */
                fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                /** Identifier for the stop. */
                @JsonProperty("stopId")
                @ExcludeMissing
                fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

                /** Identifier for the trip. */
                fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                /** Identifier for the trip. */
                @JsonProperty("tripId")
                @ExcludeMissing
                fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

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

                fun build(): AllAffect =
                    AllAffect(
                        agencyId,
                        applicationId,
                        directionId,
                        routeId,
                        stopId,
                        tripId,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AllAffect && agencyId == other.agencyId && applicationId == other.applicationId && directionId == other.directionId && routeId == other.routeId && stopId == other.stopId && tripId == other.tripId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(agencyId, applicationId, directionId, routeId, stopId, tripId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AllAffect{agencyId=$agencyId, applicationId=$applicationId, directionId=$directionId, routeId=$routeId, stopId=$stopId, tripId=$tripId, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Consequence.Builder::class)
        @NoAutoDetect
        class Consequence
        private constructor(
            private val condition: JsonField<String>,
            private val conditionDetails: JsonField<ConditionDetails>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** Condition of the consequence. */
            fun condition(): String? = condition.getNullable("condition")

            fun conditionDetails(): ConditionDetails? =
                conditionDetails.getNullable("conditionDetails")

            /** Condition of the consequence. */
            @JsonProperty("condition") @ExcludeMissing fun _condition() = condition

            @JsonProperty("conditionDetails")
            @ExcludeMissing
            fun _conditionDetails() = conditionDetails

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Consequence = apply {
                if (!validated) {
                    condition()
                    conditionDetails()?.validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var condition: JsonField<String> = JsonMissing.of()
                private var conditionDetails: JsonField<ConditionDetails> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(consequence: Consequence) = apply {
                    this.condition = consequence.condition
                    this.conditionDetails = consequence.conditionDetails
                    additionalProperties(consequence.additionalProperties)
                }

                /** Condition of the consequence. */
                fun condition(condition: String) = condition(JsonField.of(condition))

                /** Condition of the consequence. */
                @JsonProperty("condition")
                @ExcludeMissing
                fun condition(condition: JsonField<String>) = apply { this.condition = condition }

                fun conditionDetails(conditionDetails: ConditionDetails) =
                    conditionDetails(JsonField.of(conditionDetails))

                @JsonProperty("conditionDetails")
                @ExcludeMissing
                fun conditionDetails(conditionDetails: JsonField<ConditionDetails>) = apply {
                    this.conditionDetails = conditionDetails
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

                fun build(): Consequence =
                    Consequence(
                        condition,
                        conditionDetails,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = ConditionDetails.Builder::class)
            @NoAutoDetect
            class ConditionDetails
            private constructor(
                private val diversionPath: JsonField<DiversionPath>,
                private val diversionStopIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun diversionPath(): DiversionPath? = diversionPath.getNullable("diversionPath")

                fun diversionStopIds(): List<String>? =
                    diversionStopIds.getNullable("diversionStopIds")

                @JsonProperty("diversionPath") @ExcludeMissing fun _diversionPath() = diversionPath

                @JsonProperty("diversionStopIds")
                @ExcludeMissing
                fun _diversionStopIds() = diversionStopIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ConditionDetails = apply {
                    if (!validated) {
                        diversionPath()?.validate()
                        diversionStopIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var diversionPath: JsonField<DiversionPath> = JsonMissing.of()
                    private var diversionStopIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(conditionDetails: ConditionDetails) = apply {
                        this.diversionPath = conditionDetails.diversionPath
                        this.diversionStopIds = conditionDetails.diversionStopIds
                        additionalProperties(conditionDetails.additionalProperties)
                    }

                    fun diversionPath(diversionPath: DiversionPath) =
                        diversionPath(JsonField.of(diversionPath))

                    @JsonProperty("diversionPath")
                    @ExcludeMissing
                    fun diversionPath(diversionPath: JsonField<DiversionPath>) = apply {
                        this.diversionPath = diversionPath
                    }

                    fun diversionStopIds(diversionStopIds: List<String>) =
                        diversionStopIds(JsonField.of(diversionStopIds))

                    @JsonProperty("diversionStopIds")
                    @ExcludeMissing
                    fun diversionStopIds(diversionStopIds: JsonField<List<String>>) = apply {
                        this.diversionStopIds = diversionStopIds
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

                    fun build(): ConditionDetails =
                        ConditionDetails(
                            diversionPath,
                            diversionStopIds.map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = DiversionPath.Builder::class)
                @NoAutoDetect
                class DiversionPath
                private constructor(
                    private val length: JsonField<Long>,
                    private val levels: JsonField<String>,
                    private val points: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** Length of the diversion path. */
                    fun length(): Long? = length.getNullable("length")

                    /** Levels of the diversion path. */
                    fun levels(): String? = levels.getNullable("levels")

                    /** Points of the diversion path. */
                    fun points(): String? = points.getNullable("points")

                    /** Length of the diversion path. */
                    @JsonProperty("length") @ExcludeMissing fun _length() = length

                    /** Levels of the diversion path. */
                    @JsonProperty("levels") @ExcludeMissing fun _levels() = levels

                    /** Points of the diversion path. */
                    @JsonProperty("points") @ExcludeMissing fun _points() = points

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): DiversionPath = apply {
                        if (!validated) {
                            length()
                            levels()
                            points()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var length: JsonField<Long> = JsonMissing.of()
                        private var levels: JsonField<String> = JsonMissing.of()
                        private var points: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(diversionPath: DiversionPath) = apply {
                            this.length = diversionPath.length
                            this.levels = diversionPath.levels
                            this.points = diversionPath.points
                            additionalProperties(diversionPath.additionalProperties)
                        }

                        /** Length of the diversion path. */
                        fun length(length: Long) = length(JsonField.of(length))

                        /** Length of the diversion path. */
                        @JsonProperty("length")
                        @ExcludeMissing
                        fun length(length: JsonField<Long>) = apply { this.length = length }

                        /** Levels of the diversion path. */
                        fun levels(levels: String) = levels(JsonField.of(levels))

                        /** Levels of the diversion path. */
                        @JsonProperty("levels")
                        @ExcludeMissing
                        fun levels(levels: JsonField<String>) = apply { this.levels = levels }

                        /** Points of the diversion path. */
                        fun points(points: String) = points(JsonField.of(points))

                        /** Points of the diversion path. */
                        @JsonProperty("points")
                        @ExcludeMissing
                        fun points(points: JsonField<String>) = apply { this.points = points }

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

                        fun build(): DiversionPath =
                            DiversionPath(
                                length,
                                levels,
                                points,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiversionPath && length == other.length && levels == other.levels && points == other.points && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(length, levels, points, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "DiversionPath{length=$length, levels=$levels, points=$points, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ConditionDetails && diversionPath == other.diversionPath && diversionStopIds == other.diversionStopIds && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(diversionPath, diversionStopIds, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ConditionDetails{diversionPath=$diversionPath, diversionStopIds=$diversionStopIds, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Consequence && condition == other.condition && conditionDetails == other.conditionDetails && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(condition, conditionDetails, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Consequence{condition=$condition, conditionDetails=$conditionDetails, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Description.Builder::class)
        @NoAutoDetect
        class Description
        private constructor(
            private val lang: JsonField<String>,
            private val value: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** Language of the description. */
            fun lang(): String? = lang.getNullable("lang")

            /** Longer description of the situation. */
            fun value(): String? = value.getNullable("value")

            /** Language of the description. */
            @JsonProperty("lang") @ExcludeMissing fun _lang() = lang

            /** Longer description of the situation. */
            @JsonProperty("value") @ExcludeMissing fun _value() = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Description = apply {
                if (!validated) {
                    lang()
                    value()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var lang: JsonField<String> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(description: Description) = apply {
                    this.lang = description.lang
                    this.value = description.value
                    additionalProperties(description.additionalProperties)
                }

                /** Language of the description. */
                fun lang(lang: String) = lang(JsonField.of(lang))

                /** Language of the description. */
                @JsonProperty("lang")
                @ExcludeMissing
                fun lang(lang: JsonField<String>) = apply { this.lang = lang }

                /** Longer description of the situation. */
                fun value(value: String) = value(JsonField.of(value))

                /** Longer description of the situation. */
                @JsonProperty("value")
                @ExcludeMissing
                fun value(value: JsonField<String>) = apply { this.value = value }

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

                fun build(): Description =
                    Description(
                        lang,
                        value,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Description && lang == other.lang && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(lang, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Description{lang=$lang, value=$value, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = PublicationWindow.Builder::class)
        @NoAutoDetect
        class PublicationWindow
        private constructor(
            private val from: JsonField<Long>,
            private val to: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** Start time of the time window as a Unix timestamp. */
            fun from(): Long = from.getRequired("from")

            /** End time of the time window as a Unix timestamp. */
            fun to(): Long = to.getRequired("to")

            /** Start time of the time window as a Unix timestamp. */
            @JsonProperty("from") @ExcludeMissing fun _from() = from

            /** End time of the time window as a Unix timestamp. */
            @JsonProperty("to") @ExcludeMissing fun _to() = to

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PublicationWindow = apply {
                if (!validated) {
                    from()
                    to()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var from: JsonField<Long> = JsonMissing.of()
                private var to: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(publicationWindow: PublicationWindow) = apply {
                    this.from = publicationWindow.from
                    this.to = publicationWindow.to
                    additionalProperties(publicationWindow.additionalProperties)
                }

                /** Start time of the time window as a Unix timestamp. */
                fun from(from: Long) = from(JsonField.of(from))

                /** Start time of the time window as a Unix timestamp. */
                @JsonProperty("from")
                @ExcludeMissing
                fun from(from: JsonField<Long>) = apply { this.from = from }

                /** End time of the time window as a Unix timestamp. */
                fun to(to: Long) = to(JsonField.of(to))

                /** End time of the time window as a Unix timestamp. */
                @JsonProperty("to")
                @ExcludeMissing
                fun to(to: JsonField<Long>) = apply { this.to = to }

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

                fun build(): PublicationWindow =
                    PublicationWindow(
                        from,
                        to,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PublicationWindow && from == other.from && to == other.to && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(from, to, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PublicationWindow{from=$from, to=$to, additionalProperties=$additionalProperties}"
        }

        class Reason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val EQUIPMENT_REASON = Reason(JsonField.of("equipmentReason"))

                val ENVIRONMENT_REASON = Reason(JsonField.of("environmentReason"))

                val PERSONNEL_REASON = Reason(JsonField.of("personnelReason"))

                val MISCELLANEOUS_REASON = Reason(JsonField.of("miscellaneousReason"))

                val SECURITY_ALERT = Reason(JsonField.of("securityAlert"))

                fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                EQUIPMENT_REASON,
                ENVIRONMENT_REASON,
                PERSONNEL_REASON,
                MISCELLANEOUS_REASON,
                SECURITY_ALERT,
            }

            enum class Value {
                EQUIPMENT_REASON,
                ENVIRONMENT_REASON,
                PERSONNEL_REASON,
                MISCELLANEOUS_REASON,
                SECURITY_ALERT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    EQUIPMENT_REASON -> Value.EQUIPMENT_REASON
                    ENVIRONMENT_REASON -> Value.ENVIRONMENT_REASON
                    PERSONNEL_REASON -> Value.PERSONNEL_REASON
                    MISCELLANEOUS_REASON -> Value.MISCELLANEOUS_REASON
                    SECURITY_ALERT -> Value.SECURITY_ALERT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    EQUIPMENT_REASON -> Known.EQUIPMENT_REASON
                    ENVIRONMENT_REASON -> Known.ENVIRONMENT_REASON
                    PERSONNEL_REASON -> Known.PERSONNEL_REASON
                    MISCELLANEOUS_REASON -> Known.MISCELLANEOUS_REASON
                    SECURITY_ALERT -> Known.SECURITY_ALERT
                    else -> throw OnebusawaySdkInvalidDataException("Unknown Reason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = Summary.Builder::class)
        @NoAutoDetect
        class Summary
        private constructor(
            private val lang: JsonField<String>,
            private val value: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** Language of the summary. */
            fun lang(): String? = lang.getNullable("lang")

            /** Short summary of the situation. */
            fun value(): String? = value.getNullable("value")

            /** Language of the summary. */
            @JsonProperty("lang") @ExcludeMissing fun _lang() = lang

            /** Short summary of the situation. */
            @JsonProperty("value") @ExcludeMissing fun _value() = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Summary = apply {
                if (!validated) {
                    lang()
                    value()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var lang: JsonField<String> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(summary: Summary) = apply {
                    this.lang = summary.lang
                    this.value = summary.value
                    additionalProperties(summary.additionalProperties)
                }

                /** Language of the summary. */
                fun lang(lang: String) = lang(JsonField.of(lang))

                /** Language of the summary. */
                @JsonProperty("lang")
                @ExcludeMissing
                fun lang(lang: JsonField<String>) = apply { this.lang = lang }

                /** Short summary of the situation. */
                fun value(value: String) = value(JsonField.of(value))

                /** Short summary of the situation. */
                @JsonProperty("value")
                @ExcludeMissing
                fun value(value: JsonField<String>) = apply { this.value = value }

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

                fun build(): Summary =
                    Summary(
                        lang,
                        value,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Summary && lang == other.lang && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(lang, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Summary{lang=$lang, value=$value, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Url.Builder::class)
        @NoAutoDetect
        class Url
        private constructor(
            private val lang: JsonField<String>,
            private val value: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** Language of the URL. */
            fun lang(): String? = lang.getNullable("lang")

            /** URL for more information about the situation. */
            fun value(): String? = value.getNullable("value")

            /** Language of the URL. */
            @JsonProperty("lang") @ExcludeMissing fun _lang() = lang

            /** URL for more information about the situation. */
            @JsonProperty("value") @ExcludeMissing fun _value() = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Url = apply {
                if (!validated) {
                    lang()
                    value()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var lang: JsonField<String> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(url: Url) = apply {
                    this.lang = url.lang
                    this.value = url.value
                    additionalProperties(url.additionalProperties)
                }

                /** Language of the URL. */
                fun lang(lang: String) = lang(JsonField.of(lang))

                /** Language of the URL. */
                @JsonProperty("lang")
                @ExcludeMissing
                fun lang(lang: JsonField<String>) = apply { this.lang = lang }

                /** URL for more information about the situation. */
                fun value(value: String) = value(JsonField.of(value))

                /** URL for more information about the situation. */
                @JsonProperty("value")
                @ExcludeMissing
                fun value(value: JsonField<String>) = apply { this.value = value }

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

                fun build(): Url =
                    Url(
                        lang,
                        value,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Url && lang == other.lang && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(lang, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Url{lang=$lang, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Situation && id == other.id && creationTime == other.creationTime && reason == other.reason && summary == other.summary && description == other.description && url == other.url && activeWindows == other.activeWindows && allAffects == other.allAffects && consequences == other.consequences && publicationWindows == other.publicationWindows && severity == other.severity && consequenceMessage == other.consequenceMessage && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, creationTime, reason, summary, description, url, activeWindows, allAffects, consequences, publicationWindows, severity, consequenceMessage, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Situation{id=$id, creationTime=$creationTime, reason=$reason, summary=$summary, description=$description, url=$url, activeWindows=$activeWindows, allAffects=$allAffects, consequences=$consequences, publicationWindows=$publicationWindows, severity=$severity, consequenceMessage=$consequenceMessage, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Stop.Builder::class)
    @NoAutoDetect
    class Stop
    private constructor(
        private val code: JsonField<String>,
        private val direction: JsonField<String>,
        private val id: JsonField<String>,
        private val lat: JsonField<Double>,
        private val locationType: JsonField<Long>,
        private val lon: JsonField<Double>,
        private val name: JsonField<String>,
        private val parent: JsonField<String>,
        private val routeIds: JsonField<List<String>>,
        private val staticRouteIds: JsonField<List<String>>,
        private val wheelchairBoarding: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun code(): String = code.getRequired("code")

        fun direction(): String? = direction.getNullable("direction")

        fun id(): String = id.getRequired("id")

        fun lat(): Double = lat.getRequired("lat")

        fun locationType(): Long? = locationType.getNullable("locationType")

        fun lon(): Double = lon.getRequired("lon")

        fun name(): String = name.getRequired("name")

        fun parent(): String? = parent.getNullable("parent")

        fun routeIds(): List<String>? = routeIds.getNullable("routeIds")

        fun staticRouteIds(): List<String>? = staticRouteIds.getNullable("staticRouteIds")

        fun wheelchairBoarding(): String? = wheelchairBoarding.getNullable("wheelchairBoarding")

        @JsonProperty("code") @ExcludeMissing fun _code() = code

        @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("lat") @ExcludeMissing fun _lat() = lat

        @JsonProperty("locationType") @ExcludeMissing fun _locationType() = locationType

        @JsonProperty("lon") @ExcludeMissing fun _lon() = lon

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("parent") @ExcludeMissing fun _parent() = parent

        @JsonProperty("routeIds") @ExcludeMissing fun _routeIds() = routeIds

        @JsonProperty("staticRouteIds") @ExcludeMissing fun _staticRouteIds() = staticRouteIds

        @JsonProperty("wheelchairBoarding")
        @ExcludeMissing
        fun _wheelchairBoarding() = wheelchairBoarding

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Stop = apply {
            if (!validated) {
                code()
                direction()
                id()
                lat()
                locationType()
                lon()
                name()
                parent()
                routeIds()
                staticRouteIds()
                wheelchairBoarding()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var code: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var lat: JsonField<Double> = JsonMissing.of()
            private var locationType: JsonField<Long> = JsonMissing.of()
            private var lon: JsonField<Double> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var parent: JsonField<String> = JsonMissing.of()
            private var routeIds: JsonField<List<String>> = JsonMissing.of()
            private var staticRouteIds: JsonField<List<String>> = JsonMissing.of()
            private var wheelchairBoarding: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(stop: Stop) = apply {
                this.code = stop.code
                this.direction = stop.direction
                this.id = stop.id
                this.lat = stop.lat
                this.locationType = stop.locationType
                this.lon = stop.lon
                this.name = stop.name
                this.parent = stop.parent
                this.routeIds = stop.routeIds
                this.staticRouteIds = stop.staticRouteIds
                this.wheelchairBoarding = stop.wheelchairBoarding
                additionalProperties(stop.additionalProperties)
            }

            fun code(code: String) = code(JsonField.of(code))

            @JsonProperty("code")
            @ExcludeMissing
            fun code(code: JsonField<String>) = apply { this.code = code }

            fun direction(direction: String) = direction(JsonField.of(direction))

            @JsonProperty("direction")
            @ExcludeMissing
            fun direction(direction: JsonField<String>) = apply { this.direction = direction }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun lat(lat: Double) = lat(JsonField.of(lat))

            @JsonProperty("lat")
            @ExcludeMissing
            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

            fun locationType(locationType: Long) = locationType(JsonField.of(locationType))

            @JsonProperty("locationType")
            @ExcludeMissing
            fun locationType(locationType: JsonField<Long>) = apply {
                this.locationType = locationType
            }

            fun lon(lon: Double) = lon(JsonField.of(lon))

            @JsonProperty("lon")
            @ExcludeMissing
            fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun parent(parent: String) = parent(JsonField.of(parent))

            @JsonProperty("parent")
            @ExcludeMissing
            fun parent(parent: JsonField<String>) = apply { this.parent = parent }

            fun routeIds(routeIds: List<String>) = routeIds(JsonField.of(routeIds))

            @JsonProperty("routeIds")
            @ExcludeMissing
            fun routeIds(routeIds: JsonField<List<String>>) = apply { this.routeIds = routeIds }

            fun staticRouteIds(staticRouteIds: List<String>) =
                staticRouteIds(JsonField.of(staticRouteIds))

            @JsonProperty("staticRouteIds")
            @ExcludeMissing
            fun staticRouteIds(staticRouteIds: JsonField<List<String>>) = apply {
                this.staticRouteIds = staticRouteIds
            }

            fun wheelchairBoarding(wheelchairBoarding: String) =
                wheelchairBoarding(JsonField.of(wheelchairBoarding))

            @JsonProperty("wheelchairBoarding")
            @ExcludeMissing
            fun wheelchairBoarding(wheelchairBoarding: JsonField<String>) = apply {
                this.wheelchairBoarding = wheelchairBoarding
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

            fun build(): Stop =
                Stop(
                    code,
                    direction,
                    id,
                    lat,
                    locationType,
                    lon,
                    name,
                    parent,
                    routeIds.map { it.toImmutable() },
                    staticRouteIds.map { it.toImmutable() },
                    wheelchairBoarding,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Stop && code == other.code && direction == other.direction && id == other.id && lat == other.lat && locationType == other.locationType && lon == other.lon && name == other.name && parent == other.parent && routeIds == other.routeIds && staticRouteIds == other.staticRouteIds && wheelchairBoarding == other.wheelchairBoarding && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, direction, id, lat, locationType, lon, name, parent, routeIds, staticRouteIds, wheelchairBoarding, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Stop{code=$code, direction=$direction, id=$id, lat=$lat, locationType=$locationType, lon=$lon, name=$name, parent=$parent, routeIds=$routeIds, staticRouteIds=$staticRouteIds, wheelchairBoarding=$wheelchairBoarding, additionalProperties=$additionalProperties}"
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

        fun distanceAlongTrip(): Double? = distanceAlongTrip.getNullable("distanceAlongTrip")

        fun historicalOccupancy(): String? = historicalOccupancy.getNullable("historicalOccupancy")

        fun stopHeadsign(): String? = stopHeadsign.getNullable("stopHeadsign")

        fun stopId(): String? = stopId.getNullable("stopId")

        @JsonProperty("arrivalTime") @ExcludeMissing fun _arrivalTime() = arrivalTime

        @JsonProperty("departureTime") @ExcludeMissing fun _departureTime() = departureTime

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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
            fun arrivalTime(arrivalTime: JsonField<Long>) = apply { this.arrivalTime = arrivalTime }

            fun departureTime(departureTime: Long) = departureTime(JsonField.of(departureTime))

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

            fun stopHeadsign(stopHeadsign: String) = stopHeadsign(JsonField.of(stopHeadsign))

            @JsonProperty("stopHeadsign")
            @ExcludeMissing
            fun stopHeadsign(stopHeadsign: JsonField<String>) = apply {
                this.stopHeadsign = stopHeadsign
            }

            fun stopId(stopId: String) = stopId(JsonField.of(stopId))

            @JsonProperty("stopId")
            @ExcludeMissing
            fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

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

    @JsonDeserialize(builder = Trip.Builder::class)
    @NoAutoDetect
    class Trip
    private constructor(
        private val blockId: JsonField<String>,
        private val directionId: JsonField<String>,
        private val id: JsonField<String>,
        private val peakOffpeak: JsonField<Long>,
        private val routeId: JsonField<String>,
        private val routeShortName: JsonField<String>,
        private val serviceId: JsonField<String>,
        private val shapeId: JsonField<String>,
        private val timeZone: JsonField<String>,
        private val tripHeadsign: JsonField<String>,
        private val tripShortName: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun blockId(): String? = blockId.getNullable("blockId")

        fun directionId(): String? = directionId.getNullable("directionId")

        fun id(): String = id.getRequired("id")

        fun peakOffpeak(): Long? = peakOffpeak.getNullable("peakOffpeak")

        fun routeId(): String = routeId.getRequired("routeId")

        fun routeShortName(): String? = routeShortName.getNullable("routeShortName")

        fun serviceId(): String = serviceId.getRequired("serviceId")

        fun shapeId(): String? = shapeId.getNullable("shapeId")

        fun timeZone(): String? = timeZone.getNullable("timeZone")

        fun tripHeadsign(): String? = tripHeadsign.getNullable("tripHeadsign")

        fun tripShortName(): String? = tripShortName.getNullable("tripShortName")

        @JsonProperty("blockId") @ExcludeMissing fun _blockId() = blockId

        @JsonProperty("directionId") @ExcludeMissing fun _directionId() = directionId

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("peakOffpeak") @ExcludeMissing fun _peakOffpeak() = peakOffpeak

        @JsonProperty("routeId") @ExcludeMissing fun _routeId() = routeId

        @JsonProperty("routeShortName") @ExcludeMissing fun _routeShortName() = routeShortName

        @JsonProperty("serviceId") @ExcludeMissing fun _serviceId() = serviceId

        @JsonProperty("shapeId") @ExcludeMissing fun _shapeId() = shapeId

        @JsonProperty("timeZone") @ExcludeMissing fun _timeZone() = timeZone

        @JsonProperty("tripHeadsign") @ExcludeMissing fun _tripHeadsign() = tripHeadsign

        @JsonProperty("tripShortName") @ExcludeMissing fun _tripShortName() = tripShortName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Trip = apply {
            if (!validated) {
                blockId()
                directionId()
                id()
                peakOffpeak()
                routeId()
                routeShortName()
                serviceId()
                shapeId()
                timeZone()
                tripHeadsign()
                tripShortName()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var blockId: JsonField<String> = JsonMissing.of()
            private var directionId: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var peakOffpeak: JsonField<Long> = JsonMissing.of()
            private var routeId: JsonField<String> = JsonMissing.of()
            private var routeShortName: JsonField<String> = JsonMissing.of()
            private var serviceId: JsonField<String> = JsonMissing.of()
            private var shapeId: JsonField<String> = JsonMissing.of()
            private var timeZone: JsonField<String> = JsonMissing.of()
            private var tripHeadsign: JsonField<String> = JsonMissing.of()
            private var tripShortName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(trip: Trip) = apply {
                this.blockId = trip.blockId
                this.directionId = trip.directionId
                this.id = trip.id
                this.peakOffpeak = trip.peakOffpeak
                this.routeId = trip.routeId
                this.routeShortName = trip.routeShortName
                this.serviceId = trip.serviceId
                this.shapeId = trip.shapeId
                this.timeZone = trip.timeZone
                this.tripHeadsign = trip.tripHeadsign
                this.tripShortName = trip.tripShortName
                additionalProperties(trip.additionalProperties)
            }

            fun blockId(blockId: String) = blockId(JsonField.of(blockId))

            @JsonProperty("blockId")
            @ExcludeMissing
            fun blockId(blockId: JsonField<String>) = apply { this.blockId = blockId }

            fun directionId(directionId: String) = directionId(JsonField.of(directionId))

            @JsonProperty("directionId")
            @ExcludeMissing
            fun directionId(directionId: JsonField<String>) = apply {
                this.directionId = directionId
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun peakOffpeak(peakOffpeak: Long) = peakOffpeak(JsonField.of(peakOffpeak))

            @JsonProperty("peakOffpeak")
            @ExcludeMissing
            fun peakOffpeak(peakOffpeak: JsonField<Long>) = apply { this.peakOffpeak = peakOffpeak }

            fun routeId(routeId: String) = routeId(JsonField.of(routeId))

            @JsonProperty("routeId")
            @ExcludeMissing
            fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

            fun routeShortName(routeShortName: String) =
                routeShortName(JsonField.of(routeShortName))

            @JsonProperty("routeShortName")
            @ExcludeMissing
            fun routeShortName(routeShortName: JsonField<String>) = apply {
                this.routeShortName = routeShortName
            }

            fun serviceId(serviceId: String) = serviceId(JsonField.of(serviceId))

            @JsonProperty("serviceId")
            @ExcludeMissing
            fun serviceId(serviceId: JsonField<String>) = apply { this.serviceId = serviceId }

            fun shapeId(shapeId: String) = shapeId(JsonField.of(shapeId))

            @JsonProperty("shapeId")
            @ExcludeMissing
            fun shapeId(shapeId: JsonField<String>) = apply { this.shapeId = shapeId }

            fun timeZone(timeZone: String) = timeZone(JsonField.of(timeZone))

            @JsonProperty("timeZone")
            @ExcludeMissing
            fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

            fun tripHeadsign(tripHeadsign: String) = tripHeadsign(JsonField.of(tripHeadsign))

            @JsonProperty("tripHeadsign")
            @ExcludeMissing
            fun tripHeadsign(tripHeadsign: JsonField<String>) = apply {
                this.tripHeadsign = tripHeadsign
            }

            fun tripShortName(tripShortName: String) = tripShortName(JsonField.of(tripShortName))

            @JsonProperty("tripShortName")
            @ExcludeMissing
            fun tripShortName(tripShortName: JsonField<String>) = apply {
                this.tripShortName = tripShortName
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

            fun build(): Trip =
                Trip(
                    blockId,
                    directionId,
                    id,
                    peakOffpeak,
                    routeId,
                    routeShortName,
                    serviceId,
                    shapeId,
                    timeZone,
                    tripHeadsign,
                    tripShortName,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Trip && blockId == other.blockId && directionId == other.directionId && id == other.id && peakOffpeak == other.peakOffpeak && routeId == other.routeId && routeShortName == other.routeShortName && serviceId == other.serviceId && shapeId == other.shapeId && timeZone == other.timeZone && tripHeadsign == other.tripHeadsign && tripShortName == other.tripShortName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(blockId, directionId, id, peakOffpeak, routeId, routeShortName, serviceId, shapeId, timeZone, tripHeadsign, tripShortName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Trip{blockId=$blockId, directionId=$directionId, id=$id, peakOffpeak=$peakOffpeak, routeId=$routeId, routeShortName=$routeShortName, serviceId=$serviceId, shapeId=$shapeId, timeZone=$timeZone, tripHeadsign=$tripHeadsign, tripShortName=$tripShortName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is References && agencies == other.agencies && routes == other.routes && situations == other.situations && stopTimes == other.stopTimes && stops == other.stops && trips == other.trips && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(agencies, routes, situations, stopTimes, stops, trips, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "References{agencies=$agencies, routes=$routes, situations=$situations, stopTimes=$stopTimes, stops=$stops, trips=$trips, additionalProperties=$additionalProperties}"
}
