package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CircleTimes
 *
 * Full name:        System`CircleTimes
 *
 *                   CircleTimes[x] displays as ⊗ x.
 * Usage:            CircleTimes[x, y, …] displays as x ⊗ y ⊗ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/CircleTimes
 * Documentation:    web: http://reference.wolfram.com/language/ref/CircleTimes.html
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
fun circleTimes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CircleTimes", arguments.toMutableList(), options)
}
