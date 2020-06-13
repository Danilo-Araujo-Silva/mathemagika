package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PredictorMeasurements
 *
 * Full name:        System`PredictorMeasurements
 *
 *                   PredictorMeasurements[predictor, testset, prop] gives measurements associated with the property prop when predictor is evaluated on testset.
 *                   PredictorMeasurements[…, {prop , prop , …}] gives properties prop , prop , etc.
 *                                                 1      2                           1      2
 * Usage:            PredictorMeasurements[predictor, testset] yields a PredictorMeasurementsObject[…] that can be applied to any property.
 *
 *                   ComputeUncertainty -> False
 *                   IndeterminateThreshold -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   RandomSeeding -> 1234
 *                   TargetDevice -> CPU
 *                   UtilityFunction -> Automatic
 *                   ValuePriors -> Automatic
 * Options:          Weights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PredictorMeasurements
 * Documentation:    web: http://reference.wolfram.com/language/ref/PredictorMeasurements.html
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
fun predictorMeasurements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PredictorMeasurements", arguments.toMutableList(), options)
}
