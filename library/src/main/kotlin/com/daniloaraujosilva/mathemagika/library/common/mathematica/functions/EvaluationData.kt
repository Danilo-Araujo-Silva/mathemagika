package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EvaluationData
 *
 * Full name:        System`EvaluationData
 *
 * Usage:            EvaluationData[expr] gives an association containing the result of evaluating expr and metadata about the process of doing so.
 *
 * Options:          None
 *
 *                   HoldAllComplete
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EvaluationData
 * Documentation:    web: http://reference.wolfram.com/language/ref/EvaluationData.html
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
fun evaluationData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EvaluationData", arguments.toMutableList(), options)
}
