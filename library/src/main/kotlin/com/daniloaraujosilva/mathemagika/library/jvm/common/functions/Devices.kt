package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Devices
 *
 * Full name:        System`Devices
 *
 *                   Devices[] gives a list of registered devices on a particular system.
 *                   Devices[form] gives a list of devices in classes whose names match the string pattern form.
 *                   Devices[{form , form , …}] gives a list of devices in classes whose names match any of the form .
 * Usage:                         1      2                                                                          i
 *
 * Options:          IgnoreCase -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Devices
 * Documentation:    web: http://reference.wolfram.com/language/ref/Devices.html
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
fun devices(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Devices", arguments.toMutableList(), options)
}
