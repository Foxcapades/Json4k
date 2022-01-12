package io.foxcapades.lib.json4k

import java.math.BigDecimal
import java.math.BigInteger

interface JsonFactory {
  fun newArray(initialSize: Int = 1): JsonArray

  fun newBool(value: Boolean): JsonBoolean

  fun newInt(value: Byte): JsonInteger

  fun newInt(value: UByte): JsonInteger

  fun newInt(value: Short): JsonInteger

  fun newInt(value: UShort): JsonInteger

  fun newInt(value: Int): JsonInteger

  fun newInt(value: UInt): JsonInteger

  fun newInt(value: Long): JsonInteger

  fun newInt(value: ULong): JsonInteger

  fun newInt(value: BigInteger): JsonInteger

  fun newNull(): JsonNull

  fun newNumber(value: Float): JsonNumber

  fun newNumber(value: Double): JsonNumber

  fun newNumber(value: BigDecimal): JsonNumber

  fun newObject(initialSize: Int = 1): JsonObject

  fun newString(value: String): JsonString
}