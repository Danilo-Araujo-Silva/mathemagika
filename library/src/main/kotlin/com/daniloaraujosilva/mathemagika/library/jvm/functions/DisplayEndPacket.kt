package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DisplayEndPacket
 *
 * Full name:        System`DisplayEndPacket
 *
 * Usage:            DisplayEndPacket[] is a WSTP packet that indicates the end of a series of expressions relating to a postscript graphic.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DisplayEndPacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/DisplayEndPacket.html
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
fun displayEndPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DisplayEndPacket", arguments.toMutableList(), options)
}
