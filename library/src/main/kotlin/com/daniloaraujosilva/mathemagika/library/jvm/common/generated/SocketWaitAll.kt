package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SocketWaitAll
 * 
 * Full name:        System`SocketWaitAll
 * 
 *                   SocketWaitAll[{socket , socket , …}] waits until there is data ready to read on all of the socket .
 * Usage:                                 1        2                                                                  i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SocketWaitAll
 * Documentation:    web: http://reference.wolfram.com/language/ref/SocketWaitAll.html
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
fun socketWaitAll(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SocketWaitAll", arguments.toMutableList(), options)
}
