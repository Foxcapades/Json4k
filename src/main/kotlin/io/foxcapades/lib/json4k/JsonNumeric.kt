package io.foxcapades.lib.json4k

/**
 * Base type for numeric Json elements.
 *
 * @since v1.0.0
 */
sealed interface JsonNumeric : JsonElement {

  /**
   * Indicates whether the numeric value is an integral number.
   *
   * @since v1.2.0
   */
  val isIntegral: Boolean

  class PrecisionLossException(msg: String) : RuntimeException(msg)
}