package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioLoudness
 *
 * Full name:        System`AudioLoudness
 *
 *                   AudioLoudness[audio] computes the loudness of audio according to the EBU momentary definition.
 * Usage:            AudioLoudness[audio, def] computes the loudness according to the definition def.
 *
 *                   Alignment -> Center
 *                   MetaInformation -> None
 *                   Padding -> Automatic
 *                   PaddingSize -> Automatic
 * Options:          ResamplingMethod -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioLoudness
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioLoudness.html
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
fun audioLoudness(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioLoudness", arguments.toMutableList(), options)
}
