package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TrainingProgressMeasurements
 *
 * Full name:        System`TrainingProgressMeasurements
 *
 * Usage:            TrainingProgressMeasurements is an option for NetTrain that specifies measurements to make while training is in progress.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TrainingProgressMeasurements
 * Documentation:    web: http://reference.wolfram.com/language/ref/TrainingProgressMeasurements.html
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
fun trainingProgressMeasurements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TrainingProgressMeasurements", arguments.toMutableList(), options)
}
