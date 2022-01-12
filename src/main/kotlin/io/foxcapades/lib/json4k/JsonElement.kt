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
}