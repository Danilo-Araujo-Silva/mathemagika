package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LeftArrowRightArrow
 *
 * Full name:        System`LeftArrowRightArrow
 *
 * Usage:            LeftArrowRightArrow[x, y, …] displays as x ⇆ y ⇆ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftArrowRightArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftArrowRightArrow.html
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
fun leftArrowRightArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftArrowRightArrow", arguments.toMutableList(), options)
}
