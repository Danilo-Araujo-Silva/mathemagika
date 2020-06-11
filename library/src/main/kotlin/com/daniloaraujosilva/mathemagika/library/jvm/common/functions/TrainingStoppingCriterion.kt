package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TrainingStoppingCriterion
 *
 * Full name:        System`TrainingStoppingCriterion
 *
 * Usage:            TrainingStoppingCriterion is an option for NetTrain that specifies a criterion for stopping training early in order to prevent overfitting.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TrainingStoppingCriterion
 * Documentation:    web: http://reference.wolfram.com/language/ref/TrainingStoppingCriterion.html
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
fun trainingStoppingCriterion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TrainingStoppingCriterion", arguments.toMutableList(), options)
}
