package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InputNamePacket
 *
 * Full name:        System`InputNamePacket
 *
 * Usage:            InputNamePacket[string] is a WSTP packet that contains in string the name to be assigned to the next input.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InputNamePacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/InputNamePacket.html
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
fun inputNamePacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InputNamePacket", arguments.toMutableList(), options)
}
