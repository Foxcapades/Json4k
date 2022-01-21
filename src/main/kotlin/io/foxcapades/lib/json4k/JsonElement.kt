package io.foxcapades.lib.json4k

/**
 * Base type for all Json element types.
 *
 * @since v1.0.0
 */
interface JsonElement {
  /**
   * The type of this element.
   */
  val type: JsonElementType

  /**
   * Renders this Json element as a minified Json string.
   *
   * @return Minified json string.
   */
  fun toJsonString(): String

  /**
   * Renders this Json element as a "pretty" Json string.
   *
   * @return "Pretty" json string.
   */
  fun toPrettyJsonString(): String

  /**
   * Executes the given action if this [JsonElement] is an instance of
   * [JsonArray].
   *
   * @param action Action to execute.
   *
   * @since v1.3.0
   */
  fun ifArray(action: JsonArray.() -> Unit)

  /**
   * Executes the given action if this [JsonElement] is an instance of
   * [JsonArray].
   *
   * @param action Action to execute.
   *
   * @since v1.3.0
   */
  fun ifBoolean(action: JsonBoolean.() -> Unit)

  /**
   * Executes the given action if this [JsonElement] is an instance of
   * [JsonArray].
   *
   * @param action Action to execute.
   *
   * @since v1.3.0
   */
  fun ifDecimal(action: JsonNumber.() -> Unit)

  /**
   * Executes the given action if this [JsonElement] is an instance of
   * [JsonInteger].
   *
   * @param action Action to execute.
   *
   * @since v1.3.0
   */
  fun ifIntegral(action: JsonInteger.() -> Unit)

  /**
   * Executes the given action if this [JsonElement] is an instance of
   * [JsonNull].
   *
   * @param action Action to execute.
   *
   * @since v1.3.0
   */
  fun ifNull(action: JsonNull.() -> Unit)

  /**
   * Executes the given action if this [JsonElement] is an instance of
   * [JsonNumeric].
   *
   * @param action Action to execute.
   *
   * @since v1.3.0
   */
  fun ifNumeric(action: JsonNumeric.() -> Unit)

  /**
   * Executes the given action if this [JsonElement] is an instance of
   * [JsonObject].
   *
   * @param action Action to execute.
   *
   * @since v1.3.0
   */
  fun ifObject(action: JsonObject.() -> Unit)

  /**
   * Executes the given action if this [JsonElement] is an instance of
   * [JsonString].
   *
   * @param action Action to execute.
   *
   * @since v1.3.0
   */
  fun ifString(action: JsonString.() -> Unit)
}