package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PadeApproximant
 *
 * Full name:        System`PadeApproximant
 *
 *                   PadeApproximant[expr, {x, x , {m, n}}] gives the Padé approximant to expr about the point x = x , with numerator order m and denominator order n.
 *                                              0                                                                   0
 *                   PadeApproximant[expr, {x, x , n}] gives the diagonal Padé approximant to expr about the point x = x  of order n.
 * Usage:                                       0                                                                       0
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PadeApproximant
 * Documentation:    web: http://reference.wolfram.com/language/ref/PadeApproximant.html
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
fun padeApproximant(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PadeApproximant", arguments.toMutableList(), options)
}
