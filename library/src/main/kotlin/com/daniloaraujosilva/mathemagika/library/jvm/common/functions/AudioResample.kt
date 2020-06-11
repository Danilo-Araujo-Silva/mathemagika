package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioResample
 *
 * Full name:        System`AudioResample
 *
 * Usage:            AudioResample[audio, sr] resamples audio to have the sample rate of sr.
 *
 *                   Antialiasing -> True
 *                   Padding -> Automatic
 * Options:          Resampling -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AudioResample
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioResample.html
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
fun audioResample(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioResample", arguments.toMutableList(), options)
}
