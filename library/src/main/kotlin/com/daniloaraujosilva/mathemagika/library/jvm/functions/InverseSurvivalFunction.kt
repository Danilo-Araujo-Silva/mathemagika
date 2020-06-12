package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseSurvivalFunction
 *
 * Full name:        System`InverseSurvivalFunction
 *
 * Usage:            InverseSurvivalFunction[dist, q] gives the inverse of the survival function for the distribution dist as a function of the variable q.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseSurvivalFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseSurvivalFunction.html
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
fun inverseSurvivalFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseSurvivalFunction", arguments.toMutableList(), options)
}
