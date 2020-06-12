package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AudioPartition
 *
 * Full name:        System`AudioPartition
 *
 *                   AudioPartition[audio, dur] partitions an audio object into non-overlapping segments of duration dur.
 * Usage:            AudioPartition[audio, dur, offset] generates segments with specified offset.
 *
 * Options:          Padding -> 0
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AudioPartition
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioPartition.html
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
fun audioPartition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioPartition", arguments.toMutableList(), options)
}
