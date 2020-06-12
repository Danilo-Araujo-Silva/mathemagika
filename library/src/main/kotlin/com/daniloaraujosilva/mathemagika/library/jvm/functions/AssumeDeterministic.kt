package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AssumeDeterministic
 *
 * Full name:        System`AssumeDeterministic
 *
 * Usage:            AssumeDeterministic is an option for functions such as BayesianMinimization that specifies whether or not the function being considered should be assumed to be deterministic.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AssumeDeterministic
 * Documentation:    web: http://reference.wolfram.com/language/ref/AssumeDeterministic.html
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
fun assumeDeterministic(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AssumeDeterministic", arguments.toMutableList(), options)
}
