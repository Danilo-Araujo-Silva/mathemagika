package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SynthesizeMissingValues
 * 
 * Full name:        System`SynthesizeMissingValues
 * 
 *                   SynthesizeMissingValues[{example , example , …}] replaces missing values in each example by generated values.
 *                                                   1         2
 * Usage:            SynthesizeMissingValues[dist, data] uses the distribution dist to generate values.
 * 
 *                   FeatureExtractor -> Identity
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   FeatureWeights -> Automatic
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   MissingValuePattern -> _Missing | Indeterminate
 *                   PerformanceGoal -> Automatic
 *                   ProcessorCaching -> False
 *                   RandomSeeding -> Automatic
 *                   RecordLog -> True
 *                   TargetDevice -> CPU
 *                   TimeGoal -> Automatic
 *                   TrainingProgressReporting -> Automatic
 *                   ValidationSet -> Automatic
 * Options:          Weights -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SynthesizeMissingValues
 * Documentation:    web: http://reference.wolfram.com/language/ref/SynthesizeMissingValues.html
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
fun synthesizeMissingValues(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SynthesizeMissingValues", arguments.toMutableList(), options)
}
