package io.foxcapades.lib.json4k

import java.math.BigDecimal
import java.math.BigInteger

/**
 * Represents a Json `array` element.
 *
 * @since v1.0.0
 */
interface JsonArray : JsonElement, Iterator<JsonElement> {
  /**
   * Number of elements contained in this [JsonArray].
   */
  val size: Int

  /**
   * Performs an arbitrary action on this [JsonArray].
   *
   * @param action Action to perform.
   */
  fun with(action: JsonArray.() -> Unit)

  /**
   * Performs an arbitrary action on this [JsonArray] only if the given
   * [condition] value is `true`.
   *
   * @param condition Condition controlling whether the given [action] will be
   * executed.
   *
   * @param action Action to perform.
   */
  fun withIf(condition: Boolean, action: JsonArray.() -> Unit)

  // region Add

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: Byte): JsonArray

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: Short): JsonArray

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: Int): JsonArray

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: Long): JsonArray

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: UByte): JsonArray

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: UShort): JsonArray

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: UInt): JsonArray

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: ULong): JsonArray

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: Float): JsonArray

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: Double): JsonArray

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: BigInteger): JsonArray

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: BigDecimal): JsonArray

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: String): JsonArray

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: Boolean): JsonArray

  /**
   * Adds the given values to this Json array.
   *
   * Given values will be wrapped with the correct Json element.
   *
   * @param values Values to append.
   *
   * @return This [JsonArray] instance.
   */
  fun add(vararg values: JsonElement): JsonArray

  /**
   * Adds a Json null element to this Json array.
   *
   * @return This [JsonArray] instance.
   */
  fun addNull(): JsonArray

  // endregion

  // region Add If

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: Byte): JsonArray

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: UByte): JsonArray

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: Short): JsonArray

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: UShort): JsonArray

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: Int): JsonArray

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: UInt): JsonArray

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: Long): JsonArray

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: ULong): JsonArray

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: BigInteger): JsonArray

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: Float): JsonArray

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: Double): JsonArray

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: BigDecimal): JsonArray

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: Boolean): JsonArray

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: String): JsonArray

  /**
   * Adds the given values to this Json array only if [condition] is `true`.
   *
   * Values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param values Values to append to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addIf(condition: Boolean, vararg values: JsonElement): JsonArray

  /**
   * Adds a Json `null` element to this Json array only if [condition] is
   * `true`.
   *
   * @param condition Condition controlling whether a `null` value will be
   * appended to this array.
   *
   * @return This [JsonArray] instance.
   */
  fun addNullIf(condition: Boolean): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addByteIf(condition: Boolean, action: () -> Byte): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addUByteIf(condition: Boolean, action: () -> UByte): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addShortIf(condition: Boolean, action: () -> Short): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addUShortIf(condition: Boolean, action: () -> UShort): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addIntIf(condition: Boolean, action: () -> Int): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addUIntIf(condition: Boolean, action: () -> UInt): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addLongIf(condition: Boolean, action: () -> Long): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addULongIf(condition: Boolean, action: () -> ULong): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [action] will be
   * executed.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addBigIntIf(condition: Boolean, action: () -> BigInteger): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addFloatIf(condition: Boolean, action: () -> Float): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addDoubleIf(condition: Boolean, action: () -> Double): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addBigDecIf(condition: Boolean, action: () -> BigDecimal): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addBoolIf(condition: Boolean, action: () -> Boolean): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addStringIf(condition: Boolean, action: () -> String): JsonArray

  /**
   * Adds the given value returned by the given provider to this Json array only
   * if [condition] is `true`.
   *
   * Returned values will be wrapped with the appropriate Json element type.
   *
   * @param condition Condition controlling whether the given [values] will be
   * appended to this array.
   *
   * @param action Value provider.
   *
   * @return This [JsonArray] instance.
   */
  fun addElementIf(condition: Boolean, action: () -> JsonElement): JsonArray

  // endregion

  /**
   * Gets the [JsonElement] at the given index.
   *
   * @param index Index of the [JsonElement] to get.
   *
   * @return The [JsonElement] at the given index.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun get(index: Int): JsonElement

  // region Set

  /**
   * Sets the given [value] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param value Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, value: Byte)

  /**
   * Sets the given [value] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param value Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, value: UByte)

  /**
   * Sets the given [value] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param value Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, value: Short)

  /**
   * Sets the given [value] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param value Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, value: UShort)

  /**
   * Sets the given [value] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param value Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, value: Int)

  /**
   * Sets the given [value] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param value Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, value: UInt)

  /**
   * Sets the given [value] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param value Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, value: Long)

  /**
   * Sets the given [value] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param value Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, value: ULong)

  /**
   * Sets the given [value] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param value Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, value: BigInteger)

  /**
   * Sets the given [value] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param value Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, value: Float)

  /**
   * Sets the given [value] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param value Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, value: Double)

  /**
   * Sets the given [value] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param value Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, value: BigDecimal)

  /**
   * Sets the given [value] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param value Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, value: Boolean)

  /**
   * Sets the given [value] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param value Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, value: String)

  /**
   * Sets the given [node] to this Json array at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @param node Value to set.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  operator fun set(index: Int, node: JsonElement)

  /**
   * Sets a Json `null` element to this [JsonArray] at the given [index].
   *
   * The element already set on this [JsonObject] at the given [index] will be
   * overwritten.
   *
   * @param index Index to set the value at.
   *
   * @throws IndexOutOfBoundsException If the given [index] is higher than
   * `this.size - 1`.
   */
  fun setNull(index: Int): JsonArray

  // endregion

  // region Contains

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] matching
   * the given input.
   *
   * @param node [JsonElement] to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] matching the
   * given [node].
   */
  operator fun contains(node: JsonElement): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] wrapping the
   * given [value].
   */
  operator fun contains(value: Byte): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] wrapping the
   * given [value].
   */
  operator fun contains(value: Short): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] wrapping the
   * given [value].
   */
  operator fun contains(value: Int): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] wrapping the
   * given [value].
   */
  operator fun contains(value: Long): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] wrapping the
   * given [value].
   */
  operator fun contains(value: UByte): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] wrapping the
   * given [value].
   */
  operator fun contains(value: UShort): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] wrapping the
   * given [value].
   */
  operator fun contains(value: UInt): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] wrapping the
   * given [value].
   */
  operator fun contains(value: ULong): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] wrapping the
   * given [value].
   */
  operator fun contains(value: Float): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] wrapping the
   * given [value].
   */
  operator fun contains(value: Double): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] wrapping the
   * given [value].
   */
  operator fun contains(value: BigInteger): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] wrapping the
   * given [value].
   */
  operator fun contains(value: BigDecimal): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] wrapping the
   * given [value].
   */
  operator fun contains(value: Boolean): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   *
   * @return Whether this [JsonArray] contains a [JsonElement] wrapping the
   * given [value].
   */
  operator fun contains(value: String): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonNull] elements.
   *
   * @return Whether this [JsonArray] contains a [JsonNull] element.
   */
  fun containsNull()

  // endregion
}