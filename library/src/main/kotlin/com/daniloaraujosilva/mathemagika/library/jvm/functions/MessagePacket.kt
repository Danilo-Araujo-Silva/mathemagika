package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MessagePacket
 *
 * Full name:        System`MessagePacket
 *
 * Usage:            MessagePacket[symbol, string] is a WSTP packet containing a Wolfram Language message identifier of the form symbol :: string.
 *
 * Options:          None
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MessagePacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/MessagePacket.html
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
fun messagePacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MessagePacket", arguments.toMutableList(), options)
}
