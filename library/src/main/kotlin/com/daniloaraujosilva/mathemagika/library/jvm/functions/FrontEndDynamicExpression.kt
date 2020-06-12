package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FrontEndDynamicExpression
 *
 * Full name:        System`FrontEndDynamicExpression
 *
 * Usage:            FrontEndDynamicExpression is a global front end option that specifies an expression to be dynamically updated whenever the front end is running.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FrontEndDynamicExpression
 * Documentation:    web: http://reference.wolfram.com/language/ref/FrontEndDynamicExpression.html
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
fun frontEndDynamicExpression(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FrontEndDynamicExpression", arguments.toMutableList(), options)
}
