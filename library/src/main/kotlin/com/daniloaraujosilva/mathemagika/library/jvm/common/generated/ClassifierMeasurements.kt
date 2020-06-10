package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ClassifierMeasurements
 * 
 * Full name:        System`ClassifierMeasurements
 * 
 *                   ClassifierMeasurements[classifier, testset, prop] gives measurements associated with property prop when classifier is evaluated on testset.
 *                   ClassifierMeasurements[…, {prop , prop , …}] gives properties prop , prop , etc.
 *                                                  1      2                           1      2
 * Usage:            ClassifierMeasurements[classifier, testset] yields a ClassifierMeasurementsObject[…] that can be applied to any property.
 * 
 *                   ClassPriors -> Automatic
 *                   ComputeUncertainty -> False
 *                   IndeterminateThreshold -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   RandomSeeding -> 1234
 *                   TargetDevice -> CPU
 *                   TieBreakerFunction -> RandomChoice
 *                   UtilityFunction -> Automatic
 * Options:          Weights -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ClassifierMeasurements
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClassifierMeasurements.html
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
fun classifierMeasurements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClassifierMeasurements", arguments.toMutableList(), options)
}
