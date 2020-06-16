package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LyapunovSolve
 *
 * Full name:        System`LyapunovSolve
 *
 *                   LyapunovSolve[a, c] finds a solution x of the matrix Lyapunov equation a . x + x . a   c.
 *                   LyapunovSolve[a, b, c] solves a . x + x . b  c.
 *                   LyapunovSolve[{a, d}, c] solves a . x . d  + d . x . a   c.
 * Usage:            LyapunovSolve[{a, d}, {b, e}, c] solves a . x . e + d . x . b  c.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LyapunovSolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/LyapunovSolve.html
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
fun lyapunovSolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LyapunovSolve", arguments.toMutableList(), options)
}
