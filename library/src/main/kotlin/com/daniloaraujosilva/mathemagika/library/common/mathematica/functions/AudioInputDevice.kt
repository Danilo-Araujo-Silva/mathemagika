package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AudioInputDevice
 *
 * Full name:        System`AudioInputDevice
 *
 * Usage:            AudioInputDevice is an option for AudioCapture that specifies the device to use for audio recording.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioInputDevice
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioInputDevice.html
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
fun audioInputDevice(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioInputDevice", arguments.toMutableList(), options)
}
