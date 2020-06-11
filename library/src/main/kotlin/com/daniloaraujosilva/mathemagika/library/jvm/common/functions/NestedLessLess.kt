package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NestedLessLess
 *
 * Full name:        System`NestedLessLess
 *
 * Usage:            NestedLessLess[x, y, …] displays as x ⪡ y ⪡ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NestedLessLess
 * Documentation:    web: http://reference.wolfram.com/language/ref/NestedLessLess.html
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
fun nestedLessLess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NestedLessLess", arguments.toMutableList(), options)
}
