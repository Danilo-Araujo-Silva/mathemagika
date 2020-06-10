package com.daniloaraujosilva.mathemagika.library.jvm.common

import com.daniloaraujosilva.mathemagika.common.common.OperatingSystem
import com.daniloaraujosilva.mathemagika.common.jvm.common.isSuperclassOf
import com.daniloaraujosilva.mathemagika.common.jvm.common.kotlinClass
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.UNIT
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.INPUT_FORM
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.OUTPUT_FORM
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.IMAGE
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.TYPE_SET
import com.daniloaraujosilva.mathemagika.library.common.jvm.Mathematica
import com.daniloaraujosilva.mathemagika.library.common.jvm.Result
import java.math.BigDecimal
import java.math.BigInteger
import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList
import kotlin.collections.MutableMap
import kotlin.collections.MutableSet
import kotlin.collections.Set
import kotlin.collections.mutableMapOf
import kotlin.collections.toHashSet
import kotlin.collections.toList
import kotlin.collections.toMutableList
import kotlin.collections.toMutableSet
import kotlin.collections.toSet


/**
 *
 */
@ExperimentalUnsignedTypes
inline fun <reified Return> convertFromMathematicaTo(any: Any?, vararg arguments: Any? = arrayOf()): Return {
	val returnClass = kotlinClass<Return>()

//	if (any == null) throw IllegalArgumentException("Cannot convert null to ${returnClass.qualifiedName}.")

	val result: Return? = convertFromMathematicaToOrNull<Return>(any, arguments)
		?: throw IllegalArgumentException("The conversion returned null, hence is not  possible to convert ${returnClass.qualifiedName}. Use convertToOrNull if necessary.")

	return result as Return
}

/**
 *
 */
@ExperimentalUnsignedTypes
@Suppress("IMPLICIT_CAST_TO_ANY")
inline fun <reified Return> convertFromMathematicaToOrNull(any: Any?, @Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf()): Return? {
	val returnClass = kotlinClass<Return>()
	val anyAsString = any.toString()

	val fromMathematicaList = {input: String -> input.drop(1).dropLast(1).split(", ").toMutableList()
	}

	return when {
		returnClass.isSuperclassOf(String::class) -> {
			anyAsString
		}
		returnClass.isSuperclassOf(Boolean::class) -> {
			anyAsString.toBoolean()
		}
		returnClass.isSuperclassOf(Byte::class) -> {
			anyAsString.toByteOrNull()
		}
		returnClass.isSuperclassOf(Short::class) -> {
			anyAsString.toShortOrNull()
		}
		returnClass.isSuperclassOf(Int::class) -> {
			anyAsString.toIntOrNull()
		}
		returnClass.isSuperclassOf(Long::class) -> {
			anyAsString.toLongOrNull()
		}
		returnClass.isSuperclassOf(Float::class) -> {
			anyAsString.toFloatOrNull()
		}
		returnClass.isSuperclassOf(Double::class) -> {
			anyAsString.toDoubleOrNull()
		}
		returnClass.isSuperclassOf(BigInteger::class) -> {
			anyAsString.toBigIntegerOrNull()
		}
		returnClass.isSuperclassOf(BigDecimal::class) -> {
			anyAsString.toBigDecimalOrNull()
		}
		returnClass.isSuperclassOf(ByteArray::class) -> {
			anyAsString.toByteArray()
		}
		returnClass.isSuperclassOf(CharArray::class) -> {
			anyAsString.toCharArray()
		}
		returnClass.isSuperclassOf(Regex::class) -> {
			anyAsString.toRegex()
		}
		returnClass.isSuperclassOf(Pattern::class) -> {
			anyAsString.toPattern()
		}
		returnClass.isSuperclassOf(UByte::class) -> {
			anyAsString.toUByteOrNull()
		}
		returnClass.isSuperclassOf(UInt::class) -> {
			anyAsString.toUIntOrNull()
		}
		returnClass.isSuperclassOf(ULong::class) -> {
			anyAsString.toULongOrNull()
		}
		returnClass.isSuperclassOf(UShort::class) -> {
			anyAsString.toUShortOrNull()
		}
		returnClass.isSuperclassOf(List::class) -> {
			fromMathematicaList(anyAsString).toList()
		}
		returnClass.isSuperclassOf(ArrayList::class) -> {
			ArrayList(fromMathematicaList(anyAsString))
		}
		returnClass.isSuperclassOf(MutableList::class) -> {
			fromMathematicaList(anyAsString)
		}
		returnClass.isSuperclassOf(Set::class) -> {
			fromMathematicaList(anyAsString).toSet()
		}
		returnClass.isSuperclassOf(HashSet::class) -> {
			fromMathematicaList(anyAsString).toHashSet()
		}
		returnClass.isSuperclassOf(MutableSet::class) -> {
			fromMathematicaList(anyAsString).toMutableSet()
		}
		returnClass.isSuperclassOf(Map::class) -> {
		}
		returnClass.isSuperclassOf(HashMap::class) -> {
		}
		returnClass.isSuperclassOf(MutableMap::class) -> {
		}
		else -> {
			throw IllegalArgumentException("Unrecognized class $returnClass.")
		}
	} as Return
}

fun executeOnMathematica(command: String, @Suppress("UNUSED_PARAMETER") vararg arguments: Any?, options: Map<String, Any?> = mutableMapOf()): Result {
	val mathematica by lazy { Mathematica() }

	try {
		val evaluationTypeEnum: EvaluationTypeEnum =
			options.getOrDefault(type, INPUT_FORM) as EvaluationTypeEnum

		return with(mathematica) {
			when {
				UNIT == evaluationTypeEnum -> Result(
					null,
					UNIT
				)
				INPUT_FORM == evaluationTypeEnum -> Result(
					evaluateToInputForm(command),
					INPUT_FORM
				)
				OUTPUT_FORM == evaluationTypeEnum -> {
					val pageWidth = options.getAndCastOrDefault("pageWidth", 0)

					Result(
						evaluateToOutputForm(command, pageWidth),
						OUTPUT_FORM
					)
				}
				IMAGE == evaluationTypeEnum -> {
					val width = options.getAndCastOrDefault("width", 0)
					val height = options.getAndCastOrDefault("height", 0)
					val dpi = options.getAndCastOrDefault("dpi", 0)
					val useFE = options.getAndCastOrDefault("useFrontEnd", false)

					Result(
						evaluateToImage(command, width, height, dpi, useFE),
						IMAGE
					)
				}
				TYPE_SET == evaluationTypeEnum -> {
					val width = options.getAndCastOrDefault("width", 0)
					val useStandardForm = options.getAndCastOrDefault("useStandardForm", true)

					Result(
						evaluateToTypeset(command, width, useStandardForm),
						TYPE_SET
					)
				}
				else -> throw IllegalArgumentException("""Unrecognized kind of evaluation "$evaluationTypeEnum".""")
			}
		}
	} finally {
		mathematica.closeKernelLink()
	}
}

fun detectOperatingSystem(): OperatingSystem {
	val os = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH)

	return if (os.indexOf("mac") >= 0 || os.indexOf("darwin") >= 0) {
		OperatingSystem.MAC_OS_X
	} else if (os.indexOf("win") >= 0) {
		OperatingSystem.WINDOWS
	} else if (os.indexOf("nux") >= 0) {
		OperatingSystem.LINUX
	} else {
		OperatingSystem.OTHER
	}
}
