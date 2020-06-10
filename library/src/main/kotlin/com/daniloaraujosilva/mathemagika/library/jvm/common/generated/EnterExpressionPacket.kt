package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EnterExpressionPacket
 * 
 * Full name:        System`EnterExpressionPacket
 * 
 * Usage:            EnterExpressionPacket[expr] is a WSTP packet that requests the evaluation of expr.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/EnterExpressionPacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/EnterExpressionPacket.html
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
fun enterExpressionPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EnterExpressionPacket", arguments.toMutableList(), options)
}
