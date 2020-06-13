package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BeginDialogPacket
 *
 * Full name:        System`BeginDialogPacket
 *
 * Usage:            BeginDialogPacket[integer] is a WSTP packet that indicates the start of the Dialog subsession referenced by integer.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BeginDialogPacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/BeginDialogPacket.html
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
fun beginDialogPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BeginDialogPacket", arguments.toMutableList(), options)
}
