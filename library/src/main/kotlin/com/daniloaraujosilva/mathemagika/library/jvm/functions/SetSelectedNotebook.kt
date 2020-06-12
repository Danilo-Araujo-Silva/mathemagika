package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SetSelectedNotebook
 *
 * Full name:        System`SetSelectedNotebook
 *
 * Usage:            SetSelectedNotebook[obj] makes the notebook corresponding to obj be the currently selected one in the front end.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SetSelectedNotebook
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetSelectedNotebook.html
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
fun setSelectedNotebook(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetSelectedNotebook", arguments.toMutableList(), options)
}
