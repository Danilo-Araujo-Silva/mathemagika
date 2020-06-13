package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookDelete
 *
 * Full name:        System`NotebookDelete
 *
 *                   NotebookDelete[notebook] deletes the current selection in the notebook corresponding to the specified notebook object.
 *                   NotebookDelete[obj] deletes the given cell or box object.
 *                   NotebookDelete[{obj , obj , …}] deletes all specified objects.
 *                                      1     2
 * Usage:            NotebookDelete[] deletes the current selection in the current evaluation notebook.
 *
 * Options:          AutoScroll -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookDelete
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookDelete.html
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
fun notebookDelete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookDelete", arguments.toMutableList(), options)
}
