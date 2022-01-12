package io.foxcapades.lib.json4k

import java.math.BigDecimal
import java.math.BigInteger

/**
 * Represents a Json `object` element.
 *
 * @since v1.0.0
 */
interface JsonObject : JsonElement, Iterable<Pair<String, JsonElement>> {
  /**
   * Number of elements contained in this [JsonObject].
   */
  val size: Int

  /**
   * Performs an arbitrary action on this [JsonObject].
   *
   * @param action Action to perform.
   */
  fun with(action: JsonObject.() -> Unit)

  /**
   * Performs an arbitrary action on this [JsonObject] only if the given
   * [condition] value is `true`.
   *
   * @param condition Condition controlling whether the given [action] will be
   * executed.
   *
   * @param action Action to perform.
   */
  fun withIf(condition: Boolean, action: JsonObject.() -> Unit)

  /**
   * Gets the [JsonElement] at the given key.
   *
   * @param key Key to the element to retrieve.
   *
   * @return The Json element at the given [key], or `null` if no such key was
   * found in this [JsonObject].
   *
   * @see contains
   */
  operator fun get(key: String): JsonElement?

  // region Operator Set

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: Byte): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: UByte): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: Short): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: UShort): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: Int): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: UInt): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: Long): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: ULong): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: BigInteger): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: Float): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: Double): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: BigDecimal): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: Boolean): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: String): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  operator fun set(key: String, value: JsonElement): JsonObject

  /**
   * Sets a Json `null` element to this [JsonObject] at the given [key].
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param key Key to set the new element at.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setNullIf
   */
  fun setNull(key: String): JsonObject

  // endregion

  // region Set If Static

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: Byte): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: UByte): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: Short): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: UShort): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: Int): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: UInt): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: Long): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: ULong): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: BigInteger): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: Float): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: Double): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: BigDecimal): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: Boolean): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * The given [value] will be wrapped with the appropriate Json element type.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: String): JsonObject

  /**
   * Sets the given [value] to this [JsonObject] at the given [key] only if the
   * given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param key Key to set the new element at.
   *
   * @param value Value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see set
   */
  fun setIf(condition: Boolean, key: String, value: JsonElement): JsonObject

  /**
   * Sets a Json `null` element to this [JsonObject] at the given [key] only
   * if the given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param key Key to set the [JsonNull] at.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setNull
   */
  fun setNullIf(condition: Boolean, key: String): JsonObject

  // endregion

  // region Set If Provider

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setByteIf(condition: Boolean, key: String, action: () -> Byte): JsonObject

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setUByteIf(
    condition: Boolean,
    key: String,
    action: () -> UByte,
  ): JsonObject

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setShortIf(
    condition: Boolean,
    key: String,
    action: () -> Short,
  ): JsonObject

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setUShortIf(
    condition: Boolean,
    key: String,
    action: () -> UShort,
  ): JsonObject

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setIntIf(condition: Boolean, key: String, action: () -> Int): JsonObject

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setUIntIf(condition: Boolean, key: String, action: () -> UInt): JsonObject

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setLongIf(condition: Boolean, key: String, action: () -> Long): JsonObject

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setULongIf(
    condition: Boolean,
    key: String,
    action: () -> ULong,
  ): JsonObject

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setBigIntIf(
    condition: Boolean,
    key: String,
    action: () -> BigInteger,
  ): JsonObject

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setFloatIf(
    condition: Boolean,
    key: String,
    action: () -> Float,
  ): JsonObject

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setDoubleIf(
    condition: Boolean,
    key: String,
    action: () -> Double,
  ): JsonObject

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setBigDecIf(
    condition: Boolean,
    key: String,
    action: () -> BigDecimal,
  ): JsonObject

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setBoolIf(
    condition: Boolean,
    key: String,
    action: () -> Boolean,
  ): JsonObject

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setStringIf(
    condition: Boolean,
    key: String,
    action: () -> String,
  ): JsonObject

  /**
   * Sets the value returned by the given [action] to this [JsonObject] at the
   * given [key] only if the  given [condition] is true.
   *
   * If an element is already set on this [JsonObject] at the given [key], it
   * will be overwritten.
   *
   * @param condition Condition controlling whether the given [action] will be
   * called and the returned value set to this [JsonObject] at the given [key].
   *
   * @param key Key to set the new element at.
   *
   * @param action Action returning the value to set.
   *
   * @return This [JsonObject] instance.
   *
   * @see contains
   * @see setIf
   */
  fun setElementIf(
    condition: Boolean,
    key: String,
    action: () -> JsonElement,
  ): JsonObject

  // endregion

  // region Contains

  /**
   * Tests whether this [JsonObject] contains a value stored at the given [key].
   *
   * @param key Key to test for.
   *
   * @return Whether this [JsonObject] contains the given [key].
   */
  operator fun contains(key: String): Boolean

  // endregion
}