package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Exponent
 *
 * Full name:        System`Exponent
 *
 *                   Exponent[expr, form] gives the maximum power with which form appears in the expanded form of expr.
 * Usage:            Exponent[expr, form, h] applies h to the set of exponents with which form appears in expr.
 *
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Exponent
 * Documentation:    web: http://reference.wolfram.com/language/ref/Exponent.html
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
fun exponent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Exponent", arguments.toMutableList(), options)
}
