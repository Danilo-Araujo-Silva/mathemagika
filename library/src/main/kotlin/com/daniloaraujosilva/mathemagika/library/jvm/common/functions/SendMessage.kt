package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SendMessage
 *
 * Full name:        System`SendMessage
 *
 *                   SendMessage[channel, message] sends a message to the specified channel.
 * Usage:            SendMessage[channel  dest, message] sends a message to the destination dest through the specified channel.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SendMessage
 * Documentation:    web: http://reference.wolfram.com/language/ref/SendMessage.html
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
fun sendMessage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SendMessage", arguments.toMutableList(), options)
}
