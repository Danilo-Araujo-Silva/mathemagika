package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SocketReadyQ
 * 
 * Full name:        System`SocketReadyQ
 * 
 *                   SocketReadyQ[socket] tests if there is any data immediately available to read from the specified socket. 
 * Usage:            SocketReadyQ[socket, t] waits for up to t seconds to see if data becomes available to read.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SocketReadyQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/SocketReadyQ.html
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
fun socketReadyQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SocketReadyQ", arguments.toMutableList(), options)
}
