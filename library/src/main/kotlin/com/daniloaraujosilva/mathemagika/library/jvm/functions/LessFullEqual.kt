package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LessFullEqual
 *
 * Full name:        System`LessFullEqual
 *
 * Usage:            LessFullEqual[x, y, …] displays as x ≦ y ≦ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LessFullEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/LessFullEqual.html
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
fun lessFullEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LessFullEqual", arguments.toMutableList(), options)
}
