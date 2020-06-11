package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LowerRightArrow
 *
 * Full name:        System`LowerRightArrow
 *
 * Usage:            LowerRightArrow[x, y, …] displays as x ↘ y ↘ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LowerRightArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/LowerRightArrow.html
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
fun lowerRightArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LowerRightArrow", arguments.toMutableList(), options)
}
