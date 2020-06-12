package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Replace
 *
 * Full name:        System`Replace
 *
 *                   Replace[expr, rules] applies a rule or list of rules in an attempt to transform the entire expression expr.
 *                   Replace[expr, rules, levelspec] applies rules to parts of expr specified by levelspec.
 * Usage:            Replace[rules] represents an operator form of Replace that can be applied to an expression.
 *
 * Options:          Heads -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Replace
 * Documentation:    web: http://reference.wolfram.com/language/ref/Replace.html
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
fun replace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Replace", arguments.toMutableList(), options)
}
