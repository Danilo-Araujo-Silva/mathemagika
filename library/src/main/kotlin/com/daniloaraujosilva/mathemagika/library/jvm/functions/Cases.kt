package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Cases
 *
 * Full name:        System`Cases
 *
 *                   Cases[{e , e , …}, pattern] gives a list of the e  that match the pattern.
 *                           1   2                                    i
 *                   Cases[{e , …}, pattern  rhs] gives a list of the values of rhs corresponding to the e  that match the pattern.
 *                           1                                                                             i
 *                   Cases[expr, pattern, levelspec] gives a list of all parts of expr on levels specified by levelspec that match the pattern.
 *                   Cases[expr, pattern  rhs, levelspec] gives the values of rhs that match the pattern.
 *                   Cases[expr, pattern, levelspec, n] gives the first n parts in expr that match the pattern.
 * Usage:            Cases[pattern] represents an operator form of Cases that can be applied to an expression.
 *
 * Options:          Heads -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Cases
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cases.html
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
fun cases(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cases", arguments.toMutableList(), options)
}
