package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UpperLeftArrow
 *
 * Full name:        System`UpperLeftArrow
 *
 * Usage:            UpperLeftArrow[x, y, …] displays as x ↖ y ↖ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/UpperLeftArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpperLeftArrow.html
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
fun upperLeftArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpperLeftArrow", arguments.toMutableList(), options)
}
