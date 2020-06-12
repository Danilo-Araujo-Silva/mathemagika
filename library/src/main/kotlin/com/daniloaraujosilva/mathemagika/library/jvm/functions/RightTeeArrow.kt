package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RightTeeArrow
 *
 * Full name:        System`RightTeeArrow
 *
 * Usage:            RightTeeArrow[x, y, …] displays as x ↦ y ↦ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightTeeArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightTeeArrow.html
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
fun rightTeeArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightTeeArrow", arguments.toMutableList(), options)
}
