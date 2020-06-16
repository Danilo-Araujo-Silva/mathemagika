package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookPath
 *
 * Full name:        System`NotebookPath
 *
 * Usage:            NotebookPath is a global option that determines which directories are searched when a specified notebook is needed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NotebookPath
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookPath.html
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
fun notebookPath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookPath", arguments.toMutableList(), options)
}
