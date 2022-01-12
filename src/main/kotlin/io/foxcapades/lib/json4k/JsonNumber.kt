package io.foxcapades.lib.json4k

import java.math.BigDecimal
import io.foxcapades.lib.json4k.JsonNumeric.PrecisionLossException

/**
 * Represents a Json `number` element.
 *
 * @since v1.0.0
 */
interface JsonNumber : JsonNumeric, Comparable<JsonNumeric> {
  /**
   * Attempts to return the value wrapped by this element as a [Float].
   *
   * @return The wrapped value as a [Float].
   *
   * @throws PrecisionLossException If the value wrapped by this element is too
   * large/precise to be returned as a [Float].
   */
  fun floatValue(): Float

  /**
   * Attempts to return the value wrapped by this element as a [Double].
   *
   * @return The wrapped value as a [Double].
   *
   * @throws PrecisionLossException If the value wrapped by this element is too
   * large/precise to be returned as a [Double].
   */
  fun doubleValue(): Double

  /**
   * Attempts to return the value wrapped by this element as a [BigDecimal].
   *
   * @return The wrapped value as a [BigDecimal].
   */
  fun bigDecValue(): BigDecimal
}