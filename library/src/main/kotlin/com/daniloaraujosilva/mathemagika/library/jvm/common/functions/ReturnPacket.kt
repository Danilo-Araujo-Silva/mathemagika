package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ReturnPacket
 *
 * Full name:        System`ReturnPacket
 *
 * Usage:            ReturnPacket[expr] is a WSTP packet that contains the expression expr, the result of an EvaluatePacket evaluation.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ReturnPacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReturnPacket.html
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
fun returnPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReturnPacket", arguments.toMutableList(), options)
}
