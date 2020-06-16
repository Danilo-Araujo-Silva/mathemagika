package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ConditionalExpression
 *
 * Full name:        System`ConditionalExpression
 *
 * Usage:            ConditionalExpression[expr, cond] is a symbolic construct that represents the expression expr when the condition cond is True.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConditionalExpression
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConditionalExpression.html
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
fun conditionalExpression(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConditionalExpression", arguments.toMutableList(), options)
}
