package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AudioPitchShift
 * 
 * Full name:        System`AudioPitchShift
 * 
 * Usage:            AudioPitchShift[audio, r] applies pitch shifting to audio by the ratio r, shifting every frequency f to r f.
 * 
 *                   Method -> Automatic
 * Options:          PartitionGranularity -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AudioPitchShift
 * Documentation:    web: http://reference.wolfram.com/language/ref/AudioPitchShift.html
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
fun audioPitchShift(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AudioPitchShift", arguments.toMutableList(), options)
}
