package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioInsert
 *
 * Full name:        System`AudioInsert
 *
 *                   AudioInsert[audio, t  new] inserts the audio signal new at time t.
 *                   AudioInsert[audio, {t , t , …}  new] inserts the same audio at multiple positions.
 *                                        1   2
 *                   AudioInsert[audio, {t   new , …}] inserts multiple audio signals at different positions.
 * Usage:                                 1      1
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioInsert
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioInsert.html
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
fun audioInsert(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioInsert", arguments.toMutableList(), options)
}
