package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AudioStreams
 *
 * Full name:        System`AudioStreams
 *
 *                   AudioStreams[] returns all existing streams.
 *                   AudioStreams[audio] returns all existing streams that originated from audio.
 * Usage:            AudioStreams[audio, "prop"] returns "prop" for all streams that originated from audio.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioStreams
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioStreams.html
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
fun audioStreams(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioStreams", arguments.toMutableList(), options)
}
