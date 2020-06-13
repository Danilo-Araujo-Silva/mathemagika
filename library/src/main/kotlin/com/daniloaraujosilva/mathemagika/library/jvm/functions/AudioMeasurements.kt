package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AudioMeasurements
 *
 * Full name:        System`AudioMeasurements
 *
 *                   AudioMeasurements[audio, "prop"] computes the property "prop" for the entire audio.
 *                   AudioMeasurements[audio, {prop , prop , …}] computes several properties "prop ".
 *                                                 1      2                                       i
 *                   AudioMeasurements[audio, "prop", format] returns the values in the specified output format.
 *                   AudioMeasurements[{audio , audio , …}, …] returns measurements for all audio .
 * Usage:                                    1       2                                           i
 *
 * Options:          FourierParameters -> {-1, 1}
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AudioMeasurements
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioMeasurements.html
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
fun audioMeasurements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioMeasurements", arguments.toMutableList(), options)
}
