package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             N
 *
 * Full name:        System`N
 *
 *                   N[expr] gives the numerical value of expr.
 * Usage:            N[expr, n] attempts to give a result with n‐digit precision.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/N
 * Documentation:    web: http://reference.wolfram.com/language/ref/N.html
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
 * Default value:    N /: Default[N, 2] := {MachinePrecision, MachinePrecision}
 *
 * Numeric values:   None
 */
fun n(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("N", arguments.toMutableList(), options)
}
