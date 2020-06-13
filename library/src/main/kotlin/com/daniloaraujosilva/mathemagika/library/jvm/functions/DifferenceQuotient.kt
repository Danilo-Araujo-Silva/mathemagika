package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DifferenceQuotient
 *
 * Full name:        System`DifferenceQuotient
 *
 *                   DifferenceQuotient[f, {x, h}]  gives the difference quotient (f(x + h) - f(x))/h.
 *                   DifferenceQuotient[f, {x, n, h}] gives a multiple difference quotient with step h.
 *                   DifferenceQuotient[f, {x , n , h }, {x , n , h }, …] computes the partial difference quotient with respect to x , x , ….
 * Usage:                                    1   1   1     2   2   2                                                                1   2
 *
 * Options:          Assumptions :> $Assumptions
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DifferenceQuotient
 * Documentation:    web: http://reference.wolfram.com/language/ref/DifferenceQuotient.html
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
fun differenceQuotient(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DifferenceQuotient", arguments.toMutableList(), options)
}
