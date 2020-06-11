package com.daniloaraujosilva.mathemagika.library.jvm.common

import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.*
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
	operator fun invoke(options: Map<String, Any?> = mutableMapOf()): String {
		return run(options)
	}

	/**
	 *
	 */
	fun run(): String {
		return runToInputForm()
	}

	/**
	 *
	 */
	fun runToUnit() {
		return run(options = mapOf(type to UNIT))
	}

	/**
	 *
	 */
	fun runToInputForm(): String {
		return run(options = mapOf(type to INPUT_FORM))
	}

	/**
	 *
	 */
	fun runToOutputForm(): String {
		return run(options = mapOf(type to OUTPUT_FORM))
	}

	/**
	 *
	 */
	fun runToImage(): String {
		return run(options = mapOf(type to IMAGE))
	}

	/**
	 *
	 */
	fun runToTypeSet(): String {
		return run(options = mapOf(type to TYPE_SET))
	}

	/**
	 *
	 */
	inline fun <reified Return> run(options: Map<String, Any?> = mutableMapOf()): Return {
		this.options.putAll(options)

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
				is Iterable<Any?> -> it.joinToString(prefix = "{", postfix = "}")
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
