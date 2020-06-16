package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AudioAmplify
 *
 * Full name:        System`AudioAmplify
 *
 * Usage:            AudioAmplify[audio, s] multiplies all samples of audio by a factor s.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AudioAmplify
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioAmplify.html
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
fun audioAmplify(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioAmplify", arguments.toMutableList(), options)
}
