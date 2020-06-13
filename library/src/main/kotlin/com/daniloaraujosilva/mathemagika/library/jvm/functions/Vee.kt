package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Vee
 *
 * Full name:        System`Vee
 *
 * Usage:            Vee[x, y, …] displays as x ⋁ y ⋁ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Vee
 * Documentation:    web: http://reference.wolfram.com/language/ref/Vee.html
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
fun vee(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Vee", arguments.toMutableList(), options)
}
