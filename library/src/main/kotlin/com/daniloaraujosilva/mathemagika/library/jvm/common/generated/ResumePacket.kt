package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ResumePacket
 * 
 * Full name:        System`ResumePacket
 * 
 * Usage:            ResumePacket[] is a WSTP packet used for synchronization with the Wolfram Language kernel.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ResumePacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResumePacket.html
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
fun resumePacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResumePacket", arguments.toMutableList(), options)
}
