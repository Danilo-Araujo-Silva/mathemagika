package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RSolve
 *
 * Full name:        System`RSolve
 *
 *                   RSolve[eqn, a[n], n] solves a recurrence equation for a[n].
 *                   RSolve[{eqn , eqn , …}, {a [n], a [n], …}, n] solves a system of recurrence equations.
 *                              1     2        1      2
 *                   RSolve[eqn, a[n , n , …], {n , n , …}] solves a partial recurrence equation.
 * Usage:                           1   2        1   2
 *
 *                   Assumptions :> $Assumptions
 *                   GeneratedParameters -> C
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RSolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/RSolve.html
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
fun rSolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RSolve", arguments.toMutableList(), options)
}
