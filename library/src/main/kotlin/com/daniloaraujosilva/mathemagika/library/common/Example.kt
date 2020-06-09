package com.daniloaraujosilva.mathemagika.library.common

/**
 *
 */
val exampleValue = exampleFunction().toString()

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
	private const val exampleProperty = "com.daniloaraujosilva.mathemagika.library.common"

	/**
	 *
	 */
	fun exampleMethod(): List<String> {
		val output = ArrayList<String>()
		output.addAll(com.daniloaraujosilva.mathemagika.common.common.exampleFunction())
		output.add(exampleProperty)

		return output
	}
}
