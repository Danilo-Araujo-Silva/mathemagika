package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioSplit
 *
 * Full name:        System`AudioSplit
 *
 *                   AudioSplit[audio, t] splits audio at time t.
 *                   AudioSplit[audio, {t , t , …}] splits audio at times t .
 * Usage:                                1   2                             i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioSplit
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioSplit.html
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
fun audioSplit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioSplit", arguments.toMutableList(), options)
}
