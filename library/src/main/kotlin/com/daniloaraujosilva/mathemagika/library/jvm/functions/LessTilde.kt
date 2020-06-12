package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LessTilde
 *
 * Full name:        System`LessTilde
 *
 * Usage:            LessTilde[x, y, …] displays as x ≲ y ≲ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LessTilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/LessTilde.html
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
fun lessTilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LessTilde", arguments.toMutableList(), options)
}
