package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DownTeeArrow
 *
 * Full name:        System`DownTeeArrow
 *
 * Usage:            DownTeeArrow[x, y, …] displays as x ↧ y ↧ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DownTeeArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/DownTeeArrow.html
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
fun downTeeArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DownTeeArrow", arguments.toMutableList(), options)
}
