package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ReturnTextPacket
 * 
 * Full name:        System`ReturnTextPacket
 * 
 * Usage:            ReturnTextPacket[string] is a WSTP packet containing string, the result of an EnterTextPacket evaluation.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ReturnTextPacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReturnTextPacket.html
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
fun returnTextPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReturnTextPacket", arguments.toMutableList(), options)
}
