package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CircleDot
 *
 * Full name:        System`CircleDot
 *
 * Usage:            CircleDot[x, y, …] displays as x ⊙ y ⊙ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/CircleDot
 * Documentation:    web: http://reference.wolfram.com/language/ref/CircleDot.html
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
fun circleDot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CircleDot", arguments.toMutableList(), options)
}
