package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PredictorInformation
 *
 * Full name:        System`PredictorInformation
 *
 *                   PredictorInformation[predictor] generates a report giving information on the predictor function predictor.
 * Usage:            PredictorInformation[predictor, prop] gives information for predictor associated with property prop.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PredictorInformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/PredictorInformation.html
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
fun predictorInformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PredictorInformation", arguments.toMutableList(), options)
}
