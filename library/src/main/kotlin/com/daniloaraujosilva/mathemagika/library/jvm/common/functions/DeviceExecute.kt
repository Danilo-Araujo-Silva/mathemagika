package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeviceExecute
 *
 * Full name:        System`DeviceExecute
 *
 *                   DeviceExecute[device, "command"] executes the specified command on a device.
 * Usage:            DeviceExecute[device, "command", params] executes the command with the parameters params.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeviceExecute
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeviceExecute.html
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
fun deviceExecute(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeviceExecute", arguments.toMutableList(), options)
}
