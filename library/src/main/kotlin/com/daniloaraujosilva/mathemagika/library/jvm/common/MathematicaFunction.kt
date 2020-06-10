package com.daniloaraujosilva.mathemagika.library.jvm.common

import com.daniloaraujosilva.mathemagika.library.common.jvm.Result

/**
 *
 */
data class MathematicaFunction(

	/**
	 *
	 */
	val name: String,

	/**
	 *
	 */
	val arguments: MutableList<Any?> = mutableListOf(),

	/**
	 *
	 */
	val options: MutableMap<String, Any?> = mutableMapOf()
) {

	/**
	 *
	 */
	lateinit var result: Result

	/**
	 *
	 */
	inline fun <reified Return> run(): Return {
		evaluate()
		execute()

		return extract()
	}

	/**
	 *
	 */
	fun evaluate(): String {
		val finalArguments =  arguments.joinToString(separator = ", ") {
			when(it) {
				is MathematicaFunction -> it.evaluate()
				else -> it.toString()
			}
		}

		return "$name[$finalArguments]"
	}

	/**
	 *
	 */
	fun execute(): Result {
		val command: String = evaluate()

		result = executeOnMathematica(command, arguments, options)

		return result
	}

	/**
	 *
	 */
	inline fun <reified Return> extract(): Return {
		return result.extract()
	}

	/**
	 * Evaluates the Mathematica function to a String.
	 */
	override fun toString(): String {
		return evaluate()
	}
}
