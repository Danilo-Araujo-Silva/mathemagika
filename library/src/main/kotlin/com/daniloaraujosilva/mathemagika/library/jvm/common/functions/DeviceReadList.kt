package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeviceReadList
 *
 * Full name:        System`DeviceReadList
 *
 *                   DeviceReadList[device, n] reads from the specified device n times, returning a list of the results.
 *                   DeviceReadList[device, n, param] reads the parameter param.
 *                   DeviceReadList[device, n, {param , param , …}] reads the list of parameters param .
 * Usage:                                            1       2                                        i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeviceReadList
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeviceReadList.html
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
fun deviceReadList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeviceReadList", arguments.toMutableList(), options)
}
