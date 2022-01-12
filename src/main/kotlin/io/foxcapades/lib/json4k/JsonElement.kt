package io.foxcapades.lib.json4k

interface JsonElement {
  val type: JsonElementType

  fun toJsonString(): String

  fun toPrettyJsonString(): String
}