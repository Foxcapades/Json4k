package io.foxcapades.lib.json4k

import java.io.InputStream
import java.io.Reader
import java.math.BigDecimal
import java.math.BigInteger
import java.util.ServiceLoader

/**
 * Access point to the Json4k library.
 *
 * @since v1.0.0
 */
object Json {
  private val factory: JsonFactory =
    ServiceLoader.load(JsonFactory::class.java)!!.firstOrNull()
      ?: throw RuntimeException("No implementation of json4k found.")

  /**
   * Creates a new Json array element.
   *
   * @param initialSize Initial size to create the Json array at.
   *
   * @return A new Json array element.
   */
  fun newArray(initialSize: Int = 1) = factory.newArray(initialSize)

  /**
   * Creates a new Json array element, then executes the given action on that
   * element.
   *
   * @param initialSize Initial size to create the Json array at.
   *
   * @param action Action to execute on the newly created array element.
   *
   * @return The new Json array element.
   *
   * @since v1.3.0
   */
  inline fun newArray(initialSize: Int = 1, action: JsonArray.() -> Unit): JsonArray {
    return newArray(initialSize).apply(action)
  }

  /**
   * Creates a new Json boolean element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json boolean element.
   */
  fun newBool(value: Boolean) = factory.newBool(value)

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: Byte) = factory.newInt(value)

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: UByte) = factory.newInt(value)

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: Short) = factory.newInt(value)

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: UShort) = factory.newInt(value)

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: Int) = factory.newInt(value)

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: UInt) = factory.newInt(value)

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: Long) = factory.newInt(value)

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: ULong) = factory.newInt(value)

  /**
   * Creates a new Json integer element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json integer element.
   */
  fun newInt(value: BigInteger) = factory.newInt(value)

  /**
   * Creates a new Json null element.
   *
   * @return A new Json null element.
   */
  fun newNull() = factory.newNull()

  /**
   * Creates a new Json number element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json number element.
   */
  fun newNumber(value: Float) = factory.newNumber(value)

  /**
   * Creates a new Json number element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json number element.
   */
  fun newNumber(value: Double) = factory.newNumber(value)

  /**
   * Creates a new Json number element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json number element.
   */
  fun newNumber(value: BigDecimal) = factory.newNumber(value)

  /**
   * Creates a new Json object element.
   *
   * @param initialSize Initial size the new Json object will be created at.
   *
   * @return A new Json object element.
   */
  fun newObject(initialSize: Int = 1) = factory.newObject()

  /**
   * Creates a new Json object element, then executes the given action on that
   * element.
   *
   * @param initialSize Initial size to create the Json object at.
   *
   * @param action Action to execute on the newly created object element.
   *
   * @return The new Json object element.
   *
   * @since v1.3.0
   */
  inline fun newObject(initialSize: Int = 1, action: JsonObject.() -> Unit): JsonObject {
    return newObject(initialSize).apply(action)
  }

  /**
   * Creates a new Json string element.
   *
   * @param value Value to be wrapped by the new element.
   *
   * @return A new Json string element.
   */
  fun newString(value: String) = factory.newString(value)

  /**
   * Deserializes the given [InputStream] into a [JsonElement].
   *
   * @since v1.1.0
   */
  fun deserialize(stream: InputStream) = factory.deserialize(stream)

  /**
   * Deserializes the given [Reader] into a [JsonElement].
   *
   * @since v1.1.0
   */
  fun deserialize(reader: Reader) = factory.deserialize(reader)

  /**
   * Deserializes the given [String] into a [JsonElement].
   *
   * @since v1.1.0
   */
  fun deserialize(string: String) = factory.deserialize(string)
}