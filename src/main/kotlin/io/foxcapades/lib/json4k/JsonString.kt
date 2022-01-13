package io.foxcapades.lib.json4k

/**
 * Represents a Json `string` element.
 *
 * @since v1.0.0
 */
interface JsonString : JsonElement {
  /**
   * The length of the string wrapped by this [JsonString] element.
   *
   * If this string is wrapping an encoded binary value, this length will be
   * twice the size of the binary value.
   */
  val length: Int

  /**
   * Whether the string wrapped by this [JsonString] is empty, i.e. has a length
   * of `0`.
   */
  val isEmpty: Boolean

  /**
   * Whether the string wrapped by this [JsonString] is not empty, i.e. has a
   * length greater than `0`.
   */
  val isNotEmpty: Boolean

  /**
   * Whether the string wrapped by this [JsonString] is blank, i.e. is empty or
   * contains only whitespace characters.
   */
  val isBlank: Boolean

  /**
   * Whether the string wrapped by this [JsonString] is not blank, i.e. is not
   * empty and contains at least 1 non-whitespace character.
   */
  val isNotBlank: Boolean

  /**
   * Returns the raw string value wrapped by this [JsonString].
   *
   * @return The value wrapped by this [JsonString].
   */
  fun stringValue(): String

  /**
   * Attempts to translate the string value wrapped by this [JsonString].
   *
   * @return The translated byte array parsed from the string wrapped by this
   * [JsonString].
   *
   * @throws NonBinaryStringException If the value wrapped by this [JsonString]
   * is not a valid hex string.
   */
  fun binaryValue(): ByteArray

  class NonBinaryStringException() : RuntimeException()
}