package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Tilde
 *
 * Full name:        System`Tilde
 *
 * Usage:            Tilde[x, y, …] displays as x ∼ y ∼ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Tilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/Tilde.html
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
fun tilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Tilde", arguments.toMutableList(), options)
}
