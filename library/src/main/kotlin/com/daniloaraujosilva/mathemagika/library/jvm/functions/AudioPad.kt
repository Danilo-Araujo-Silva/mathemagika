package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AudioPad
 *
 * Full name:        System`AudioPad
 *
 *                   AudioPad[audio, t] adds t seconds of silence to the end of audio.
 *                   AudioPad[audio, {t , t }] adds t  seconds of silence to the beginning and t  seconds to the end of audio.
 *                                     1   2         1                                          2
 * Usage:            AudioPad[audio, tspec, padding] pads using the value or method specified by padding.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AudioPad
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioPad.html
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
fun audioPad(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioPad", arguments.toMutableList(), options)
}
