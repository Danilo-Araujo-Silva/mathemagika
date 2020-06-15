package com.daniloaraujosilva.mathemagika.library.common.mathematica

import com.daniloaraujosilva.mathemagika.library.common.merge
import com.daniloaraujosilva.mathemagika.library.common.mathematica.EvaluationTypeEnum.*

/**
 *
 */
const val type = "type"

/**
 *
 */
open class MathematicaFunction (

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
	@ExperimentalStdlibApi
	@ExperimentalUnsignedTypes
	operator fun invoke(options: Map<String, Any?> = mutableMapOf()): String {
		return run(options)
	}

	/**
	 *
	 */
	@ExperimentalStdlibApi
	@ExperimentalUnsignedTypes
	inline operator fun <reified Return> invoke(options: Map<String, Any?> = mutableMapOf()): Return {
		return run<Return>(options)
	}

	/**
	 *
	 */
	@ExperimentalStdlibApi
	@ExperimentalUnsignedTypes
	fun run(options: Map<String, Any?> = mutableMapOf()): String {
		return run<String>(options)
	}

	/**
	 *
	 */
	@ExperimentalStdlibApi
	@ExperimentalUnsignedTypes
	fun runToInputForm(options: Map<String, Any?> = mutableMapOf()): String {
		return run<String>(options = options.merge(mapOf(type to INPUT_FORM)))
	}

	/**
	 *
	 */
	@ExperimentalStdlibApi
	@ExperimentalUnsignedTypes
	fun runToOutputForm(options: Map<String, Any?> = mutableMapOf()): String {
		return run<String>(options = options.merge(mapOf(type to OUTPUT_FORM)))
	}

	/**
	 *
	 */
	@ExperimentalStdlibApi
	@ExperimentalUnsignedTypes
	fun runToImage(options: Map<String, Any?> = mutableMapOf()): ByteArray {
		return run<ByteArray>(options = options.merge(mapOf(type to IMAGE)))
	}

	/**
	 *
	 */
	@ExperimentalStdlibApi
	@ExperimentalUnsignedTypes
	fun runToTypeSet(options: Map<String, Any?> = mutableMapOf()): ByteArray {
		return run<ByteArray>(options = options.merge(mapOf(type to TYPE_SET)))
	}

	/**
	 *
	 */
	@ExperimentalStdlibApi
	@ExperimentalUnsignedTypes
	inline fun <reified Return> run(options: Map<String, Any?> = mutableMapOf()): Return {
		this.options.putAll(options)

		val evaluationType by lazy {
			this.options[type] as EvaluationTypeEnum?
				?: COMMON
		}

		val evaluation = evaluate()

		return when {
			COMMON == evaluationType -> { run<Return>(evaluation, this.options) }
			INPUT_FORM == evaluationType -> { runToInputForm(evaluation, this.options) as Return }
			OUTPUT_FORM == evaluationType -> { runToOutputForm(evaluation, this.options) as Return }
			IMAGE == evaluationType -> { runToImage(evaluation, this.options) as Return }
			TYPE_SET == evaluationType -> { runToTypeSet(evaluation, this.options) as Return }
			else -> throw IllegalArgumentException("""Unrecognized type of evaluation "$evaluationType".""")
		}
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
	 * Evaluates the Mathematica function to a String.
	 */
	override fun toString(): String {
		return evaluate()
	}
}

/**
 *
 */
operator fun MathematicaFunction.plus(other: Any): String {
	return "$this$other"
}
