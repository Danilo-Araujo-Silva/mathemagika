package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FactorSquareFreeList
 *
 * Full name:        System`FactorSquareFreeList
 *
 * Usage:            FactorSquareFreeList[poly] gives a list of square‐free factors of a polynomial, together with their exponents.
 *
 *                   Extension -> None
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FactorSquareFreeList
 * Documentation:    web: http://reference.wolfram.com/language/ref/FactorSquareFreeList.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun factorSquareFreeList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FactorSquareFreeList", arguments.toMutableList(), options)
}
