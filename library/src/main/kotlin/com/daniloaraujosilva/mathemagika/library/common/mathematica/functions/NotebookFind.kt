package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookFind
 *
 * Full name:        System`NotebookFind
 *
 *                   NotebookFind[obj, data] sets the current selection in the specified notebook object to be the next occurrence of data.
 *                   NotebookFind[obj, data, Previous] sets the current selection to be the previous occurrence.
 *                   NotebookFind[obj, data, All] sets the current selection to be all occurrences.
 * Usage:            NotebookFind[obj, data, dir, elems] sets the current selection to be the occurrence in the direction dir and searches the elements of cells specified by elems.
 *
 *                   AutoScroll -> True
 *                   IgnoreCase -> False
 *                   WordSearch -> False
 * Options:          WrapAround -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookFind
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookFind.html
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
fun notebookFind(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookFind", arguments.toMutableList(), options)
}
