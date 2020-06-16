package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LearningRate
 *
 * Full name:        System`LearningRate
 *
 * Usage:            LearningRate is an option for NetTrain that specifies the rate at which to adjust neural net weights in order to minimize the training loss.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LearningRate
 * Documentation:    web: http://reference.wolfram.com/language/ref/LearningRate.html
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
fun learningRate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LearningRate", arguments.toMutableList(), options)
}
