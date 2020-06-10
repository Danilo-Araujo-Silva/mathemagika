package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PitchRecognize
 * 
 * Full name:        System`PitchRecognize
 * 
 *                   PitchRecognize[audio] recognizes the main pitch in audio, returning it as a TimeSeries object. 
 * Usage:            PitchRecognize[audio, spec] returns the main pitch processed according to the specified spec.
 * 
 *                   AcceptanceThreshold -> Automatic
 *                   Alignment -> Center
 *                   AllowedFrequencyRange -> Automatic
 *                   MetaInformation -> None
 *                   Method -> Automatic
 *                   MissingDataMethod -> None
 *                   PartitionGranularity -> Automatic
 *                   PerformanceGoal -> Speed
 * Options:          ResamplingMethod -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PitchRecognize
 * Documentation:    web: http://reference.wolfram.com/language/ref/PitchRecognize.html
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
fun pitchRecognize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PitchRecognize", arguments.toMutableList(), options)
}
