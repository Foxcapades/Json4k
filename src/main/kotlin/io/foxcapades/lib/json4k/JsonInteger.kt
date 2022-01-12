package io.foxcapades.lib.json4k

import java.math.BigInteger

interface JsonInteger : JsonNumeric, Comparable<JsonNumeric> {
  fun byteValue(): Byte

  fun uByteValue(): UByte

  fun shortValue(): Short

  fun uShortValue(): UShort

  fun intValue(): Int

  fun uIntValue(): UInt

  fun longValue(): Long

  fun uLongValue(): ULong

  fun bigIntValue(): BigInteger
}