package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SolveAlways
 *
 * Full name:        System`SolveAlways
 *
 * Usage:            SolveAlways[eqns, vars] gives the values of parameters that make the equations eqns valid for all values of the variables vars.
 *
 *                   InverseFunctions -> Automatic
 *                   MakeRules -> False
 *                   Method -> 3
 *                   Mode -> Generic
 *                   Sort -> True
 * Options:          WorkingPrecision -> Infinity
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SolveAlways
 * Documentation:    web: http://reference.wolfram.com/language/ref/SolveAlways.html
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
fun solveAlways(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SolveAlways", arguments.toMutableList(), options)
}
