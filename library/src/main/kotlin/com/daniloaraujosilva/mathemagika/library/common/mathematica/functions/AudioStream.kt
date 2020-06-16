package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AudioStream
 *
 * Full name:        System`AudioStream
 *
 *                   AudioStream[source] creates a new AudioStream object from source.
 * Usage:            AudioStream[id] is an object that represents a unique audio stream.
 *
 *                   AudioChannelAssignment -> Inherited
 *                   AudioOutputDevice -> Inherited
 *                   Looping -> False
 *                   Method -> Automatic
 *                   SampleRate -> Automatic
 * Options:          SoundVolume -> Inherited
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioStream
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioStream.html
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
fun audioStream(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioStream", arguments.toMutableList(), options)
}
