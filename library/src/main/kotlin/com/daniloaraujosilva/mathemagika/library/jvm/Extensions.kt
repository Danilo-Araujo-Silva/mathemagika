package com.daniloaraujosilva.mathemagika.library.jvm

/**
 *
 */
fun <A, B> Map<A, B>.merge(vararg maps: Map<A, B>): Map<A, B> {
	val mutableMap = this.toMutableMap()

	maps.toList().forEach { mutableMap.putAll(it) }

	return mutableMap
}

/**
 *
 */
inline fun <reified Return> Map<String, Any?>.getAndCastOrDefault(key: String?, default: Return): Return {
	if (key == null || !containsKey(key)) return default

	return get(key) as Return
}

/**
 *
 */
@ExperimentalUnsignedTypes
fun String.runToInputForm(
	@Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(),
	options: Map<String, Any?> = mutableMapOf()
): String? {
	return com.daniloaraujosilva.mathemagika.library.jvm.runToInputForm(this, arguments, options)
}

/**
 *
 */
@ExperimentalUnsignedTypes
fun String.runToOutputForm(
	@Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(),
	options: Map<String, Any?> = mutableMapOf()
): String? {
	return com.daniloaraujosilva.mathemagika.library.jvm.runToOutputForm(this, arguments, options)
}

/**
 *
 */
@ExperimentalUnsignedTypes
fun String.runToImage(
	@Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(),
	options: Map<String, Any?> = mutableMapOf()
): ByteArray? {
	return com.daniloaraujosilva.mathemagika.library.jvm.runToImage(this, arguments, options)
}

/**
 *
 */
@ExperimentalUnsignedTypes
fun String.runToTypeSet(
	@Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(),
	options: Map<String, Any?> = mutableMapOf()
): ByteArray? {
	return com.daniloaraujosilva.mathemagika.library.jvm.runToTypeSet(this, arguments, options)
}

/**
 *
 */
@ExperimentalUnsignedTypes
inline fun <reified Return> String.run(
	@Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(),
	options: Map<String, Any?> = mutableMapOf()
): Return? {
	return com.daniloaraujosilva.mathemagika.library.jvm.run<Return>(this, arguments, options)
}

/**
 *
 */
operator fun MathematicaFunction.plus(other: Any): String {
	return "$this$other"
}
