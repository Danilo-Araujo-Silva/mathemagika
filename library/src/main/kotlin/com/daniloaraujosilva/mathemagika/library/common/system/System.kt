package com.daniloaraujosilva.mathemagika.library.common.system

/**
 *
 */
fun executeSystemCommand(vararg commands: String): String {
	return executeSystemCommand(commands.toList())
}

/**
 *
 */
fun executeSystemCommand(command: String): String {
	// TODO This is not error prone, neither the Runtime.getRuntime().exec(String) from JVM
	val splitCommand = command.split("""" \t\n\r\f"""".toRegex())

	return executeSystemCommand(splitCommand)
}

/**
 *
 */
fun getEnvironmentVariable(vararg candidates: String, default: String?): String? {
	return getEnvironmentVariable(candidates.toList(), default)
}
