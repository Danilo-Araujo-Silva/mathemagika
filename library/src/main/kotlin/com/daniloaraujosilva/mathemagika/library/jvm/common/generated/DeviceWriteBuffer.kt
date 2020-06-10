package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DeviceWriteBuffer
 * 
 * Full name:        System`DeviceWriteBuffer
 * 
 *                   DeviceWriteBuffer[device, vals] fills the buffer on a device with the values vals.
 *                   DeviceWriteBuffer[device, param  vals] fills the buffer associated with the parameter param with the values vals.
 *                   DeviceWriteBuffer[device, {param   vals , param   vals , …}] fills the buffers associated with the param  with the corresponding values vals  .
 * Usage:                                            1       1       2       2                                                 i                                   i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DeviceWriteBuffer
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeviceWriteBuffer.html
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
fun deviceWriteBuffer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeviceWriteBuffer", arguments.toMutableList(), options)
}
