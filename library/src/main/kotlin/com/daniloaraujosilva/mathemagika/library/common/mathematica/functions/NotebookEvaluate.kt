package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookEvaluate
 *
 * Full name:        System`NotebookEvaluate
 *
 * Usage:            NotebookEvaluate[notebook] evaluates all the evaluatable cells in notebook.
 *
 *                   EvaluationElements -> All
 * Options:          InsertResults -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookEvaluate
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookEvaluate.html
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
fun notebookEvaluate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookEvaluate", arguments.toMutableList(), options)
}
