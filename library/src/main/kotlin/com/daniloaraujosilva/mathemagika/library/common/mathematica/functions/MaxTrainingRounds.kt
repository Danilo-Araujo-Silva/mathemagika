package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MaxTrainingRounds
 *
 * Full name:        System`MaxTrainingRounds
 *
 * Usage:            MaxTrainingRounds is an option for NetTrain and related functions that specifies the maximum number of rounds of training to do.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MaxTrainingRounds
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxTrainingRounds.html
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
fun maxTrainingRounds(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxTrainingRounds", arguments.toMutableList(), options)
}
