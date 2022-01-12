package io.foxcapades.lib.json4k

/**
 * Represents a Json boolean element.
 *
 * @since v1.0.0
 */
interface JsonBoolean : JsonElement {
  fun booleanValue(): Boolean
}