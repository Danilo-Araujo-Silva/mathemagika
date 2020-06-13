package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AnomalyDetector
 *
 * Full name:        System`AnomalyDetector
 *
 * Usage:            AnomalyDetector is an option for functions such as Classify that specifies an anomaly detector for them to include.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AnomalyDetector
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnomalyDetector.html
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
fun anomalyDetector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnomalyDetector", arguments.toMutableList(), options)
}
