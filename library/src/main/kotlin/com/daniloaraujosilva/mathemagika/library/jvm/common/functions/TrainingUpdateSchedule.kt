package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TrainingUpdateSchedule
 *
 * Full name:        System`TrainingUpdateSchedule
 *
 * Usage:            TrainingUpdateSchedule is an option for NetTrain that specifies which arrays of the network can be updated at each step of the optimization process.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TrainingUpdateSchedule
 * Documentation:    web: http://reference.wolfram.com/language/ref/TrainingUpdateSchedule.html
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
fun trainingUpdateSchedule(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TrainingUpdateSchedule", arguments.toMutableList(), options)
}
