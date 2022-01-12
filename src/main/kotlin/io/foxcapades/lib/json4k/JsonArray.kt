package io.foxcapades.lib.json4k

import java.math.BigDecimal
import java.math.BigInteger

interface JsonArray : JsonElement, Iterator<JsonElement> {
  val size: Int

  fun with(fn: JsonArray.() -> Unit)

  fun withIf(condition: Boolean, fn: JsonArray.() -> Unit)

  // region Add

  fun add(vararg values: Byte): JsonArray

  fun add(vararg values: Short): JsonArray

  fun add(vararg values: Int): JsonArray

  fun add(vararg values: Long): JsonArray

  fun add(vararg values: UByte): JsonArray

  fun add(vararg values: UShort): JsonArray

  fun add(vararg values: UInt): JsonArray

  fun add(vararg values: ULong): JsonArray

  fun add(vararg values: Float): JsonArray

  fun add(vararg values: Double): JsonArray

  fun add(vararg values: BigInteger): JsonArray

  fun add(vararg values: BigDecimal): JsonArray

  fun add(vararg values: String): JsonArray

  fun add(vararg values: Boolean): JsonArray

  fun add(vararg values: JsonElement): JsonArray

  fun addNull(): JsonArray

  // endregion

  // region Add If

  fun addIf(condition: Boolean, vararg values: Byte): JsonArray

  fun addIf(condition: Boolean, vararg values: UByte): JsonArray

  fun addIf(condition: Boolean, vararg values: Short): JsonArray

  fun addIf(condition: Boolean, vararg values: UShort): JsonArray

  fun addIf(condition: Boolean, vararg values: Int): JsonArray

  fun addIf(condition: Boolean, vararg values: UInt): JsonArray

  fun addIf(condition: Boolean, vararg values: Long): JsonArray

  fun addIf(condition: Boolean, vararg values: ULong): JsonArray

  fun addIf(condition: Boolean, vararg values: BigInteger): JsonArray

  fun addIf(condition: Boolean, vararg values: Float): JsonArray

  fun addIf(condition: Boolean, vararg values: Double): JsonArray

  fun addIf(condition: Boolean, vararg values: BigDecimal): JsonArray

  fun addIf(condition: Boolean, vararg values: Boolean): JsonArray

  fun addIf(condition: Boolean, vararg values: String): JsonArray

  fun addIf(condition: Boolean, vararg values: JsonElement): JsonArray

  fun addNullIf(condition: Boolean)

  fun addByteIf(condition: Boolean, fn: () -> Byte): JsonArray

  fun addUByteIf(condition: Boolean, fn: () -> UByte): JsonArray

  fun addShortIf(condition: Boolean, fn: () -> Short): JsonArray

  fun addUShortIf(condition: Boolean, fn: () -> UShort): JsonArray

  fun addIntIf(condition: Boolean, fn: () -> Int): JsonArray

  fun addUIntIf(condition: Boolean, fn: () -> UInt): JsonArray

  fun addLongIf(condition: Boolean, fn: () -> Long): JsonArray

  fun addULongIf(condition: Boolean, fn: () -> ULong): JsonArray

  fun addBigIntIf(condition: Boolean, fn: () -> BigInteger): JsonArray

  fun addFloatIf(condition: Boolean, fn: () -> Float): JsonArray

  fun addDoubleIf(condition: Boolean, fn: () -> Double): JsonArray

  fun addBigDecIf(condition: Boolean, fn: () -> BigDecimal): JsonArray

  fun addBoolIf(condition: Boolean, fn: () -> Boolean): JsonArray

  fun addStringIf(condition: Boolean, fn: () -> String): JsonArray

  fun addElementIf(condition: Boolean, fn: () -> JsonElement): JsonArray

  // endregion

  operator fun get(index: Int): JsonElement

  operator fun set(index: Int, value: Byte)

  operator fun set(index: Int, value: UByte)

  operator fun set(index: Int, value: Short)

  operator fun set(index: Int, value: UShort)

  operator fun set(index: Int, value: Int)

  operator fun set(index: Int, value: UInt)

  operator fun set(index: Int, value: Long)

  operator fun set(index: Int, value: ULong)

  operator fun set(index: Int, value: BigInteger)

  operator fun set(index: Int, value: Float)

  operator fun set(index: Int, value: Double)

  operator fun set(index: Int, value: BigDecimal)

  operator fun set(index: Int, value: Boolean)

  operator fun set(index: Int, value: String)

  operator fun set(index: Int, value: Unit?)

  operator fun set(index: Int, node: JsonElement)

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] matching
   * the given input.
   *
   * @param node [JsonElement] to search for.
   */
  operator fun contains(node: JsonElement): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   */
  operator fun contains(value: Byte): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   */
  operator fun contains(value: Short): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   */
  operator fun contains(value: Int): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   */
  operator fun contains(value: Long): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   */
  operator fun contains(value: UByte): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   */
  operator fun contains(value: UShort): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   */
  operator fun contains(value: UInt): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   */
  operator fun contains(value: ULong): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   */
  operator fun contains(value: Float): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   */
  operator fun contains(value: Double): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   */
  operator fun contains(value: BigInteger): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   */
  operator fun contains(value: BigDecimal): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   */
  operator fun contains(value: Boolean): Boolean

  /**
   * Scans the values stored in this [JsonArray] for any [JsonElement] whose
   * value matches the given input.
   *
   * @param value Value to search for.
   */
  operator fun contains(value: String): Boolean
}