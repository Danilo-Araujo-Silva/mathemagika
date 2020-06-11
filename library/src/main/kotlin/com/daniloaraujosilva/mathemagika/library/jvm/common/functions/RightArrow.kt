package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RightArrow
 *
 * Full name:        System`RightArrow
 *
 * Usage:            RightArrow[x, y, …] displays as x → y → ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightArrow.html
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
fun rightArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightArrow", arguments.toMutableList(), options)
}
