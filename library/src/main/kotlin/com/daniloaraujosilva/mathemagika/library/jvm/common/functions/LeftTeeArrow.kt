package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LeftTeeArrow
 *
 * Full name:        System`LeftTeeArrow
 *
 * Usage:            LeftTeeArrow[x, y, …] displays as x ↤ y ↤ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftTeeArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftTeeArrow.html
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
fun leftTeeArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftTeeArrow", arguments.toMutableList(), options)
}
