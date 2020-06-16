package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SocketOpen
 *
 * Full name:        System`SocketOpen
 *
 *                   SocketOpen[port] opens a socket that accepts TCP connections to localhost:port and returns a SocketObject representing the socket.
 *                   SocketOpen[address] opens a socket that accepts TCP connections to the specified local address.
 *                   SocketOpen[address, "protocol"] opens a socket that accepts connections with the specified protocol.
 * Usage:            SocketOpen[address, {"protocol", "type"}] opens a socket that accepts connections of the specified protocol and type.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SocketOpen
 * Documentation:    web: http://reference.wolfram.com/language/ref/SocketOpen.html
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
fun socketOpen(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SocketOpen", arguments.toMutableList(), options)
}
