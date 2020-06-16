package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StatusArea
 *
 * Full name:        System`StatusArea
 *
 * Usage:            StatusArea[expr, string] displays string in the status area of the current notebook when the mouse pointer is in the region where expr appears.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StatusArea
 * Documentation:    web: http://reference.wolfram.com/language/ref/StatusArea.html
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
fun statusArea(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StatusArea", arguments.toMutableList(), options)
}
