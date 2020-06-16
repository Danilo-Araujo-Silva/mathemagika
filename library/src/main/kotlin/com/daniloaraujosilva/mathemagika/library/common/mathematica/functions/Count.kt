package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Count
 *
 * Full name:        System`Count
 *
 *                   Count[list, pattern] gives the number of elements in list that match pattern.
 *                   Count[expr, pattern, levelspec] gives the total number of subexpressions matching pattern that appear at the levels in expr specified by levelspec.
 * Usage:            Count[pattern] represents an operator form of Count that can be applied to an expression.
 *
 * Options:          Heads -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Count
 * Documentation:    web: http://reference.wolfram.com/language/ref/Count.html
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
fun count(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Count", arguments.toMutableList(), options)
}
