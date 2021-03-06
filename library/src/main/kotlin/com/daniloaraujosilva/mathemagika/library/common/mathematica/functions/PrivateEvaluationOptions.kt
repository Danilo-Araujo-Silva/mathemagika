package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PrivateEvaluationOptions
 *
 * Full name:        System`PrivateEvaluationOptions
 *
 * Usage:            PrivateEvaluationOptions is an option for selections that specifies settings for evaluation-related suboptions.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PrivateEvaluationOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrivateEvaluationOptions.html
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
fun privateEvaluationOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrivateEvaluationOptions", arguments.toMutableList(), options)
}
