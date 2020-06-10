package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DateOverlapsQ
 * 
 * Full name:        System`DateOverlapsQ
 * 
 *                   DateOverlapsQ[date , date ] returns True if the calendar dates date  and date  overlap, and False otherwise.
 * Usage:                              1      2                                         1         2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DateOverlapsQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/DateOverlapsQ.html
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
fun dateOverlapsQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DateOverlapsQ", arguments.toMutableList(), options)
}
