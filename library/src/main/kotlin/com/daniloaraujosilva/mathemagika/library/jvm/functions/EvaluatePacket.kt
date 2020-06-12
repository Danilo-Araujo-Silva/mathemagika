package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EvaluatePacket
 *
 * Full name:        System`EvaluatePacket
 *
 * Usage:            EvaluatePacket[expr] is a WSTP packet requesting evaluation of expr.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EvaluatePacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/EvaluatePacket.html
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
fun evaluatePacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EvaluatePacket", arguments.toMutableList(), options)
}
