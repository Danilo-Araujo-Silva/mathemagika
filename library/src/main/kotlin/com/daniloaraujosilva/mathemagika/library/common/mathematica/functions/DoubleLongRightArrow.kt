package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DoubleLongRightArrow
 *
 * Full name:        System`DoubleLongRightArrow
 *
 * Usage:            DoubleLongRightArrow[x, y, …] displays as x ⟹ y ⟹ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DoubleLongRightArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/DoubleLongRightArrow.html
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
fun doubleLongRightArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DoubleLongRightArrow", arguments.toMutableList(), options)
}
