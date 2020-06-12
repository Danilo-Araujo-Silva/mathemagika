package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExpandDenominator
 *
 * Full name:        System`ExpandDenominator
 *
 * Usage:            ExpandDenominator[expr] expands out products and powers that appear as denominators in expr.
 *
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ExpandDenominator
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExpandDenominator.html
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
fun expandDenominator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExpandDenominator", arguments.toMutableList(), options)
}
