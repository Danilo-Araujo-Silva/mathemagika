package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AudioDevice
 *
 * Full name:        System`AudioDevice
 *
 * Usage:            AudioDevice is an option for Audio and related functions that specifies the device to use for playback.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AudioDevice
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioDevice.html
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
fun audioDevice(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioDevice", arguments.toMutableList(), options)
}
