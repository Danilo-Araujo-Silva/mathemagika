package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AbsoluteTiming
 *
 * Full name:        System`AbsoluteTiming
 *
 * Usage:            AbsoluteTiming[expr] evaluates expr, returning a list of the absolute number of seconds in real time that have elapsed, together with the result obtained.
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       SequenceHold
 *
 *                   local: paclet:ref/AbsoluteTiming
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbsoluteTiming.html
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
fun absoluteTiming(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbsoluteTiming", arguments.toMutableList(), options)
}
