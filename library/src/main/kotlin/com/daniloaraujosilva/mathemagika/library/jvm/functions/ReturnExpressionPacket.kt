package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ReturnExpressionPacket
 *
 * Full name:        System`ReturnExpressionPacket
 *
 * Usage:            ReturnExpressionPacket[expr] is a WSTP packet that contains the expression expr, the result of an EnterExpressionPacket evaluation.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ReturnExpressionPacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReturnExpressionPacket.html
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
fun returnExpressionPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReturnExpressionPacket", arguments.toMutableList(), options)
}
