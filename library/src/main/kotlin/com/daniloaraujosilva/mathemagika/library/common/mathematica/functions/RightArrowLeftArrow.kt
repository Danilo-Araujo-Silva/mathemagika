package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RightArrowLeftArrow
 *
 * Full name:        System`RightArrowLeftArrow
 *
 * Usage:            RightArrowLeftArrow[x, y, …] displays as x ⇄ y ⇄ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightArrowLeftArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightArrowLeftArrow.html
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
fun rightArrowLeftArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightArrowLeftArrow", arguments.toMutableList(), options)
}
