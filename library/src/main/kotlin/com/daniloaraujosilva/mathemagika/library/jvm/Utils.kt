package com.daniloaraujosilva.mathemagika.library.jvm.common

import com.daniloaraujosilva.mathemagika.library.common.OperatingSystem
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.*
import com.daniloaraujosilva.mathemagika.library.common.jvm.Result
import java.math.BigDecimal
import java.math.BigInteger
import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet
import kotlin.reflect.KClass


/**
 *
 */
@ExperimentalUnsignedTypes
inline fun <reified Return> convertFromMathematicaTo(any: Any?, vararg arguments: Any? = arrayOf()): Return {
	val returnClass = kotlinClass<Return>()

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
		isSuperClassOf(ArrayList::class, returnClass) -> {
			ArrayList(fromMathematicaList(anyAsString))
		}
		isSuperClassOf(BigDecimal::class, returnClass) -> {
			anyAsString.toBigDecimalOrNull()
		}
		isSuperClassOf(BigInteger::class, returnClass) -> {
			anyAsString.toBigIntegerOrNull()
		}
		isSuperClassOf(ByteArray::class, returnClass) -> {
			anyAsString.toByteArray()
		}
		isSuperClassOf(Boolean::class, returnClass) -> {
			anyAsString.toBoolean()
		}
		isSuperClassOf(Byte::class, returnClass) -> {
			anyAsString.toByteOrNull()
		}
		isSuperClassOf(CharArray::class, returnClass) -> {
			anyAsString.toCharArray()
		}
		isSuperClassOf(Double::class, returnClass) -> {
			anyAsString.toDoubleOrNull()
		}
		isSuperClassOf(Float::class, returnClass) -> {
			anyAsString.toFloatOrNull()
		}
		isSuperClassOf(HashMap::class, returnClass) -> {
		}
		isSuperClassOf(HashSet::class, returnClass) -> {
			fromMathematicaList(anyAsString).toHashSet()
		}
		isSuperClassOf(Int::class, returnClass) -> {
			anyAsString.toIntOrNull()
		}
		isSuperClassOf(List::class, returnClass) -> {
			fromMathematicaList(anyAsString).toList()
		}
		isSuperClassOf(Long::class, returnClass) -> {
			anyAsString.toLongOrNull()
		}
		isSuperClassOf(Map::class, returnClass) -> {
		}
		isSuperClassOf(MutableList::class, returnClass) -> {
			fromMathematicaList(anyAsString)
		}
		isSuperClassOf(MutableMap::class, returnClass) -> {
		}
		isSuperClassOf(MutableSet::class, returnClass) -> {
			fromMathematicaList(anyAsString).toMutableSet()
		}
		isSuperClassOf(Pattern::class, returnClass) -> {
			anyAsString.toPattern()
		}
		isSuperClassOf(Regex::class, returnClass) -> {
			anyAsString.toRegex()
		}
		isSuperClassOf(Set::class, returnClass) -> {
			fromMathematicaList(anyAsString).toSet()
		}
		isSuperClassOf(Short::class, returnClass) -> {
			anyAsString.toShortOrNull()
		}
		isSuperClassOf(String::class, returnClass) -> {
			anyAsString
		}
		isSuperClassOf(UByte::class, returnClass) -> {
			anyAsString.toUByteOrNull()
		}
		isSuperClassOf(UInt::class, returnClass) -> {
			anyAsString.toUIntOrNull()
		}
		isSuperClassOf(ULong::class, returnClass) -> {
			anyAsString.toULongOrNull()
		}
		isSuperClassOf(UShort::class, returnClass) -> {
			anyAsString.toUShortOrNull()
		}
		else -> {
			throw IllegalArgumentException("Unrecognized class $returnClass.")
		}
	} as Return
}

fun executeOnMathematica(command: String, @Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(), options: Map<String, Any?> = mutableMapOf()): Result {
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
					val pageWidth = options.getAndCastOrDefault<Int>("pageWidth", 0)

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

/**
 *
 */
fun <A : Any, B: Any> isSuperClassOf(possibleSuperClass: KClass<A>, targetClass: KClass<B>): Boolean {
	return if (possibleSuperClass == targetClass)
		true
	else
		targetClass.java.isAssignableFrom(possibleSuperClass.java)
}

/**
 *
 */
inline fun <reified Return> run(command: String, @Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(), options: Map<String, Any?> = mutableMapOf()): Return {
	return executeOnMathematica(command, arguments, options.merge(mapOf(type to INPUT_FORM))).extract()
}

/**
 *
 */
fun runToInputForm(command: String, @Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(), options: Map<String, Any?> = mutableMapOf()): String {
	return executeOnMathematica(command, arguments, options.merge(mapOf(type to INPUT_FORM))).extract()
}

/**
 *
 */
fun runToOutputForm(command: String, @Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(), options: Map<String, Any?> = mutableMapOf()): String {
	return executeOnMathematica(command, arguments, options.merge(mapOf(type to OUTPUT_FORM))).extract()
}

/**
 *
 */
fun runToImage(command: String, @Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(), options: Map<String, Any?> = mutableMapOf()): ByteArray {
	return executeOnMathematica(command, arguments, options.merge(mapOf(type to IMAGE))).extract()
}

/**
 *
 */
fun runToTypeSet(command: String, @Suppress("UNUSED_PARAMETER") vararg arguments: Any? = arrayOf(), options: Map<String, Any?> = mutableMapOf()): ByteArray {
	return executeOnMathematica(command, arguments, options.merge(mapOf(type to TYPE_SET))).extract()
}

/**
 *
 */
fun l(vararg arguments: Any?): MutableList<Any?> = arguments.toMutableList()

/**
 *
 */
@Suppress("UNCHECKED_CAST")
inline fun <reified Type> kotlinClass(): KClass<Any> = (Type::class as KClass<Any>)
