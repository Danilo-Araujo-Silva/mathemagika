package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindDevices
 *
 * Full name:        System`FindDevices
 *
 *                   FindDevices[] searches for available devices on your computer system.
 *                   FindDevices[form] gives a list of devices in classes whose names match the string pattern form.
 *                   FindDevices[{form , form , …}] gives a list of devices in classes whose names match any of the form .
 *                                    1      2                                                                          i
 * Usage:            FindDevices[forms, n] returns at most n devices.
 *
 * Options:          IgnoreCase -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindDevices
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindDevices.html
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
fun findDevices(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindDevices", arguments.toMutableList(), options)
}
