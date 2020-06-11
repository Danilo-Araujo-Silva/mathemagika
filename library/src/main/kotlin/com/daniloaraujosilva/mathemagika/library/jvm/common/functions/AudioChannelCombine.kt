package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioChannelCombine
 *
 * Full name:        System`AudioChannelCombine
 *
 *                   AudioChannelCombine[{audio , audio , …}] creates a multichannel audio object by combining the sequence of channels in audio .
 * Usage:                                      1       2                                                                                        i
 *
 * Options:          SampleRate -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AudioChannelCombine
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioChannelCombine.html
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
fun audioChannelCombine(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioChannelCombine", arguments.toMutableList(), options)
}
