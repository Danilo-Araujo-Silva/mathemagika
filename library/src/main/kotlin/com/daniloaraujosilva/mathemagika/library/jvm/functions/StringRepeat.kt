package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringRepeat
 *
 * Full name:        System`StringRepeat
 *
 *                   StringRepeat["str", n] creates a string consisting of "str" repeated n times.
 * Usage:            StringRepeat["str", n, max] creates a string consisting of up to n copies of "str", truncated to be of maximum total length at most max.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StringRepeat
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringRepeat.html
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
fun stringRepeat(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringRepeat", arguments.toMutableList(), options)
}
