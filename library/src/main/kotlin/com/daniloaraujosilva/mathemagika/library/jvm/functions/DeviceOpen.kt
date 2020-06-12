package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeviceOpen
 *
 * Full name:        System`DeviceOpen
 *
 *                   DeviceOpen["devclass"] opens a connection to the first available device in the class specified by "devclass".
 *                   DeviceOpen["devclass", spec] opens a connection to the particular device defined by spec.
 * Usage:            DeviceOpen[device] opens a connection to an existing device specified by a DeviceObject.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeviceOpen
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeviceOpen.html
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
fun deviceOpen(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeviceOpen", arguments.toMutableList(), options)
}
