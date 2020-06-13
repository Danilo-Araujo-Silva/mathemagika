package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SuchThat
 *
 * Full name:        System`SuchThat
 *
 * Usage:            SuchThat[x, y] displays as x ∍ y.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SuchThat
 * Documentation:    web: http://reference.wolfram.com/language/ref/SuchThat.html
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
fun suchThat(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SuchThat", arguments.toMutableList(), options)
}
