package com.daniloaraujosilva.mathemagika.library.jvm.common

import java.util.ArrayList

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
	private const val exampleProperty = "com.daniloaraujosilva.mathemagika.library.jvm.common"

	/**
	 *
	 */
	fun exampleMethod(): List<String> {
		val output = ArrayList<String>()
		output.addAll(com.daniloaraujosilva.mathemagika.common.common.exampleFunction())
		output.addAll(com.daniloaraujosilva.mathemagika.library.common.exampleFunction())
		output.add(exampleProperty)

		return output
	}
}
