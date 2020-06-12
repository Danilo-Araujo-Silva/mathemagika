package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TrainingProgressReporting
 *
 * Full name:        System`TrainingProgressReporting
 *
 * Usage:            TrainingProgressReporting is an option for NetTrain and related functions that specifies how to report the progress of training.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TrainingProgressReporting
 * Documentation:    web: http://reference.wolfram.com/language/ref/TrainingProgressReporting.html
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
fun trainingProgressReporting(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TrainingProgressReporting", arguments.toMutableList(), options)
}
