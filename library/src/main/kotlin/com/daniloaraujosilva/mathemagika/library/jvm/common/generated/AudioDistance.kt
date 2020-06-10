package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AudioDistance
 * 
 * Full name:        System`AudioDistance
 * 
 *                   AudioDistance[audio , audio ] returns a distance measure between audio  and audio .
 * Usage:                               1       2                                          1          2
 * 
 *                   DistanceFunction -> Automatic
 *                   Masking -> Automatic
 *                   PartitionGranularity -> Automatic
 * Options:          SampleRate -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AudioDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioDistance.html
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
fun audioDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioDistance", arguments.toMutableList(), options)
}
