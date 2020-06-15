//package com.daniloaraujosilva.mathemagika.library.jvm.mathematica.jlink
//
//import com.daniloaraujosilva.mathemagika.library.common.mathematica.EvaluationTypeEnum
//import com.daniloaraujosilva.mathemagika.library.common.mathematica.EvaluationTypeEnum.COMMON
//import com.daniloaraujosilva.mathemagika.library.common.mathematica.EvaluationTypeEnum.IMAGE
//import com.daniloaraujosilva.mathemagika.library.common.mathematica.EvaluationTypeEnum.INPUT_FORM
//import com.daniloaraujosilva.mathemagika.library.common.mathematica.EvaluationTypeEnum.OUTPUT_FORM
//import com.daniloaraujosilva.mathemagika.library.common.mathematica.EvaluationTypeEnum.TYPE_SET
//import com.daniloaraujosilva.mathemagika.library.common.mathematica.convertFromMathematica
//import com.daniloaraujosilva.mathemagika.library.common.mathematica.type
//import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction as CommonMathematicaFunction
//
///**
// *
// */
//class MathematicaFunction(
//	name: String,
//	arguments: MutableList<Any?> = mutableListOf(),
//	options: MutableMap<String, Any?> = mutableMapOf()
//) : CommonMathematicaFunction(
//	name,
//	arguments,
//	options
//) {
//
//	/**
//	 *
//	 */
//	@ExperimentalStdlibApi
//	@ExperimentalUnsignedTypes
//	inline fun <reified Return> runUsingJLink(options: Map<String, Any?> = mutableMapOf()): Return {
//		lateinit var mathematica: Mathematica
//
//		try {
//			mathematica = Mathematica()
//
//			val evaluationType by lazy {
//				this.options[type] as EvaluationTypeEnum?
//					?: COMMON
//			}
//
//			val pageWidth: Int = options.getOrDefault("pageWidth", 0) as Int
//			val width: Int = options.getOrDefault("width", 0) as Int
//			val height: Int = options.getOrDefault(key = "height", defaultValue = 0) as Int
//			val dpi: Int = options.getOrDefault("dpi", 0) as Int
//			val useFrontEnd: Boolean = options.getOrDefault("useFrontEnd", false) as Boolean
//			val useStandForm: Boolean = options.getOrDefault("useStandForm", true) as Boolean
//
//			val evaluation = evaluate()
//
//			val result = when {
//				COMMON == evaluationType -> { mathematica.evaluateToInputForm(evaluation) }
//				INPUT_FORM == evaluationType -> { mathematica.evaluateToInputForm(evaluation, pageWidth) }
//				OUTPUT_FORM == evaluationType -> { mathematica.evaluateToOutputForm(evaluation, pageWidth) }
//				IMAGE == evaluationType -> { mathematica.evaluateToImage(evaluation, width,height, dpi, useFrontEnd) }
//				TYPE_SET == evaluationType -> { mathematica.evaluateToTypeset(evaluation, width, useStandForm) }
//				else -> throw IllegalArgumentException("""Unrecognized type of evaluation "$evaluationType".""")
//			}
//
//			return convertFromMathematica(result, options)
//		} finally {
//			mathematica.closeKernelLink()
//		}
//	}
//}
