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
	@ExperimentalUnsignedTypes
	operator fun invoke(options: Map<String, Any?> = mutableMapOf()): String {
		return run(options)
	}

	/**
	 *
	 */
	@ExperimentalUnsignedTypes
	inline operator fun <reified Return> invoke(options: Map<String, Any?> = mutableMapOf()): Return {
		return run<Return>(options)
	}

	/**
	 *
	 */
	@ExperimentalUnsignedTypes
	fun run(options: Map<String, Any?> = mutableMapOf()): String {
		return runToInputForm(options)
	}

	/**
	 *
	 */
	@ExperimentalUnsignedTypes
	fun runToUnit(options: Map<String, Any?> = mutableMapOf()) {
		return run<Unit>(options = options.merge(mapOf(type to UNIT)))
	}

	/**
	 *
	 */
	@ExperimentalUnsignedTypes
	fun runToInputForm(options: Map<String, Any?> = mutableMapOf()): String {
		return run<String>(options = options.merge(mapOf(type to INPUT_FORM)))
	}

	/**
	 *
	 */
	@ExperimentalUnsignedTypes
	fun runToOutputForm(options: Map<String, Any?> = mutableMapOf()): String {
		return run<String>(options = options.merge(mapOf(type to OUTPUT_FORM)))
	}

	/**
	 *
	 */
	@ExperimentalUnsignedTypes
	fun runToImage(options: Map<String, Any?> = mutableMapOf()): ByteArray {
		return run<ByteArray>(options = options.merge(mapOf(type to IMAGE)))
	}

	/**
	 *
	 */
	@ExperimentalUnsignedTypes
	fun runToTypeSet(options: Map<String, Any?> = mutableMapOf()): ByteArray {
		return run<ByteArray>(options = options.merge(mapOf(type to TYPE_SET)))
	}

	/**
	 *
	 */
	@ExperimentalUnsignedTypes
	inline fun <reified Return> run(options: Map<String, Any?> = mutableMapOf()): Return {
		this.options.putAll(options)

		evaluate()
		execute()

		return convertFromMathematicaTo(extract())
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
