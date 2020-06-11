package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DoubleLongLeftRightArrow
 *
 * Full name:        System`DoubleLongLeftRightArrow
 *
 * Usage:            DoubleLongLeftRightArrow[x, y, …] displays as x ⟺ y ⟺ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DoubleLongLeftRightArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/DoubleLongLeftRightArrow.html
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
fun doubleLongLeftRightArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DoubleLongLeftRightArrow", arguments.toMutableList(), options)
}
