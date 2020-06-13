package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SocketWaitNext
 *
 * Full name:        System`SocketWaitNext
 *
 *                   SocketWaitNext[{socket , socket , …}] waits until there is data ready to read on any of the socket , then returns that socket.
 * Usage:                                  1        2                                                                  i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SocketWaitNext
 * Documentation:    web: http://reference.wolfram.com/language/ref/SocketWaitNext.html
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
fun socketWaitNext(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SocketWaitNext", arguments.toMutableList(), options)
}
