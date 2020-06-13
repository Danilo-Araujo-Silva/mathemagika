package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CounterAssignments
 *
 * Full name:        System`CounterAssignments
 *
 * Usage:            CounterAssignments is an option for selections that sets the value of a specified counter.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CounterAssignments
 * Documentation:    web: http://reference.wolfram.com/language/ref/CounterAssignments.html
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
fun counterAssignments(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CounterAssignments", arguments.toMutableList(), options)
}
