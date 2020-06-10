package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             InputStringPacket
 * 
 * Full name:        System`InputStringPacket
 * 
 * Usage:            InputStringPacket[] is a WSTP packet that requests input in string form.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/InputStringPacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/InputStringPacket.html
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
fun inputStringPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InputStringPacket", arguments.toMutableList(), options)
}
