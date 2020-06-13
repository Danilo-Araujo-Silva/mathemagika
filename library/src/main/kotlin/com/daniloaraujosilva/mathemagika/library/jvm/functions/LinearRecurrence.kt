package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LinearRecurrence
 *
 * Full name:        System`LinearRecurrence
 *
 *                   LinearRecurrence[ker, init, n] gives the sequence of length n obtained by iterating the linear recurrence with kernel ker starting with initial values init.
 *                                                                th
 *                   LinearRecurrence[ker, init, {n}] gives the n   term.
 *                   LinearRecurrence[ker, init, {n   , n   }] yields terms n    through n   .
 * Usage:                                          min   max                 min          max
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LinearRecurrence
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinearRecurrence.html
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
fun linearRecurrence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinearRecurrence", arguments.toMutableList(), options)
}
