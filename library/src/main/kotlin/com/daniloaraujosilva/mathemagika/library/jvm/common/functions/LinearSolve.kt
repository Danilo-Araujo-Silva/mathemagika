package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LinearSolve
 *
 * Full name:        System`LinearSolve
 *
 *                   LinearSolve[m, b] finds an x that solves the matrix equation m . x == b.
 * Usage:            LinearSolve[m] generates a LinearSolveFunction[…] that can be applied repeatedly to different b.
 *
 *                   Method -> Automatic
 *                   Modulus -> 0
 * Options:          ZeroTest -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LinearSolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinearSolve.html
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
fun linearSolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinearSolve", arguments.toMutableList(), options)
}
