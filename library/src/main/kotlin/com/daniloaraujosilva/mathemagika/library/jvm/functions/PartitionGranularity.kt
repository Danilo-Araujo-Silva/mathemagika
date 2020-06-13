package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PartitionGranularity
 *
 * Full name:        System`PartitionGranularity
 *
 * Usage:            PartitionGranularity is an option for audio analysis functions that specifies the partitioning of the audio.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PartitionGranularity
 * Documentation:    web: http://reference.wolfram.com/language/ref/PartitionGranularity.html
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
fun partitionGranularity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PartitionGranularity", arguments.toMutableList(), options)
}
