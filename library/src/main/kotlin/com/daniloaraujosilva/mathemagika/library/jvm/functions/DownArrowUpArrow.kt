package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DownArrowUpArrow
 *
 * Full name:        System`DownArrowUpArrow
 *
 * Usage:            DownArrowUpArrow[x, y, …] displays as x ⇵ y ⇵ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DownArrowUpArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/DownArrowUpArrow.html
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
fun downArrowUpArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DownArrowUpArrow", arguments.toMutableList(), options)
}
