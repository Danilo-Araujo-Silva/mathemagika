package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Star
 *
 * Full name:        System`Star
 *
 * Usage:            Star[x, y, …] displays as x ⋆ y ⋆ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Star
 * Documentation:    web: http://reference.wolfram.com/language/ref/Star.html
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
fun star(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Star", arguments.toMutableList(), options)
}
