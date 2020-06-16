package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VerticalBar
 *
 * Full name:        System`VerticalBar
 *
 * Usage:            VerticalBar[x, y, …] displays as x  y  ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/VerticalBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/VerticalBar.html
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
fun verticalBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VerticalBar", arguments.toMutableList(), options)
}
