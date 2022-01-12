package io.foxcapades.lib.json4k

import java.math.BigDecimal

interface JsonNumber : JsonNumeric, Comparable<JsonNumeric> {
  fun floatValue(): Float

  fun doubleValue(): Double

  fun bigDecValue(): BigDecimal
}