package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EvaluationBox
 *
 * Full name:        System`EvaluationBox
 *
 * Usage:            EvaluationBox[] returns a BoxObject corresponding to the box structure in which this function is being evaluated.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EvaluationBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/EvaluationBox.html
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
fun evaluationBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EvaluationBox", arguments.toMutableList(), options)
}
