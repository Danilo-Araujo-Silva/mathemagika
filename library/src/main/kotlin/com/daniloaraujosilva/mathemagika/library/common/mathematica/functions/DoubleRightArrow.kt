package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DoubleRightArrow
 *
 * Full name:        System`DoubleRightArrow
 *
 * Usage:            DoubleRightArrow[x, y, …] displays as x ⇒ y ⇒ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DoubleRightArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/DoubleRightArrow.html
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
fun doubleRightArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DoubleRightArrow", arguments.toMutableList(), options)
}
