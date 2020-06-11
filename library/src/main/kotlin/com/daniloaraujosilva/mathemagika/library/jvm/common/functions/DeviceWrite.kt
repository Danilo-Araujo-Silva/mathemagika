package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeviceWrite
 *
 * Full name:        System`DeviceWrite
 *
 *                   DeviceWrite[device, val] writes the value val to the specified device.
 *                   DeviceWrite[device, {val , val , …}] writes the sequence of values val  to the specified device.
 *                                           1     2                                       i
 *                   DeviceWrite[device, param  val] writes val as the value of the parameter param.
 *                   DeviceWrite[device, {param   val , param   val , …}] writes values of several parameters.
 * Usage:                                      1      1       2      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeviceWrite
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeviceWrite.html
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
fun deviceWrite(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeviceWrite", arguments.toMutableList(), options)
}
