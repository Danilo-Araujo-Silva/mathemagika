package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ReplaceAll
 *
 * Full name:        System`ReplaceAll
 *
 *                   expr/.rules applies a rule or list of rules in an attempt to transform each subpart of an expression expr.
 * Usage:            ReplaceAll[rules] represents an operator form of ReplaceAll that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ReplaceAll
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReplaceAll.html
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
fun replaceAll(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReplaceAll", arguments.toMutableList(), options)
}
