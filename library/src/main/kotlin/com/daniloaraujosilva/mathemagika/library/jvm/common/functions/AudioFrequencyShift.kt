package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioFrequencyShift
 *
 * Full name:        System`AudioFrequencyShift
 *
 *                   AudioFrequencyShift[audio, freq] gives audio by shifting the spectrum of audio by freq.
 * Usage:            AudioFrequencyShift[audio, freq, mix] uses mix to control the ratio between the original and shifted audio.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioFrequencyShift
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioFrequencyShift.html
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
fun audioFrequencyShift(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioFrequencyShift", arguments.toMutableList(), options)
}
