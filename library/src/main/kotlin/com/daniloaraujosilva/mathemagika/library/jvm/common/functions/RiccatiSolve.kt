package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RiccatiSolve
 *
 * Full name:        System`RiccatiSolve
 *
 *                                                                                                                                                  †                        -1    †
 *                   RiccatiSolve[{a, b}, {q, r}] gives the matrix x that is the stabilizing solution of the continuous algebraic Riccati equation a  . x + x . a - x . b . r   . b  . x + q  0.
 *                                                                        †                              -1     †        †
 * Usage:            RiccatiSolve[{a, b}, {q, r, p}] solves the equation a  . x + x . a - (x . b + p) . r   . (b  . x + p ) + q  0.
 *
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RiccatiSolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/RiccatiSolve.html
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
fun riccatiSolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RiccatiSolve", arguments.toMutableList(), options)
}
