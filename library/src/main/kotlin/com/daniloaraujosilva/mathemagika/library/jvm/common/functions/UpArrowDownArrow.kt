package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UpArrowDownArrow
 *
 * Full name:        System`UpArrowDownArrow
 *
 * Usage:            UpArrowDownArrow[x, y, …] displays as x ⇅ y ⇅ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/UpArrowDownArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpArrowDownArrow.html
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
fun upArrowDownArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpArrowDownArrow", arguments.toMutableList(), options)
}
