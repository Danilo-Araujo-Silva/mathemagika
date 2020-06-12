package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeConstrained
 *
 * Full name:        System`TimeConstrained
 *
 *                   TimeConstrained[expr, t] evaluates expr, stopping after t seconds.
 * Usage:            TimeConstrained[expr, t, failexpr] returns failexpr if the time constraint is not met.
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TimeConstrained
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeConstrained.html
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
fun timeConstrained(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeConstrained", arguments.toMutableList(), options)
}
