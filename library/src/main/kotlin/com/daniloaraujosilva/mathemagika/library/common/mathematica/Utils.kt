package com.daniloaraujosilva.mathemagika.library.common.mathematica

import com.daniloaraujosilva.mathemagika.library.common.kotlinClass

/**
 *
 */
@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
@Suppress("IMPLICIT_CAST_TO_ANY")
inline fun <reified Return> convertFromMathematica(any: Any?, @Suppress("UNUSED_PARAMETER") vararg options: Any? = arrayOf()): Return {
	val returnClass = kotlinClass<Return>()
	val anyAsString = any.toString()

	val fromMathematicaList = {
		input: String ->
			val output: MutableList<Any> = mutableListOf()

			input.trimStart('{').trimEnd('}').trim().split(", ").toMutableList().map {
				output.add(it.trim('"'))
			}

			output
	}

	return when(returnClass) {
		ArrayList::class -> {
			ArrayList(fromMathematicaList(anyAsString))
		}
		ByteArray::class -> {
			anyAsString.encodeToByteArray()
		}
		Boolean::class -> {
			anyAsString.toBoolean()
		}
		Byte::class -> {
			anyAsString.toByteOrNull()
		}
		CharArray::class -> {
			anyAsString.toCharArray()
		}
		Double::class -> {
			anyAsString.toDoubleOrNull()
		}
		Float::class -> {
			anyAsString.toFloatOrNull()
		}
		HashMap::class -> {
		}
		HashSet::class -> {
			fromMathematicaList(anyAsString).toHashSet()
		}
		Int::class -> {
			anyAsString.toIntOrNull()
		}
		List::class -> {
			fromMathematicaList(anyAsString).toList()
		}
		Long::class -> {
			anyAsString.toLongOrNull()
		}
		Map::class -> {
		}
		MutableList::class -> {
			fromMathematicaList(anyAsString)
		}
		MutableMap::class -> {
		}
		MutableSet::class -> {
			fromMathematicaList(anyAsString).toMutableSet()
		}
		Regex::class -> {
			anyAsString.toRegex()
		}
		Set::class -> {
			fromMathematicaList(anyAsString).toSet()
		}
		Short::class -> {
			anyAsString.toShortOrNull()
		}
		String::class -> {
			anyAsString
		}
		UByte::class -> {
			anyAsString.toUByteOrNull()
		}
		UInt::class -> {
			anyAsString.toUIntOrNull()
		}
		ULong::class -> {
			anyAsString.toULongOrNull()
		}
		UShort::class -> {
			anyAsString.toUShortOrNull()
		}
		else -> {
			throw IllegalArgumentException("Unrecognized class $returnClass.")
		}
	} as Return
}

/**
 *
 */
fun l(vararg arguments: Any?): MutableList<Any?> = arguments.toMutableList()
