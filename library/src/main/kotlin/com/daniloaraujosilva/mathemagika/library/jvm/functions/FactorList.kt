package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FactorList
 *
 * Full name:        System`FactorList
 *
 * Usage:            FactorList[poly] gives a list of the factors of a polynomial, together with their exponents.
 *
 *                   Extension -> None
 *                   GaussianIntegers -> False
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FactorList
 * Documentation:    web: http://reference.wolfram.com/language/ref/FactorList.html
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
fun factorList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FactorList", arguments.toMutableList(), options)
}
