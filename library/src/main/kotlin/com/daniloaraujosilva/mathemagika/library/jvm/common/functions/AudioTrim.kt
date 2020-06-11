package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioTrim
 *
 * Full name:        System`AudioTrim
 *
 *                   AudioTrim[audio] trims silence from the beginning and end of audio.
 *                   AudioTrim[audio, t] returns the first t seconds of audio.
 *                   AudioTrim[audio, -t] returns the last t seconds of audio.
 *                   AudioTrim[audio, {t , t }] returns audio starting at time t  and ending at time t  of audio.
 *                                      1   2                                   1                     2
 *                   AudioTrim[audio, {{t  , t  }, …}] returns a list of audio for all given intervals {t  , t  }.
 * Usage:                                11   12                                                         i1   i2
 *
 * Options:          Padding -> None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AudioTrim
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioTrim.html
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
fun audioTrim(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioTrim", arguments.toMutableList(), options)
}
