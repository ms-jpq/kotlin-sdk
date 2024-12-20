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

@JsonDeserialize(builder = RouteRetrieveResponse.Builder::class)
@NoAutoDetect
class RouteRetrieveResponse
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

    fun validate(): RouteRetrieveResponse = apply {
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

        internal fun from(routeRetrieveResponse: RouteRetrieveResponse) = apply {
            this.code = routeRetrieveResponse.code
            this.currentTime = routeRetrieveResponse.currentTime
            this.text = routeRetrieveResponse.text
            this.version = routeRetrieveResponse.version
            this.data = routeRetrieveResponse.data
            additionalProperties(routeRetrieveResponse.additionalProperties)
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

        fun build(): RouteRetrieveResponse =
            RouteRetrieveResponse(
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
        private val entry: JsonField<Entry>,
        private val references: JsonField<References>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun entry(): Entry = entry.getRequired("entry")

        fun references(): References = references.getRequired("references")

        @JsonProperty("entry") @ExcludeMissing fun _entry() = entry

        @JsonProperty("references") @ExcludeMissing fun _references() = references

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
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

            private var entry: JsonField<Entry> = JsonMissing.of()
            private var references: JsonField<References> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                this.entry = data.entry
                this.references = data.references
                additionalProperties(data.additionalProperties)
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
                    entry,
                    references,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = Entry.Builder::class)
        @NoAutoDetect
        class Entry
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

            fun validate(): Entry = apply {
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

                internal fun from(entry: Entry) = apply {
                    this.agencyId = entry.agencyId
                    this.color = entry.color
                    this.description = entry.description
                    this.id = entry.id
                    this.longName = entry.longName
                    this.nullSafeShortName = entry.nullSafeShortName
                    this.shortName = entry.shortName
                    this.textColor = entry.textColor
                    this.type = entry.type
                    this.url = entry.url
                    additionalProperties(entry.additionalProperties)
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Entry =
                    Entry(
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

                return /* spotless:off */ other is Entry && agencyId == other.agencyId && color == other.color && description == other.description && id == other.id && longName == other.longName && nullSafeShortName == other.nullSafeShortName && shortName == other.shortName && textColor == other.textColor && type == other.type && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(agencyId, color, description, id, longName, nullSafeShortName, shortName, textColor, type, url, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{agencyId=$agencyId, color=$color, description=$description, id=$id, longName=$longName, nullSafeShortName=$nullSafeShortName, shortName=$shortName, textColor=$textColor, type=$type, url=$url, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && entry == other.entry && references == other.references && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entry, references, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{entry=$entry, references=$references, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RouteRetrieveResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RouteRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
