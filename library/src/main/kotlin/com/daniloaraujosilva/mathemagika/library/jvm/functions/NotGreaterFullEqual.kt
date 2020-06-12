package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotGreaterFullEqual
 *
 * Full name:        System`NotGreaterFullEqual
 *
 * Usage:            NotGreaterFullEqual[x, y, …] displays as x ≩ y ≩ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotGreaterFullEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotGreaterFullEqual.html
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
fun notGreaterFullEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotGreaterFullEqual", arguments.toMutableList(), options)
}
