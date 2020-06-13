package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AudioNormalize
 *
 * Full name:        System`AudioNormalize
 *
 *                   AudioNormalize[audio] normalizes audio so that the maximum absolute value of its samples is 1.
 * Usage:            AudioNormalize[audio, model] normalizes the audio signal based on the specified model.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AudioNormalize
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioNormalize.html
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
fun audioNormalize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioNormalize", arguments.toMutableList(), options)
}
