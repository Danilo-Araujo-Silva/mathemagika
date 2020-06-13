package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RemoveAudioStream
 *
 * Full name:        System`RemoveAudioStream
 *
 *                   RemoveAudioStream[] deletes all AudioStream objects.
 *                   RemoveAudioStream[stream] deletes the AudioStream object stream.
 * Usage:            RemoveAudioStream[audio] deletes all the AudioStream objects stemming from audio.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RemoveAudioStream
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoveAudioStream.html
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
fun removeAudioStream(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoveAudioStream", arguments.toMutableList(), options)
}
