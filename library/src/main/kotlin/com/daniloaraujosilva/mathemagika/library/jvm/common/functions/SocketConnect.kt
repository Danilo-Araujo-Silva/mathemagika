package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SocketConnect
 *
 * Full name:        System`SocketConnect
 *
 *                   SocketConnect[address] makes a socket connection to the TCP host at the specified address and returns a SocketObject representing the connection.
 *                   SocketConnect[address, "protocol"] makes a connection to the host at address with the specified protocol.
 * Usage:            SocketConnect[socket] makes a connection to a local socket opened in the current session.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SocketConnect
 * Documentation:    web: http://reference.wolfram.com/language/ref/SocketConnect.html
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
fun socketConnect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SocketConnect", arguments.toMutableList(), options)
}
