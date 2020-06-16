package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookLocate
 *
 * Full name:        System`NotebookLocate
 *
 *                   NotebookLocate["tag"] locates all cells with the specified tag in your current input notebook, selecting the cells and scrolling to the position of the first one.
 * Usage:            NotebookLocate[{"file", "tag"}] if necessary opens the notebook stored in file, then locates cells with the specified tag.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookLocate
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookLocate.html
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
fun notebookLocate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookLocate", arguments.toMutableList(), options)
}
