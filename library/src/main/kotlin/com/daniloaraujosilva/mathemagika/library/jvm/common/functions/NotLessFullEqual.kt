package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotLessFullEqual
 *
 * Full name:        System`NotLessFullEqual
 *
 * Usage:            NotLessFullEqual[x, y, …] displays as x ≨ y ≨ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotLessFullEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotLessFullEqual.html
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
fun notLessFullEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotLessFullEqual", arguments.toMutableList(), options)
}
