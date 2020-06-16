package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WindowStatusArea
 *
 * Full name:        System`WindowStatusArea
 *
 * Usage:            WindowStatusArea is a notebook option that specifies what should appear in the status area in the frame of the window used to display the notebook.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WindowStatusArea
 * Documentation:    web: http://reference.wolfram.com/language/ref/WindowStatusArea.html
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
fun windowStatusArea(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WindowStatusArea", arguments.toMutableList(), options)
}
