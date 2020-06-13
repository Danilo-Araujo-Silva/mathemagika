package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ClassifierMeasurementsObject
 *
 * Full name:        System`ClassifierMeasurementsObject
 *
 * Usage:            ClassifierMeasurementsObject[…] represents an object generated by ClassifierMeasurements that can be applied to properties.
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
 *                   local: paclet:ref/ClassifierMeasurementsObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClassifierMeasurementsObject.html
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
fun classifierMeasurementsObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClassifierMeasurementsObject", arguments.toMutableList(), options)
}