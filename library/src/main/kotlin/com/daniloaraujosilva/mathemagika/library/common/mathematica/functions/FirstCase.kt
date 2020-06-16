package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FirstCase
 *
 * Full name:        System`FirstCase
 *
 *                   FirstCase[{e , e , …}, pattern] gives the first e  to match pattern, or Missing["NotFound"] if none matching pattern is found.
 *                               1   2                                i
 *                   FirstCase[{e , …}, pattern  rhs] gives the value of rhs corresponding to the first e  to match pattern.
 *                               1                                                                        i
 *                   FirstCase[expr, pattern, default] gives default if no element matching pattern is found.
 *                   FirstCase[expr, pattern, default, levelspec] finds only objects that appear on levels specified by levelspec.
 * Usage:            FirstCase[pattern] represents an operator form of FirstCase that can be applied to an expression.
 *
 * Options:          Heads -> False
 *
 *                   HoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FirstCase
 * Documentation:    web: http://reference.wolfram.com/language/ref/FirstCase.html
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
fun firstCase(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FirstCase", arguments.toMutableList(), options)
}
