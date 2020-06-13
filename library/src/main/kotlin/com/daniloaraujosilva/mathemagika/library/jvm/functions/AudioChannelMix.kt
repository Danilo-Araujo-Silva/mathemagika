package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AudioChannelMix
 *
 * Full name:        System`AudioChannelMix
 *
 *                   AudioChannelMix[audio] mixes channels of audio by averaging and returns a center-panned stereo audio object.
 * Usage:            AudioChannelMix[audio, desttype] mixes audio channels into the specified desttype.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioChannelMix
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioChannelMix.html
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
fun audioChannelMix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioChannelMix", arguments.toMutableList(), options)
}
