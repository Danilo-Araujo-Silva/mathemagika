package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AnomalyDetectorFunction
 *
 * Full name:        System`AnomalyDetectorFunction
 *
 * Usage:            AnomalyDetectorFunction[…] represents a function generated by AnomalyDetection for detecting whether data is anomalous or not.
 *
 *                   AcceptanceThreshold -> Automatic
 *                   BatchProcessing -> Automatic
 *                   PerformanceGoal -> Automatic
 * Options:          RandomSeeding -> Inherited
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AnomalyDetectorFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnomalyDetectorFunction.html
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
fun anomalyDetectorFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnomalyDetectorFunction", arguments.toMutableList(), options)
}
