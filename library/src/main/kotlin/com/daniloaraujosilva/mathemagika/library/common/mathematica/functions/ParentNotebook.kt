package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ParentNotebook
 *
 * Full name:        System`ParentNotebook
 *
 * Usage:            ParentNotebook[obj] returns the NotebookObject that contains obj.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ParentNotebook
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParentNotebook.html
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
fun parentNotebook(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParentNotebook", arguments.toMutableList(), options)
}
