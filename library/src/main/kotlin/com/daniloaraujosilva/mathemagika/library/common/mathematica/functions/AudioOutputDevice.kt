package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AudioOutputDevice
 *
 * Full name:        System`AudioOutputDevice
 *
 * Usage:            AudioOutputDevice is an option for Audio and related functions that specifies the device to use for playback.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AudioOutputDevice
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioOutputDevice.html
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
fun audioOutputDevice(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioOutputDevice", arguments.toMutableList(), options)
}
