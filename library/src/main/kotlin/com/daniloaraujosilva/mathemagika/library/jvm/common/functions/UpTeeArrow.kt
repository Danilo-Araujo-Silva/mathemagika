package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UpTeeArrow
 *
 * Full name:        System`UpTeeArrow
 *
 * Usage:            UpTeeArrow[x, y, …] displays as x ↥ y ↥ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/UpTeeArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpTeeArrow.html
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
fun upTeeArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpTeeArrow", arguments.toMutableList(), options)
}
