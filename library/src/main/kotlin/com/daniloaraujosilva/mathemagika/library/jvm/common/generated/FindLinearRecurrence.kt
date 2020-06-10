package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FindLinearRecurrence
 * 
 * Full name:        System`FindLinearRecurrence
 * 
 *                   FindLinearRecurrence[list] finds if possible the minimal linear recurrence that generates list.
 * Usage:            FindLinearRecurrence[list, d] finds if possible the linear recurrence of maximum order d that generates list.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FindLinearRecurrence
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindLinearRecurrence.html
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
fun findLinearRecurrence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindLinearRecurrence", arguments.toMutableList(), options)
}
