package io.foxcapades.lib.json4k

interface JsonString {
  val length: Int

  val isEmpty: Boolean

  val isNotEmpty: Boolean

  val isBlank: Boolean

  val isNotBlank: Boolean

  fun stringValue(): String

  fun binaryValue(): ByteArray
}