package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InverseCDF
 *
 * Full name:        System`InverseCDF
 *
 * Usage:            InverseCDF[dist, q] gives the inverse of the cumulative distribution function for the distribution dist as a function of the variable q.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseCDF
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseCDF.html
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
fun inverseCDF(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseCDF", arguments.toMutableList(), options)
}
