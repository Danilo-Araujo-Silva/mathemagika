package com.daniloaraujosilva.mathemagika.library.jvm.common

import com.daniloaraujosilva.mathemagika.library.common.jvm.Mathematica
import java.lang.RuntimeException

/**
 *
 */
inline fun <reified Return> Map<String, Any?>.getAndCastOrDefault(key: String?, default: Return): Return {
	if (key == null || !containsKey(key)) return default

	return get(key) as Return
}

/**
 *
 */
@ExperimentalUnsignedTypes
inline fun <reified Return> String.runOnMathematica(vararg arguments: Any? = arrayOf()): Return {
	return runOnMathematicaOrNull<Return>(arguments)
		?: throw RuntimeException("""The command "$this" returned null on Mathematica and cannot be parsed.""")
}

/**
 *
 */
@ExperimentalUnsignedTypes
inline fun <reified Return> String.runOnMathematicaOrNull(vararg arguments: Any? = arrayOf()): Return? {
	lateinit var mathematica: Mathematica

	try {
		mathematica = Mathematica()

		println("""$this""")

		return convertFromMathematicaToOrNull(mathematica.evaluateToInputForm(this))
	} finally {
		mathematica.closeKernelLink()
	}
}
