package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RepeatedTiming
 *
 * Full name:        System`RepeatedTiming
 *
 *                   RepeatedTiming[expr] evaluates expr repeatedly and returns a list of the average time in seconds used, together with the result obtained.
 * Usage:            RepeatedTiming[expr, t] does repeated evaluation for at least t seconds.
 *
 * Options:          None
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       SequenceHold
 *
 *                   local: paclet:ref/RepeatedTiming
 * Documentation:    web: http://reference.wolfram.com/language/ref/RepeatedTiming.html
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
fun repeatedTiming(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RepeatedTiming", arguments.toMutableList(), options)
}
