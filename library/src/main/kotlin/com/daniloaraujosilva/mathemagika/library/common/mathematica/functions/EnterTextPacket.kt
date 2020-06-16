package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EnterTextPacket
 *
 * Full name:        System`EnterTextPacket
 *
 * Usage:            EnterTextPacket[string] is a WSTP packet that requests the parsing and evaluation of string as an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EnterTextPacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/EnterTextPacket.html
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
fun enterTextPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EnterTextPacket", arguments.toMutableList(), options)
}
