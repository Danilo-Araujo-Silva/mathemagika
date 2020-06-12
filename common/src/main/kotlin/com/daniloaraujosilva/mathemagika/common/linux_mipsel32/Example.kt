package com.daniloaraujosilva.mathemagika.common.linux_mipsel32

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
	private const val exampleProperty = "com.daniloaraujosilva.mathemagika.common.linux_arm32_hfp.common"

	/**
	 *
	 */
	fun exampleMethod(): List<String> {
		val output = mutableListOf<String>()
		output.addAll(com.daniloaraujosilva.mathemagika.common.common.exampleFunction())
		output.add(exampleProperty)

		return output
	}
}
