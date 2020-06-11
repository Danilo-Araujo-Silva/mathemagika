package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ShowSelection
 *
 * Full name:        System`ShowSelection
 *
 * Usage:            ShowSelection is an option to Notebook, Cell, and Style that specifies whether to show the current selection highlighted.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ShowSelection
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShowSelection.html
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
fun showSelection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShowSelection", arguments.toMutableList(), options)
}
