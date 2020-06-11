package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UpArrow
 *
 * Full name:        System`UpArrow
 *
 * Usage:            UpArrow[x, y, …] displays as x ↑ y ↑ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/UpArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpArrow.html
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
fun upArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpArrow", arguments.toMutableList(), options)
}
