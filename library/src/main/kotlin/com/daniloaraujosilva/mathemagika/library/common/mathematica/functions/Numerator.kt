package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Numerator
 *
 * Full name:        System`Numerator
 *
 * Usage:            Numerator[expr] gives the numerator of expr.
 *
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Numerator
 * Documentation:    web: http://reference.wolfram.com/language/ref/Numerator.html
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
fun numerator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Numerator", arguments.toMutableList(), options)
}
