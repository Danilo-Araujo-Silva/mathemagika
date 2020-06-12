package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DownArrow
 *
 * Full name:        System`DownArrow
 *
 * Usage:            DownArrow[x, y, …] displays as x ↓ y ↓ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DownArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/DownArrow.html
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
fun downArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DownArrow", arguments.toMutableList(), options)
}
