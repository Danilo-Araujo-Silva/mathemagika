package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LeftArrow
 *
 * Full name:        System`LeftArrow
 *
 * Usage:            LeftArrow[x, y, …] displays as x ← y ← ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftArrow.html
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
fun leftArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftArrow", arguments.toMutableList(), options)
}
