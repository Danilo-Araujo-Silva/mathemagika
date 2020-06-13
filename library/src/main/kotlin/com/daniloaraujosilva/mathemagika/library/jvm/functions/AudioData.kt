package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AudioData
 *
 * Full name:        System`AudioData
 *
 *                   AudioData[audio] gives an array of audio samples.
 * Usage:            AudioData[audio, "type"] gives an array of audio samples converted to the specified "type".
 *
 * Options:          Interleaving -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AudioData
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioData.html
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
fun audioData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioData", arguments.toMutableList(), options)
}
