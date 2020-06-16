package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ParametricFunction
 *
 * Full name:        System`ParametricFunction
 *
 * Usage:            ParametricFunction[pars, …] represents a function that computes a solution when evaluated with numerical values for the parameters pars.
 *
 * Options:          None
 *
 *                   HoldAllComplete
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ParametricFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParametricFunction.html
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
fun parametricFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParametricFunction", arguments.toMutableList(), options)
}
