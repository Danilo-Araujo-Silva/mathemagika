package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookDynamicExpression
 *
 * Full name:        System`NotebookDynamicExpression
 *
 * Usage:            NotebookDynamicExpression is an option for notebooks that specifies an expression to be dynamically updated whenever that notebook is visible.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NotebookDynamicExpression
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookDynamicExpression.html
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
fun notebookDynamicExpression(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookDynamicExpression", arguments.toMutableList(), options)
}
