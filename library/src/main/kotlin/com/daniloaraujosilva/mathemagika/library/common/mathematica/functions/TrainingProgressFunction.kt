package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TrainingProgressFunction
 *
 * Full name:        System`TrainingProgressFunction
 *
 * Usage:            TrainingProgressFunction is an option for NetTrain that specifies a function to run periodically during training.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TrainingProgressFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/TrainingProgressFunction.html
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
fun trainingProgressFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TrainingProgressFunction", arguments.toMutableList(), options)
}
