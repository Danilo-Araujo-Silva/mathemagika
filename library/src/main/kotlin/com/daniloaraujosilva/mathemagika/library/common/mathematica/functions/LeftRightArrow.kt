package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LeftRightArrow
 *
 * Full name:        System`LeftRightArrow
 *
 * Usage:            LeftRightArrow[x, y, …] displays as x ↔ y ↔ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftRightArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftRightArrow.html
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
fun leftRightArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftRightArrow", arguments.toMutableList(), options)
}
