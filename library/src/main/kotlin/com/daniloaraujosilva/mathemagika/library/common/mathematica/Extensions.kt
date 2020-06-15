package com.daniloaraujosilva.mathemagika.library.common.mathematica

/**
 *
 */
@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
fun String.runToInputForm(
	options: Map<String, Any?> = mutableMapOf()
): String? {
	return runToInputForm(this, options)
}

/**
 *
 */
@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
fun String.runToOutputForm(
	options: Map<String, Any?> = mutableMapOf()
): String? {
	return runToOutputForm(this, options)
}

/**
 *
 */
@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
fun String.runToImage(
	options: Map<String, Any?> = mutableMapOf()
): ByteArray? {
	return runToImage(this, options)
}

/**
 *
 */
@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
fun String.runToTypeSet(
	options: Map<String, Any?> = mutableMapOf()
): ByteArray? {
	return runToTypeSet(this, options)
}

/**
 *
 */
@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
inline fun <reified Return> String.run(
	options: Map<String, Any?> = mutableMapOf()
): Return {
	return run<Return>(this, options)
}
