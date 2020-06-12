package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SelectedNotebook
 *
 * Full name:        System`SelectedNotebook
 *
 * Usage:            SelectedNotebook[] gives the currently selected notebook in the front end.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SelectedNotebook
 * Documentation:    web: http://reference.wolfram.com/language/ref/SelectedNotebook.html
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
fun selectedNotebook(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SelectedNotebook", arguments.toMutableList(), options)
}
