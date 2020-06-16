package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AudioSampleRate
 *
 * Full name:        System`AudioSampleRate
 *
 * Usage:            AudioSampleRate[audio] returns the sample rate of the Audio object audio.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioSampleRate
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioSampleRate.html
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
fun audioSampleRate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioSampleRate", arguments.toMutableList(), options)
}
