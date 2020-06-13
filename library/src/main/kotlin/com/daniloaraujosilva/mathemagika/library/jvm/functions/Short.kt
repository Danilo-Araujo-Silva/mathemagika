package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Short
 *
 * Full name:        System`Short
 *
 *                   Short[expr] prints as a short form of expr, less than about one line long.
 * Usage:            Short[expr, n] prints as a form of expr about n lines long.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Short
 * Documentation:    web: http://reference.wolfram.com/language/ref/Short.html
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
fun short(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Short", arguments.toMutableList(), options)
}
