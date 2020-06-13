package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AudioStop
 *
 * Full name:        System`AudioStop
 *
 *                   AudioStop[] stops the playback of all AudioStream objects.
 *                   AudioStop[astream] stops the playback of the AudioStream object astream.
 * Usage:            AudioStop[audio] stops the playback for all streams originated by audio.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioStop
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioStop.html
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
fun audioStop(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioStop", arguments.toMutableList(), options)
}
