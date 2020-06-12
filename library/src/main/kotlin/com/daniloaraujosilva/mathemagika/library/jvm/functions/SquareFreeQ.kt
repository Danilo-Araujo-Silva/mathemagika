package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SquareFreeQ
 *
 * Full name:        System`SquareFreeQ
 *
 *                   SquareFreeQ[expr] gives True if expr is a square-free polynomial or number, and False otherwise.
 * Usage:            SquareFreeQ[expr, vars] gives True if expr is square-free with respect to the variables vars.
 *
 *                   GaussianIntegers -> Automatic
 * Options:          Modulus -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SquareFreeQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/SquareFreeQ.html
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
fun squareFreeQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SquareFreeQ", arguments.toMutableList(), options)
}
