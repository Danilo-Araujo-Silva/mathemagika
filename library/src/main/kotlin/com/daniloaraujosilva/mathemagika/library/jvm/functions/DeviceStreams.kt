package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeviceStreams
 *
 * Full name:        System`DeviceStreams
 *
 *                   DeviceStreams[device] gives a list of all open streams associated with a device.
 *                   DeviceStreams[device, patt] gives a list of streams whose names match the string pattern patt.
 *                   DeviceStreams[device, {patt , patt , …}] gives a list of streams whose names match any of the patt .
 * Usage:                                       1      2                                                               i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeviceStreams
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeviceStreams.html
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
fun deviceStreams(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeviceStreams", arguments.toMutableList(), options)
}
