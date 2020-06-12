package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LinkWriteHeld
 *
 * Full name:        System`LinkWriteHeld
 *
 * Usage:            LinkWriteHeld[link, Hold[expr], (flush : True)] writes expr (without the Hold) via WSTP to link (synchronizing unless flush is False).
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun linkWriteHeld(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinkWriteHeld", arguments.toMutableList(), options)
}
