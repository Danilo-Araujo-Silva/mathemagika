package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LessLess
 *
 * Full name:        System`LessLess
 *
 * Usage:            LessLess[x, y, …] displays as x ≪ y ≪ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LessLess
 * Documentation:    web: http://reference.wolfram.com/language/ref/LessLess.html
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
fun lessLess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LessLess", arguments.toMutableList(), options)
}
