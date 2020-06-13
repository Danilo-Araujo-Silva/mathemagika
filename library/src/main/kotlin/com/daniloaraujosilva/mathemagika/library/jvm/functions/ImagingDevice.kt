package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImagingDevice
 *
 * Full name:        System`ImagingDevice
 *
 * Usage:            ImagingDevice is an option to specify what device to use for capturing images.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImagingDevice
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImagingDevice.html
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
fun imagingDevice(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImagingDevice", arguments.toMutableList(), options)
}
