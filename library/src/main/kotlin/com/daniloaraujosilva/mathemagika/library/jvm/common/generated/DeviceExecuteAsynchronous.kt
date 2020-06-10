package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DeviceExecuteAsynchronous
 * 
 * Full name:        System`DeviceExecuteAsynchronous
 * 
 *                   DeviceExecuteAsynchronous[device, "command", fun] initiates asynchronous execution of the specified command on a device, calling the handler function fun when an event occurs.
 * Usage:            DeviceExecuteAsynchronous[device, "command", params, fun] executes the command with the parameters params.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DeviceExecuteAsynchronous
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeviceExecuteAsynchronous.html
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
fun deviceExecuteAsynchronous(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeviceExecuteAsynchronous", arguments.toMutableList(), options)
}
