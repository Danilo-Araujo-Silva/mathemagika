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
inline fun <reified Return> run(command: String, @Suppress("UNUSED_PARAMETER") options: Map<String, Any?> = mutableMapOf()): Return {
	var result: String = ""

	return try {
		result = executeSystemCommand(wolframScriptPath, wolframScriptArguments, command).trimEnd('\n')

		convertFromMathematica(result)
	} catch (exception: Exception) {
		throw Exception("""
			An error occurred when running a command on Mathematica.
			Command: $command
			Options: $options
			Result: $result
			Error: ${exception.message}
			""".trimIndent(), exception)
	}
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
