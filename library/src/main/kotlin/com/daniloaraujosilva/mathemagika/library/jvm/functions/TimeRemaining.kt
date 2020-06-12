package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeRemaining
 *
 * Full name:        System`TimeRemaining
 *
 * Usage:            TimeRemaining[] gives the number of seconds remaining until the earliest enclosing TimeConstrained will request the current computation to stop.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TimeRemaining
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeRemaining.html
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
fun timeRemaining(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeRemaining", arguments.toMutableList(), options)
}
