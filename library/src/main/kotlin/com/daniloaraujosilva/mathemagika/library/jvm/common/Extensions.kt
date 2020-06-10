package com.daniloaraujosilva.mathemagika.library.jvm.common

/**
 *
 */
inline fun <reified Return> Map<String, Any?>.getAndCastOrDefault(key: String?, default: Return): Return {
	if (key == null || !containsKey(key)) return default

	return get(key) as Return
}
