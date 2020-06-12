package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CallPacket
 *
 * Full name:        System`CallPacket
 *
 * Usage:            CallPacket[integer, list] is a WSTP packet encapsulating a request to invoke the external function numbered integer with the arguments contained in list.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CallPacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/CallPacket.html
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
fun callPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CallPacket", arguments.toMutableList(), options)
}
