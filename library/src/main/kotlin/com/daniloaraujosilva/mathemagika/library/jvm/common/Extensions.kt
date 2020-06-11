package com.daniloaraujosilva.mathemagika.library.jvm.common

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
	return runToInputForm(this, arguments, options)
}

/**
 *
 */
@ExperimentalUnsignedTypes
fun String.runToOutputForm(
	@Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(),
	options: Map<String, Any?> = mutableMapOf()
): String? {
	return runToOutputForm(this, arguments, options)
}

/**
 *
 */
@ExperimentalUnsignedTypes
fun String.runToImage(
	@Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(),
	options: Map<String, Any?> = mutableMapOf()
): ByteArray? {
	return runToImage(this, arguments, options)
}

/**
 *
 */
@ExperimentalUnsignedTypes
fun String.runToTypeSet(
	@Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(),
	options: Map<String, Any?> = mutableMapOf()
): ByteArray? {
	return runToTypeSet(this, arguments, options)
}

/**
 *
 */
@ExperimentalUnsignedTypes
inline fun <reified Return> String.run(
	@Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(),
	options: Map<String, Any?> = mutableMapOf()
): Return? {
	return convertFromMathematicaToOrNull(executeOnMathematica(this, arguments, options = options).extract())
}

/**
 *
 */
operator fun MathematicaFunction.plus(other: Any): String {
	return "$this$other"
}
