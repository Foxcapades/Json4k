package io.foxcapades.lib.json4k

import java.math.BigDecimal
import java.math.BigInteger
import java.util.ServiceLoader

object Json {
  private val factory: JsonFactory

  init {
    val loader = ServiceLoader.load(JsonFactory::class.java)!!
    val found  = loader.findFirst()

    if (found.isEmpty)
      throw RuntimeException("No implementation of json4k found.")

    factory = found.get()
  }

  fun newArray(initialSize: Int = 1) = factory.newArray(initialSize)

  fun newBool(value: Boolean) = factory.newBool(value)

  fun newInt(value: Byte) = factory.newInt(value)

  fun newInt(value: UByte) = factory.newInt(value)

  fun newInt(value: Short) = factory.newInt(value)

  fun newInt(value: UShort) = factory.newInt(value)

  fun newInt(value: Int) = factory.newInt(value)

  fun newInt(value: UInt) = factory.newInt(value)

  fun newInt(value: Long) = factory.newInt(value)

  fun newInt(value: ULong) = factory.newInt(value)

  fun newInt(value: BigInteger) = factory.newInt(value)

  fun newNull() = factory.newNull()

  fun newNumber(value: Float) = factory.newNumber(value)

  fun newNumber(value: Double) = factory.newNumber(value)

  fun newNumber(value: BigDecimal) = factory.newNumber(value)

  fun newObject(initialSize: Int = 1) = factory.newObject()

  fun newString(value: String) = factory.newString(value)

}