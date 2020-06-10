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
inline fun <reified Return> String.run(
	@Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(),
	options: Map<String, Any?> = mutableMapOf()
): Return? {
	return convertFromMathematicaToOrNull(executeOnMathematica(this, arguments, options = options).extract())
}
