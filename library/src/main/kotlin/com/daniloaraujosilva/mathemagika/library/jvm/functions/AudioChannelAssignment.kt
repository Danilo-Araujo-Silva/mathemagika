package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AudioChannelAssignment
 *
 * Full name:        System`AudioChannelAssignment
 *
 * Usage:            AudioChannelAssignment is an option for Audio and related functions that specifies a mapping from audio channels to available speakers of the output audio device.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AudioChannelAssignment
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioChannelAssignment.html
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
fun audioChannelAssignment(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioChannelAssignment", arguments.toMutableList(), options)
}
