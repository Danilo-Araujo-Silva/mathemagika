package com.daniloaraujosilva.mathemagika.library.jvm.common

import com.daniloaraujosilva.mathemagika.common.jvm.common.isSuperclassOf
import com.daniloaraujosilva.mathemagika.common.jvm.common.kotlinClass
import java.math.BigDecimal
import java.math.BigInteger
import java.util.regex.Pattern

/**
 *
 */
@ExperimentalUnsignedTypes
inline fun <reified Return> convertFromMathematicaTo(any: Any?, vararg arguments: Any? = arrayOf()): Return {
	val returnClass = kotlinClass<Return>()

	if (any == null) throw IllegalArgumentException("Cannot null to ${returnClass.qualifiedName}.")

	val result: Return? = convertFromMathematicaToOrNull<Return>(any, arguments)
		?: throw IllegalArgumentException("The conversion returned null, hence is not  possible to convert ${returnClass.qualifiedName}. Use convertToOrNull if necessary.")

	return result as Return
}

/**
 *
 */
@ExperimentalUnsignedTypes
@Suppress("IMPLICIT_CAST_TO_ANY")
inline fun <reified Return> convertFromMathematicaToOrNull(any: Any?, vararg arguments: Any? = arrayOf()): Return? {
	val returnClass = kotlinClass<Return>()
	val anyAsString = any.toString()

	val fromMathematicaList = {
			input: String -> input.drop(1).dropLast(1).split(", ").toMutableList()
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
