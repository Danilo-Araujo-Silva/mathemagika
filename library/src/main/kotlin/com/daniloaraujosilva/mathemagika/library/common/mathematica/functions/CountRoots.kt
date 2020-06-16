package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CountRoots
 *
 * Full name:        System`CountRoots
 *
 *                   CountRoots[f, x] gives the number of real roots of the univariate function f in x.
 * Usage:            CountRoots[f, {x, a, b}] gives the number of roots between a and b.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CountRoots
 * Documentation:    web: http://reference.wolfram.com/language/ref/CountRoots.html
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
fun countRoots(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CountRoots", arguments.toMutableList(), options)
}
