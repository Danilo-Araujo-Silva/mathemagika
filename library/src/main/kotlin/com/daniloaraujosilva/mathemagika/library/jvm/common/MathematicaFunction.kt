package com.daniloaraujosilva.mathemagika.library.jvm.common

import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum
import com.daniloaraujosilva.mathemagika.library.common.jvm.Mathematica
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.IMAGE
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.INPUT_FORM
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.OUTPUT_FORM
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.TYPE_SET
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.UNIT
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
		lateinit var mathematica: Mathematica

		try {
			mathematica = Mathematica()

			val command = evaluate()

			println("Running command: $command")

			val evaluationTypeEnum: EvaluationTypeEnum =
				options.getOrDefault("evaluationType", INPUT_FORM) as EvaluationTypeEnum

			result = with(mathematica) {
				when {
					UNIT == evaluationTypeEnum -> Result(null, UNIT)
					INPUT_FORM == evaluationTypeEnum -> Result(evaluateToInputForm(command), INPUT_FORM)
					OUTPUT_FORM == evaluationTypeEnum -> {
						val pageWidth = options.getAndCastOrDefault("pageWidth", 0)

						Result(evaluateToOutputForm(command, pageWidth), OUTPUT_FORM)
					}
					IMAGE == evaluationTypeEnum -> {
						val width = options.getAndCastOrDefault("width", 0)
						val height = options.getAndCastOrDefault("height", 0)
						val dpi = options.getAndCastOrDefault("dpi", 0)
						val useFE = options.getAndCastOrDefault("useFrontEnd", false)

						Result(evaluateToImage(command, width, height, dpi, useFE), IMAGE)
					}
					TYPE_SET == evaluationTypeEnum -> {
						val width = options.getAndCastOrDefault("width", 0)
						val useStandardForm = options.getAndCastOrDefault("useStandardForm", true)

						Result(evaluateToTypeset(command, width, useStandardForm), TYPE_SET)
					}
					else -> throw IllegalArgumentException("""Unrecognized kind of evaluation "$evaluationTypeEnum".""")
				}
			}

			return result
		} finally {
			mathematica.closeKernelLink()
		}
	}

	/**
	 *
	 */
	inline fun <reified Return> extract(): Return {
		return result.extract()
	}
}
