package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioPause
 *
 * Full name:        System`AudioPause
 *
 *                   AudioPause[] pauses the playback of all AudioStream objects.
 *                   AudioPause[astream] pauses the playback of the AudioStream object astream.
 * Usage:            AudioPause[audio] pauses the playback for all streams originated by audio.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioPause
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioPause.html
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
fun audioPause(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioPause", arguments.toMutableList(), options)
}
