package com.daniloaraujosilva.mathemagika.library.common.system

/**
 * TODO Verify how to get the error output.
 */
actual fun executeSystemCommand(commands: List<String>): String {
//	val returnCode =  platform.posix.system(commands)

	TODO()
}

/**
 *
 */
actual fun getEnvironmentVariable(candidates: List<String>, default: String?): String? {
	TODO()
}

/**
 *
 */
actual fun getProperty(candidates: List<String>, default: String?): String? {
	TODO()
}
