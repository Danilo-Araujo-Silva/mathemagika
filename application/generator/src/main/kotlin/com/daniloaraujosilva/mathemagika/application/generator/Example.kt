package com.daniloaraujosilva.mathemagika.application.generator

/**
 *
 */
fun main() {
	println(exampleValue)
}

/**
 *
 */
val exampleValue = com.daniloaraujosilva.mathemagika.common.common.formatOuput(exampleFunction(), true)

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
	private val exampleProperty = ExampleObject::class.java.`package`.name

	/**
	 *
	 */
	fun exampleMethod(): List<String> {
		val output = mutableListOf<String>()
//		output.addAll(com.daniloaraujosilva.mathemagika.common.jvm.common.exampleFunction())
		output.addAll(com.daniloaraujosilva.mathemagika.library.jvm.exampleFunction())
		output.add(exampleProperty)

		return output
	}
}
