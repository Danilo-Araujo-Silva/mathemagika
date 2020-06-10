package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SocketListen
 * 
 * Full name:        System`SocketListen
 * 
 *                   SocketListen[socket, fun] starts listening on the specified socket, asynchronously applying fun whenever data is received on the socket.
 *                   SocketListen[port, fun] starts listening for active connections on the specified port of 127.0.0.1.
 *                   SocketListen[address, fun] starts listening for active connections on the specified address address on the local machine.
 *                   SocketListen[spec, opts] starts listening for active connections defined by spec using the options opts.
 * Usage:            SocketListen[spec] starts listening for active connections defined by spec, but does not set up handler functions, etc.
 * 
 *                   CharacterEncoding :> $CharacterEncoding
 *                   HandlerFunctions -> <||>
 *                   HandlerFunctionsKeys -> Default
 * Options:          RecordSeparators -> None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SocketListen
 * Documentation:    web: http://reference.wolfram.com/language/ref/SocketListen.html
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
fun socketListen(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SocketListen", arguments.toMutableList(), options)
}
