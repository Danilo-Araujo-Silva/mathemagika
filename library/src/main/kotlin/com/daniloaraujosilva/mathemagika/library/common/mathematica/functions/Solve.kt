package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Solve
 *
 * Full name:        System`Solve
 *
 *                   Solve[expr, vars] attempts to solve the system expr of equations or inequalities for the variables vars.
 * Usage:            Solve[expr, vars, dom] solves over the domain dom. Common choices of dom are Reals, Integers, and Complexes.
 *
 *                   Cubics -> Automatic
 *                   GeneratedParameters -> C
 *                   InverseFunctions -> Automatic
 *                   MaxExtraConditions -> 0
 *                   Method -> Automatic
 *                   Modulus -> 0
 *                   Quartics -> Automatic
 *                   VerifySolutions -> Automatic
 * Options:          WorkingPrecision -> Infinity
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Solve
 * Documentation:    web: http://reference.wolfram.com/language/ref/Solve.html
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
fun solve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Solve", arguments.toMutableList(), options)
}
