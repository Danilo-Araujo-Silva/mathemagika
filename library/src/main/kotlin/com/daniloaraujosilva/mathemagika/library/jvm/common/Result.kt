package com.daniloaraujosilva.mathemagika.library.common.jvm

import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.*
import com.daniloaraujosilva.mathemagika.library.jvm.common.isSuperClassOf
import com.daniloaraujosilva.mathemagika.library.jvm.common.kotlinClass

/**
 *
 */
data class Result(val rawResult: Any?, val evaluationTypeEnum: EvaluationTypeEnum) {

	/**
	 *
	 */
	inline fun <reified Return> extract(): Return {
		val returnKotlinClass = kotlinClass<Return>()

		return when {
			UNIT == evaluationTypeEnum -> {
				Unit as Return
			}
			INPUT_FORM == evaluationTypeEnum -> {
				val stringRawResult = rawResult as String

				when {
					isSuperClassOf(returnKotlinClass, Int::class) -> stringRawResult.toInt() as Return
					else -> stringRawResult as Return
				}
			}
			OUTPUT_FORM == evaluationTypeEnum -> {
				rawResult as Return // Should be String
			}
			IMAGE == evaluationTypeEnum -> {
				rawResult as Return // Should be ByteArray
			}
			TYPE_SET == evaluationTypeEnum -> {
				rawResult as Return // Should be ByteArray
			}
			else -> throw IllegalArgumentException("""Unrecognized kind of evaluation "$evaluationTypeEnum".""")
		}
	}
}
