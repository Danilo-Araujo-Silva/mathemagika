package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EndDialogPacket
 *
 * Full name:        System`EndDialogPacket
 *
 * Usage:            EndDialogPacket[integer] is a WSTP packet indicating the end of the Dialog subsession referenced by integer.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EndDialogPacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/EndDialogPacket.html
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
fun endDialogPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EndDialogPacket", arguments.toMutableList(), options)
}
