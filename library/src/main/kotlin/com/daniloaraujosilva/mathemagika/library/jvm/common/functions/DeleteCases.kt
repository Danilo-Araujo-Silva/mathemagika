package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeleteCases
 *
 * Full name:        System`DeleteCases
 *
 *                   DeleteCases[expr, pattern] removes all elements of expr that match pattern.
 *                   DeleteCases[expr, pattern, levelspec] removes all parts of expr on levels specified by levelspec that match pattern.
 *                   DeleteCases[expr, pattern, levelspec, n] removes the first n parts of expr that match pattern.
 * Usage:            DeleteCases[pattern] represents an operator form of DeleteCases that can be applied to an expression.
 *
 * Options:          Heads -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DeleteCases
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteCases.html
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
fun deleteCases(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteCases", arguments.toMutableList(), options)
}
