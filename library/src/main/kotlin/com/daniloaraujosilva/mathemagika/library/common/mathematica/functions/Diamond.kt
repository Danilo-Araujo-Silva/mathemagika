package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Diamond
 *
 * Full name:        System`Diamond
 *
 * Usage:            Diamond[x, y, …] displays as x ⋄ y ⋄ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Diamond
 * Documentation:    web: http://reference.wolfram.com/language/ref/Diamond.html
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
fun diamond(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Diamond", arguments.toMutableList(), options)
}
