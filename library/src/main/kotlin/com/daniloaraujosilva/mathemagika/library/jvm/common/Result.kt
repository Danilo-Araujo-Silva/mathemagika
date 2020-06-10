package com.daniloaraujosilva.mathemagika.library.common.jvm

import com.daniloaraujosilva.mathemagika.common.jvm.common.isSuperclassOf
import com.daniloaraujosilva.mathemagika.common.jvm.common.kotlinClass
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.IMAGE
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.INPUT_FORM
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.OUTPUT_FORM
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.TYPE_SET
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.UNIT

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
					returnKotlinClass.isSuperclassOf(Int::class) -> stringRawResult.toInt() as Return
					else -> stringRawResult as Return
				}
			}
			OUTPUT_FORM == evaluationTypeEnum -> {
				val stringRawResult = rawResult as String

				rawResult as Return
			}
			IMAGE == evaluationTypeEnum -> {
				val byteArrayRawResult = rawResult as ByteArray

				rawResult as Return
			}
			TYPE_SET == evaluationTypeEnum -> {
				val byteArrayRawResult = rawResult as ByteArray

				rawResult as Return
			}
			else -> throw IllegalArgumentException("""Unrecognized kind of evaluation "$evaluationTypeEnum".""")
		}
	}
}
