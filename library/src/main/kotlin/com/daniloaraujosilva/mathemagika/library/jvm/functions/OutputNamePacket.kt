package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OutputNamePacket
 *
 * Full name:        System`OutputNamePacket
 *
 * Usage:            OutputNamePacket[string] is a WSTP packet that contains in string the name assigned to the next output.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OutputNamePacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/OutputNamePacket.html
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
fun outputNamePacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OutputNamePacket", arguments.toMutableList(), options)
}
