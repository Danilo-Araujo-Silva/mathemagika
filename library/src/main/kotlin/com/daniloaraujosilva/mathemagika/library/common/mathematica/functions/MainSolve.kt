package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MainSolve
 *
 * Full name:        System`MainSolve
 *
 * Usage:            MainSolve[eqns] is the underlying function for transforming systems of equations. Solve and Eliminate call it. The equations must be of the form lhs == rhs. They can be combined using && and ||. MainSolve returns False if no solutions to the equations exist, and True if all values of variables are solutions. MainSolve rearranges the equations using certain directives. MainSolve[eqns, vars, elim, rest] attempts to rearrange the equations eqns so as to solve for the variables vars, and eliminate the variables elim. The list rest can be included to specify the elimination order for any remaining variables.
 *
 *                   InverseFunctions -> Automatic
 *                   MakeRules -> False
 *                   Method -> 1
 *                   Mode -> Rational
 *                   Sort -> True
 *                   VerifySolutions -> False
 * Options:          WorkingPrecision -> Infinity
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
fun mainSolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MainSolve", arguments.toMutableList(), options)
}
