package com.daniloaraujosilva.mathemagika.common.common

/**
 *
 */
val exampleValue =
	formatOuput(exampleFunction())

/**
 *
 */
fun exampleFunction(): List<String> {
	return ExampleObject.exampleMethod()
}

/**
 *
 */
object ExampleObject {

	/**
	 *
	 */
	private const val exampleProperty = "com.daniloaraujosilva.mathemagika.common.common"

	/**
	 *
	 */
	fun exampleMethod(): List<String> {
		val output = mutableListOf<String>()
		output.add(exampleProperty)

		return output
	}
}

/**
 *
 */
fun formatOuput(input: List<String>?, showBanner: Boolean = false): String {
	val prefix = "com.daniloaraujosilva.mathemagika."

	var output = ""

	if (showBanner) {
		output = """
			| __  __       _   _                                _ _
			||  \/  |     | | | |                              (_) |
			|| \  / | __ _| |_| |__   ___ _ __ ___   __ _  __ _ _| | ____ _
			|| |\/| |/ _` | __| '_ \ / _ \ '_ ` _ \ / _` |/ _` | | |/ / _` |
			|| |  | | (_| | |_| | | |  __/ | | | | | (_| | (_| | |   < (_| |
			||_|  |_|\__,_|\__|_| |_|\___|_| |_| |_|\__,_|\__, |_|_|\_\__,_|
			|                                              __/ |
			|                                             |___/
			|""".trimMargin()
	}

	output += "Used modules:\n"

	input?.forEach {
		output += "\n${it.removePrefix(prefix)}"
	}

	output += "\n\n"

	return output
}
