package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             UpperRightArrow
 *
 * Full name:        System`UpperRightArrow
 *
 * Usage:            UpperRightArrow[x, y, …] displays as x ↗ y ↗ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/UpperRightArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpperRightArrow.html
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
fun upperRightArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpperRightArrow", arguments.toMutableList(), options)
}
