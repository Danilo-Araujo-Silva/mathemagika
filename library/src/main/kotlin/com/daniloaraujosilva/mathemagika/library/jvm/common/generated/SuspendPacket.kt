package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SuspendPacket
 * 
 * Full name:        System`SuspendPacket
 * 
 * Usage:            SuspendPacket[] is a WSTP packet used for synchronization with the Wolfram Language kernel.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SuspendPacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/SuspendPacket.html
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
fun suspendPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SuspendPacket", arguments.toMutableList(), options)
}
