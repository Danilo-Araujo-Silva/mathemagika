package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Position
 *
 * Full name:        System`Position
 *
 *                   Position[expr, pattern] gives a list of the positions at which objects matching pattern appear in expr.
 *                   Position[expr, pattern, levelspec] finds only objects that appear on levels specified by levelspec.
 *                   Position[expr, pattern, levelspec, n] gives the positions of the first n objects found.
 * Usage:            Position[pattern] represents an operator form of Position that can be applied to an expression.
 *
 * Options:          Heads -> True
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Position
 * Documentation:    web: http://reference.wolfram.com/language/ref/Position.html
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
fun position(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Position", arguments.toMutableList(), options)
}
