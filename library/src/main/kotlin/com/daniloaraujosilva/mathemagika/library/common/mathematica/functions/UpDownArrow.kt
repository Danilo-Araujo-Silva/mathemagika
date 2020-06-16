package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             UpDownArrow
 *
 * Full name:        System`UpDownArrow
 *
 * Usage:            UpDownArrow[x, y, …] displays as x ↕ y ↕ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/UpDownArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpDownArrow.html
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
fun upDownArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpDownArrow", arguments.toMutableList(), options)
}
