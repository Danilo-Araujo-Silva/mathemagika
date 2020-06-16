package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LessSlantEqual
 *
 * Full name:        System`LessSlantEqual
 *
 * Usage:            LessSlantEqual[x, y, …] displays as x ⩽ y ⩽ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LessSlantEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/LessSlantEqual.html
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
fun lessSlantEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LessSlantEqual", arguments.toMutableList(), options)
}
