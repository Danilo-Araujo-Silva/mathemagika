package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Cancel
 *
 * Full name:        System`Cancel
 *
 * Usage:            Cancel[expr] cancels out common factors in the numerator and denominator of expr.
 *
 *                   Extension -> None
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Cancel
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cancel.html
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
fun cancel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cancel", arguments.toMutableList(), options)
}
