package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteLyapunovSolve
 *
 * Full name:        System`DiscreteLyapunovSolve
 *
 *                   DiscreteLyapunovSolve[a, c] finds the numeric solution x of the discrete matrix equation a . x . a  - x  c.
 *                   DiscreteLyapunovSolve[a, b, c] solves a . x . b - x  c.
 *                   DiscreteLyapunovSolve[{a, d}, c] solves a . x . a  - d . x . d   c.
 * Usage:            DiscreteLyapunovSolve[{a, d}, {b, e}, c] solves a . x . b - d . x . e  c.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DiscreteLyapunovSolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteLyapunovSolve.html
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
fun discreteLyapunovSolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteLyapunovSolve", arguments.toMutableList(), options)
}
