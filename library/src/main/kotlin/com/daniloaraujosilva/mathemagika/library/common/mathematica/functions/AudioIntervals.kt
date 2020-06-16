package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AudioIntervals
 *
 * Full name:        System`AudioIntervals
 *
 *                   AudioIntervals[audio] returns audible intervals of audio.
 *                   AudioIntervals[audio, crit] returns intervals of audio for which the criterion crit is satisfied.
 * Usage:            AudioIntervals[audio, crit, mindur] returns only intervals larger than the given duration mindur.
 *
 *                   Alignment -> Automatic
 *                   FourierParameters -> {-1, 1}
 * Options:          PartitionGranularity -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AudioIntervals
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioIntervals.html
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
fun audioIntervals(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioIntervals", arguments.toMutableList(), options)
}
