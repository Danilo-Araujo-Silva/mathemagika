package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CenterDot
 *
 * Full name:        System`CenterDot
 *
 * Usage:            CenterDot[x, y, …] displays as x · y · ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/CenterDot
 * Documentation:    web: http://reference.wolfram.com/language/ref/CenterDot.html
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
fun centerDot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CenterDot", arguments.toMutableList(), options)
}
