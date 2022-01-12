package io.foxcapades.lib.json4k

import java.math.BigInteger
import io.foxcapades.lib.json4k.JsonNumeric.PrecisionLossException

/**
 * Represents a Json integer.
 *
 * @since v1.0.0
 */
interface JsonInteger : JsonNumeric, Comparable<JsonNumeric> {

  /**
   * Attempts to return the value wrapped by this element as a [Byte].
   *
   * @return The wrapped value as a [Byte].
   *
   * @throws PrecisionLossException If the value wrapped by this element is too
   * large to be returned as a [Byte].
   */
  fun byteValue(): Byte

  /**
   * Attempts to return the value wrapped by this element as a [UByte].
   *
   * @return The wrapped value as a [UByte].
   *
   * @throws PrecisionLossException If the value wrapped by this element is too
   * large to be returned as a [UByte].
   */
  fun uByteValue(): UByte

  /**
   * Attempts to return the value wrapped by this element as a [Short].
   *
   * @return The wrapped value as a [Short].
   *
   * @throws PrecisionLossException If the value wrapped by this element is too
   * large to be returned as a [Short].
   */
  fun shortValue(): Short

  /**
   * Attempts to return the value wrapped by this element as a [UShort].
   *
   * @return The wrapped value as a [UShort].
   *
   * @throws PrecisionLossException If the value wrapped by this element is too
   * large to be returned as a [UShort].
   */
  fun uShortValue(): UShort

  /**
   * Attempts to return the value wrapped by this element as a [Int].
   *
   * @return The wrapped value as a [Int].
   *
   * @throws PrecisionLossException If the value wrapped by this element is too
   * large to be returned as a [Int].
   */
  fun intValue(): Int

  /**
   * Attempts to return the value wrapped by this element as a [UInt].
   *
   * @return The wrapped value as a [UInt].
   *
   * @throws PrecisionLossException If the value wrapped by this element is too
   * large to be returned as a [UInt].
   */
  fun uIntValue(): UInt

  /**
   * Attempts to return the value wrapped by this element as a [Long].
   *
   * @return The wrapped value as a [Long].
   *
   * @throws PrecisionLossException If the value wrapped by this element is too
   * large to be returned as a [Long].
   */
  fun longValue(): Long

  /**
   * Attempts to return the value wrapped by this element as a [ULong].
   *
   * @return The wrapped value as a [ULong].
   *
   * @throws PrecisionLossException If the value wrapped by this element is too
   * large to be returned as a [ULong].
   */
  fun uLongValue(): ULong

  /**
   * Attempts to return the value wrapped by this element as a [BigInteger].
   *
   * @return The wrapped value as a [BigInteger].
   */
  fun bigIntValue(): BigInteger
}