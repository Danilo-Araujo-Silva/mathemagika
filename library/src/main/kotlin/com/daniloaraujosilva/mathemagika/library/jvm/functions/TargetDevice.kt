package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TargetDevice
 *
 * Full name:        System`TargetDevice
 *
 * Usage:            TargetDevice is an option for certain functions that specifies whether CPU or GPU computation should be attempted.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TargetDevice
 * Documentation:    web: http://reference.wolfram.com/language/ref/TargetDevice.html
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
fun targetDevice(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TargetDevice", arguments.toMutableList(), options)
}
