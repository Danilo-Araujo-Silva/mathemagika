package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DisplayPacket
 *
 * Full name:        System`DisplayPacket
 *
 * Usage:            DisplayPacket[] is a WSTP packet that indicates the beginning of a series of expressions related to a PostScript graphic.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DisplayPacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/DisplayPacket.html
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
fun displayPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DisplayPacket", arguments.toMutableList(), options)
}
