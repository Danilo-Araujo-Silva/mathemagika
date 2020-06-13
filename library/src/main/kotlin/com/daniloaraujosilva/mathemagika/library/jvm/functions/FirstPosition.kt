package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FirstPosition
 *
 * Full name:        System`FirstPosition
 *
 *                   FirstPosition[expr, pattern] gives the position of the first element in expr that matches pattern, or Missing["NotFound"] if no such element is found.
 *                   FirstPosition[expr, pattern, default] gives default if no element matching pattern is found.
 *                   FirstPosition[expr, pattern, default, levelspec] finds only objects that appear on levels specified by levelspec.
 * Usage:            FirstPosition[pattern] represents an operator form of FirstPosition that can be applied to an expression.
 *
 * Options:          Heads -> True
 *
 *                   HoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FirstPosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/FirstPosition.html
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
fun firstPosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FirstPosition", arguments.toMutableList(), options)
}
