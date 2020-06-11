package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeUsed
 *
 * Full name:        System`TimeUsed
 *
 * Usage:            TimeUsed[] gives the total number of seconds of CPU time used so far in the current Wolfram System session.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TimeUsed
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeUsed.html
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
fun timeUsed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeUsed", arguments.toMutableList(), options)
}
