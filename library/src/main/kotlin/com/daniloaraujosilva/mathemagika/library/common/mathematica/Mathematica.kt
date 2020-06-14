package com.daniloaraujosilva.mathemagika.library.common.mathematica

import com.daniloaraujosilva.mathemagika.library.common.system.executeSystemCommand
import com.daniloaraujosilva.mathemagika.library.common.system.getEnvironmentVariable

/**
 *
 */
const val wolframScriptEnvironmentVariable = "WOLFRAM_SCRIPT_PATH"

/**
 *
 */
const val wolframScriptArguments = "-code"

/**
 *
 */
val wolframScriptPath by lazy {
	getEnvironmentVariable(listOf(wolframScriptEnvironmentVariable))
		?: throw RuntimeException(
			"""The environment variable "$wolframScriptEnvironmentVariable" is not defined."""
		)
}

/**
 *
 */
@ExperimentalUnsignedTypes
@ExperimentalStdlibApi
fun run(command: String, options: Map<String, Any?> = mutableMapOf()): String {
	return run<String>(command, options)
}

/**
 *
 */
@ExperimentalUnsignedTypes
@ExperimentalStdlibApi
inline fun <reified Return> run(command: String, options: Map<String, Any?> = mutableMapOf()): Return {
	return convertFromMathematica(executeSystemCommand(wolframScriptPath, wolframScriptArguments, command))
}

/**
 *
 */
@ExperimentalUnsignedTypes
@ExperimentalStdlibApi
fun runToInputForm(command: String, options: Map<String, Any?> = mutableMapOf()): String {
	return run("""InputForm[$command]""", options)
}

/**
 *
 */
@ExperimentalUnsignedTypes
@ExperimentalStdlibApi
fun runToOutputForm(command: String, options: Map<String, Any?> = mutableMapOf()): String {
	return run("""OutputForm[$command]""", options)
}

/**
 *
 */
@ExperimentalUnsignedTypes
@ExperimentalStdlibApi
fun runToImage(command: String, options: Map<String, Any?> = mutableMapOf()): ByteArray {
	return run<ByteArray>("""ByteArray[$command]""", options)
}

/**
 *
 */
@ExperimentalUnsignedTypes
@ExperimentalStdlibApi
fun runToTypeSet(command: String, options: Map<String, Any?> = mutableMapOf()): ByteArray {
	return run<ByteArray>("""OutputForm[$command]""", options)
}
