package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EvaluationNotebook
 *
 * Full name:        System`EvaluationNotebook
 *
 * Usage:            EvaluationNotebook[] gives the notebook in which this function is being evaluated.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EvaluationNotebook
 * Documentation:    web: http://reference.wolfram.com/language/ref/EvaluationNotebook.html
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
fun evaluationNotebook(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EvaluationNotebook", arguments.toMutableList(), options)
}
