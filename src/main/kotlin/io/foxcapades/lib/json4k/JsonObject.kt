package io.foxcapades.lib.json4k

import java.math.BigDecimal
import java.math.BigInteger

interface JsonObject : JsonElement, Iterable<Pair<String, JsonElement>> {
  val size: Int

  fun with(fn: JsonObject.() -> Unit)

  fun withIf(condition: Boolean, fn: JsonObject.() -> Unit)

  operator fun get(key: String): JsonElement

  // region Operator Set

  operator fun set(key: String, value: Byte): JsonObject

  operator fun set(key: String, value: UByte): JsonObject

  operator fun set(key: String, value: Short): JsonObject

  operator fun set(key: String, value: UShort): JsonObject

  operator fun set(key: String, value: Int): JsonObject

  operator fun set(key: String, value: UInt): JsonObject

  operator fun set(key: String, value: Long): JsonObject

  operator fun set(key: String, value: ULong): JsonObject

  operator fun set(key: String, value: BigInteger): JsonObject

  operator fun set(key: String, value: Float): JsonObject

  operator fun set(key: String, value: Double): JsonObject

  operator fun set(key: String, value: BigDecimal): JsonObject

  operator fun set(key: String, value: Boolean): JsonObject

  operator fun set(key: String, value: String): JsonObject

  operator fun set(key: String, value: JsonElement): JsonObject

  fun setNull(key: String): JsonObject

  // endregion

  // region Set If Static

  fun setIf(condition: Boolean, key: String, value: Byte): JsonObject
  fun setIf(condition: Boolean, key: String, value: UByte): JsonObject
  fun setIf(condition: Boolean, key: String, value: Short): JsonObject
  fun setIf(condition: Boolean, key: String, value: UShort): JsonObject
  fun setIf(condition: Boolean, key: String, value: Int): JsonObject
  fun setIf(condition: Boolean, key: String, value: UInt): JsonObject
  fun setIf(condition: Boolean, key: String, value: Long): JsonObject
  fun setIf(condition: Boolean, key: String, value: ULong): JsonObject
  fun setIf(condition: Boolean, key: String, value: BigInteger): JsonObject
  fun setIf(condition: Boolean, key: String, value: Float): JsonObject
  fun setIf(condition: Boolean, key: String, value: Double): JsonObject
  fun setIf(condition: Boolean, key: String, value: BigDecimal): JsonObject
  fun setIf(condition: Boolean, key: String, value: Boolean): JsonObject
  fun setIf(condition: Boolean, key: String, value: String): JsonObject
  fun setIf(condition: Boolean, key: String, value: JsonElement): JsonObject
  fun setNullIf(condition: Boolean): JsonObject

  // endregion

  // region Set If Provider

  fun setByteIf(condition: Boolean, key: String, fn: () -> Byte): JsonObject
  fun setUByteIf(condition: Boolean, key: String, fn: () -> UByte): JsonObject
  fun setShortIf(condition: Boolean, key: String, fn: () -> Short): JsonObject
  fun setUShortIf(condition: Boolean, key: String, fn: () -> UShort): JsonObject
  fun setIntIf(condition: Boolean, key: String, fn: () -> Int): JsonObject
  fun setUIntIf(condition: Boolean, key: String, fn: () -> UInt): JsonObject
  fun setLongIf(condition: Boolean, key: String, fn: () -> Long): JsonObject
  fun setULongIf(condition: Boolean, key: String, fn: () -> ULong): JsonObject
  fun setBigIntIf(condition: Boolean, key: String, fn: () -> BigInteger): JsonObject
  fun setFloatIf(condition: Boolean, key: String, fn: () -> Float): JsonObject
  fun setDoubleIf(condition: Boolean, key: String, fn: () -> Double): JsonObject
  fun setBigDecIf(condition: Boolean, key: String, fn: () -> BigDecimal): JsonObject
  fun setBoolIf(condition: Boolean, key: String, fn: () -> Boolean): JsonObject
  fun setStringIf(condition: Boolean, key: String, fn: () -> String): JsonObject
  fun setElementIf(condition: Boolean, key: String, fn: () -> JsonElement): JsonObject

  // endregion
}