package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DoubleLeftRightArrow
 *
 * Full name:        System`DoubleLeftRightArrow
 *
 * Usage:            DoubleLeftRightArrow[x, y, …] displays as x ⇔ y ⇔ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DoubleLeftRightArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/DoubleLeftRightArrow.html
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
fun doubleLeftRightArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DoubleLeftRightArrow", arguments.toMutableList(), options)
}
