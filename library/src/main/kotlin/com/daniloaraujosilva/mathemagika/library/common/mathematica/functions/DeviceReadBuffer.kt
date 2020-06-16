package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DeviceReadBuffer
 *
 * Full name:        System`DeviceReadBuffer
 *
 *                   DeviceReadBuffer[device] reads the complete contents of the buffer on a device.
 *                   DeviceReadBuffer[device, n] reads n elements from the buffer.
 *                   DeviceReadBuffer[device, crit] reads elements from the buffer until the device-specific criterion crit is met.
 *                   DeviceReadBuffer[device, crit, param] reads elements associated with the parameter param.
 *                   DeviceReadBuffer[device, crit, {param , param , …}] reads elements associated with the param .
 * Usage:                                                 1       2                                              i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeviceReadBuffer
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeviceReadBuffer.html
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
fun deviceReadBuffer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeviceReadBuffer", arguments.toMutableList(), options)
}
