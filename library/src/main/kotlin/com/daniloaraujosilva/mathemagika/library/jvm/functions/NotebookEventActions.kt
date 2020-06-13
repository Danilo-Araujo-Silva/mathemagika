package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookEventActions
 *
 * Full name:        System`NotebookEventActions
 *
 * Usage:            NotebookEventActions is a notebook option that gives a list of actions to perform when specified events occur in connection with the notebook.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NotebookEventActions
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookEventActions.html
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
fun notebookEventActions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookEventActions", arguments.toMutableList(), options)
}
