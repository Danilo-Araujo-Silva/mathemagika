package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DateWithinQ
 *
 * Full name:        System`DateWithinQ
 *
 *                   DateWithinQ[date , date ] returns True if the calendar date date  is entirely contained within date , and False otherwise.
 * Usage:                            1      2                                        2                                  1
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DateWithinQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/DateWithinQ.html
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
fun dateWithinQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DateWithinQ", arguments.toMutableList(), options)
}
