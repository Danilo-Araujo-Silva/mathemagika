package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VerticalTilde
 *
 * Full name:        System`VerticalTilde
 *
 * Usage:            VerticalTilde[x, y, …] displays as x ≀ y ≀ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/VerticalTilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/VerticalTilde.html
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
fun verticalTilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VerticalTilde", arguments.toMutableList(), options)
}
