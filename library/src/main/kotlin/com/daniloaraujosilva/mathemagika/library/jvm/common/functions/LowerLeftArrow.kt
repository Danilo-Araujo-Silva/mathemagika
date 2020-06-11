package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LowerLeftArrow
 *
 * Full name:        System`LowerLeftArrow
 *
 * Usage:            LowerLeftArrow[x, y, …] displays as x ↙ y ↙ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LowerLeftArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/LowerLeftArrow.html
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
fun lowerLeftArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LowerLeftArrow", arguments.toMutableList(), options)
}
