package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DeviceReadLatest
 *
 * Full name:        System`DeviceReadLatest
 *
 *                   DeviceReadLatest[device] returns the most recently collected default item from a device.
 *                   DeviceReadLatest[device, n] returns a list of the n most recently collected items.
 *                   DeviceReadLatest[device, n, param] returns the n most recently collected values of param.
 *                   DeviceReadLatest[device, n, {param , param , …}] returns a list of the most recently collected values of the param .
 * Usage:                                              1       2                                                                       i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeviceReadLatest
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeviceReadLatest.html
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
fun deviceReadLatest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeviceReadLatest", arguments.toMutableList(), options)
}
