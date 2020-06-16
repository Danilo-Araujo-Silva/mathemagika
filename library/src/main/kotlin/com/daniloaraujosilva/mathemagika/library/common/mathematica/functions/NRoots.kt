package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NRoots
 *
 * Full name:        System`NRoots
 *
 * Usage:            NRoots[lhs == rhs, var] yields a disjunction of equations which represent numerical approximations to the roots of a polynomial equation.
 *
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PrecisionGoal -> Automatic
 * Options:          StepMonitor -> None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NRoots
 * Documentation:    web: http://reference.wolfram.com/language/ref/NRoots.html
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
fun nRoots(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NRoots", arguments.toMutableList(), options)
}
