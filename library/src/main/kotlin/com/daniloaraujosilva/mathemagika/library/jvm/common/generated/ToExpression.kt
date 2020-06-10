package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ToExpression
 * 
 * Full name:        System`ToExpression
 * 
 *                   ToExpression[input] gives the expression obtained by interpreting strings or boxes as Wolfram Language input. 
 *                   ToExpression[input, form] uses interpretation rules corresponding to the specified form. 
 * Usage:            ToExpression[input, form, h] wraps the head h around the expression produced before evaluating it. 
 * 
 * Options:          None
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ToExpression
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToExpression.html
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
fun toExpression(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToExpression", arguments.toMutableList(), options)
}
