package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Timing
 *
 * Full name:        System`Timing
 *
 * Usage:            Timing[expr] evaluates expr, and returns a list of the time in seconds used, together with the result obtained.
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       SequenceHold
 *
 *                   local: paclet:ref/Timing
 * Documentation:    web: http://reference.wolfram.com/language/ref/Timing.html
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
fun timing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Timing", arguments.toMutableList(), options)
}
