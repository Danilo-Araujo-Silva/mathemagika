package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioPlay
 *
 * Full name:        System`AudioPlay
 *
 *                   AudioPlay[audio] returns a new AudioStream object from audio and starts the playback.
 * Usage:            AudioPlay[astream] starts playing an AudioStream object astream.
 *
 *                   Looping -> Automatic
 * Options:          MaxDuration -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioPlay
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioPlay.html
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
fun audioPlay(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioPlay", arguments.toMutableList(), options)
}
