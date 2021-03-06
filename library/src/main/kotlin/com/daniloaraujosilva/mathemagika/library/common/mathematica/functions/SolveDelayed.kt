package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SolveDelayed
 *
 * Full name:        System`SolveDelayed
 *
 * Usage:            SolveDelayed is an option to NDSolve. SolveDelayed -> False causes the derivatives to be solved for symbolically at the beginning. SolveDelayed -> True causes the ODEs to be evaluated numerically and the derivatives solved for at each step.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun solveDelayed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SolveDelayed", arguments.toMutableList(), options)
}
