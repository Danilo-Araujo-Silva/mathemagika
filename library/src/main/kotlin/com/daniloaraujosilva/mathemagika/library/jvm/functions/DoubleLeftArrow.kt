package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DoubleLeftArrow
 *
 * Full name:        System`DoubleLeftArrow
 *
 * Usage:            DoubleLeftArrow[x, y, …] displays as x ⇐ y ⇐ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DoubleLeftArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/DoubleLeftArrow.html
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
fun doubleLeftArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DoubleLeftArrow", arguments.toMutableList(), options)
}
