package io.foxcapades.lib.json4k

import java.io.InputStream
import java.io.Reader
import java.math.BigDecimal
import java.math.BigInteger

/**
 * Factory for creating Json elements.
 *
 * Implementations of this type should have a no-arg constructor as they will
 * be created reflectively on library load.
 *
 * @since v1.0.0
 */
interface JsonFactory {

  /**
   * Creates a new Json array element.
   *
   * @param initialSize Initial size to create the Json array at.
   *
   * @return A new Json array element.
   */
  fun newArray(initialSize: Int = 1): JsonArray

  /**
   * Creates a new Json boolean element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json boolean element.
   */
  fun newBool(value: Boolean): JsonBoolean

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: Byte): JsonInteger

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: UByte): JsonInteger

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: Short): JsonInteger

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: UShort): JsonInteger

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: Int): JsonInteger

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: UInt): JsonInteger

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: Long): JsonInteger

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: ULong): JsonInteger

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: BigInteger): JsonInteger

  /**
   * Creates a new Json null element.
   *
   * @return A new Json null element.
   */
  fun newNull(): JsonNull

  /**
   * Creates a new Json number element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json number element.
   */
  fun newNumber(value: Float): JsonNumber

  /**
   * Creates a new Json number element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json number element.
   */
  fun newNumber(value: Double): JsonNumber

  /**
   * Creates a new Json number element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json number element.
   */
  fun newNumber(value: BigDecimal): JsonNumber

  /**
   * Creates a new Json object element.
   *
   * @param initialSize Initial size the new Json object will be created at.
   *
   * @return A new Json object element.
   */
  fun newObject(initialSize: Int = 1): JsonObject

  /**
   * Creates a new Json string element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json string element.
   */
  fun newString(value: String): JsonString

  fun deserialize(stream: InputStream): JsonElement

  fun deserialize(reader: Reader): JsonElement

  fun deserialize(string: String): JsonElement
}