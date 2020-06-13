package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MakeExpression
 *
 * Full name:        System`MakeExpression
 *
 * Usage:            MakeExpression[boxes, form] is the low‐level function used in Wolfram System sessions to construct expressions from boxes.
 *
 * Options:          None
 *
 * Attributes:       Listable
 *
 *                   local: paclet:ref/MakeExpression
 * Documentation:    web: http://reference.wolfram.com/language/ref/MakeExpression.html
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
fun makeExpression(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MakeExpression", arguments.toMutableList(), options)
}
