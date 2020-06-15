package com.daniloaraujosilva.mathemagika.library.common.system

import java.lang.RuntimeException

/**
 *
 */
actual fun executeSystemCommand(commands: List<String>): String {
	val process = Runtime.getRuntime().exec(commands.toTypedArray())
	val error = process.errorStream.bufferedReader().use { it.readText() }

	if (error.isNotBlank()) {
		val errorNumber = process.exitValue()
		throw RuntimeException(
			"""
				An error occurred when executing the command "${commands.joinToString(" ")}}".
				Error code: $errorNumber
				Error: "$error".
			""".trimIndent()
		)
	}

	return process.inputStream.bufferedReader().use { it.readText() }
}

/**
 *
 */
actual fun getEnvironmentVariable(candidates: List<String>, default: String?): String? {
	candidates.forEach {
		val value = System.getenv(it)

		if (value != null) return value
	}

	return default
}

/**
 *
 */
actual fun getProperty(candidates: List<String>, default: String?): String? {
	candidates.forEach {
		val value = System.getProperty(it)

		if (value != null) return value
	}

	return default
}
