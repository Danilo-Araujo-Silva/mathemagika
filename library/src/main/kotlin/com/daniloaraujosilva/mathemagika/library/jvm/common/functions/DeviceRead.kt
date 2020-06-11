package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeviceRead
 *
 * Full name:        System`DeviceRead
 *
 *                   DeviceRead[devobj] reads a single default item from the open device corresponding to the specified DeviceObject.
 *                   DeviceRead["devclass"] reads from the default device in the class "devclass".
 *                   DeviceRead[device, param] reads the parameter param from the specified device.
 *                   DeviceRead[device, {param , param , …}] reads the list of parameters param  from the specified device.
 * Usage:                                     1       2                                        i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeviceRead
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeviceRead.html
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
fun deviceRead(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeviceRead", arguments.toMutableList(), options)
}
