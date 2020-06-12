package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Backslash
 *
 * Full name:        System`Backslash
 *
 * Usage:            Backslash[x, y, …] displays as x ∖ y ∖ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Backslash
 * Documentation:    web: http://reference.wolfram.com/language/ref/Backslash.html
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
fun backslash(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Backslash", arguments.toMutableList(), options)
}
