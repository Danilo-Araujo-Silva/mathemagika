package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SocketReadMessage
 *
 * Full name:        System`SocketReadMessage
 *
 * Usage:            SocketReadMessage[socket] reads the next available message on the specified socket, returning it as a byte array.
 *
 *                   Multipart -> True
 * Options:          Blocking -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SocketReadMessage
 * Documentation:    web: http://reference.wolfram.com/language/ref/SocketReadMessage.html
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
fun socketReadMessage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SocketReadMessage", arguments.toMutableList(), options)
}
