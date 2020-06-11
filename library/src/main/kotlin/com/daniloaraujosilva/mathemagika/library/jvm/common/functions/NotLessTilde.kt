package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotLessTilde
 *
 * Full name:        System`NotLessTilde
 *
 * Usage:            NotLessTilde[x, y, …] displays as x ≴ y ≴ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotLessTilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotLessTilde.html
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
fun notLessTilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotLessTilde", arguments.toMutableList(), options)
}
