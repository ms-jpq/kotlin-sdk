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

@JsonDeserialize(builder = AgencyRetrieveResponse.Builder::class)
@NoAutoDetect
class AgencyRetrieveResponse
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

    fun validate(): AgencyRetrieveResponse = apply {
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

        internal fun from(agencyRetrieveResponse: AgencyRetrieveResponse) = apply {
            this.code = agencyRetrieveResponse.code
            this.currentTime = agencyRetrieveResponse.currentTime
            this.text = agencyRetrieveResponse.text
            this.version = agencyRetrieveResponse.version
            this.data = agencyRetrieveResponse.data
            additionalProperties(agencyRetrieveResponse.additionalProperties)
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

        fun build(): AgencyRetrieveResponse =
            AgencyRetrieveResponse(
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
        private val entry: JsonField<Entry>,
        private val references: JsonField<References>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun limitExceeded(): Boolean = limitExceeded.getRequired("limitExceeded")

        fun entry(): Entry = entry.getRequired("entry")

        fun references(): References = references.getRequired("references")

        @JsonProperty("limitExceeded") @ExcludeMissing fun _limitExceeded() = limitExceeded

        @JsonProperty("entry") @ExcludeMissing fun _entry() = entry

        @JsonProperty("references") @ExcludeMissing fun _references() = references

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                limitExceeded()
                entry().validate()
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
            private var entry: JsonField<Entry> = JsonMissing.of()
            private var references: JsonField<References> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                this.limitExceeded = data.limitExceeded
                this.entry = data.entry
                this.references = data.references
                additionalProperties(data.additionalProperties)
            }

            fun limitExceeded(limitExceeded: Boolean) = limitExceeded(JsonField.of(limitExceeded))

            @JsonProperty("limitExceeded")
            @ExcludeMissing
            fun limitExceeded(limitExceeded: JsonField<Boolean>) = apply {
                this.limitExceeded = limitExceeded
            }

            fun entry(entry: Entry) = entry(JsonField.of(entry))

            @JsonProperty("entry")
            @ExcludeMissing
            fun entry(entry: JsonField<Entry>) = apply { this.entry = entry }

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
                    entry,
                    references,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = Entry.Builder::class)
        @NoAutoDetect
        class Entry
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

            fun validate(): Entry = apply {
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

                internal fun from(entry: Entry) = apply {
                    this.disclaimer = entry.disclaimer
                    this.email = entry.email
                    this.fareUrl = entry.fareUrl
                    this.id = entry.id
                    this.lang = entry.lang
                    this.name = entry.name
                    this.phone = entry.phone
                    this.privateService = entry.privateService
                    this.timezone = entry.timezone
                    this.url = entry.url
                    additionalProperties(entry.additionalProperties)
                }

                fun disclaimer(disclaimer: String) = disclaimer(JsonField.of(disclaimer))

                @JsonProperty("disclaimer")
                @ExcludeMissing
                fun disclaimer(disclaimer: JsonField<String>) = apply {
                    this.disclaimer = disclaimer
                }

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Entry =
                    Entry(
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

                return /* spotless:off */ other is Entry && disclaimer == other.disclaimer && email == other.email && fareUrl == other.fareUrl && id == other.id && lang == other.lang && name == other.name && phone == other.phone && privateService == other.privateService && timezone == other.timezone && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(disclaimer, email, fareUrl, id, lang, name, phone, privateService, timezone, url, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{disclaimer=$disclaimer, email=$email, fareUrl=$fareUrl, id=$id, lang=$lang, name=$name, phone=$phone, privateService=$privateService, timezone=$timezone, url=$url, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && limitExceeded == other.limitExceeded && entry == other.entry && references == other.references && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(limitExceeded, entry, references, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{limitExceeded=$limitExceeded, entry=$entry, references=$references, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AgencyRetrieveResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgencyRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
