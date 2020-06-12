package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DoubleLongLeftArrow
 *
 * Full name:        System`DoubleLongLeftArrow
 *
 * Usage:            DoubleLongLeftArrow[x, y, …] displays as x ⟸ y ⟸ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DoubleLongLeftArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/DoubleLongLeftArrow.html
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
fun doubleLongLeftArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DoubleLongLeftArrow", arguments.toMutableList(), options)
}
