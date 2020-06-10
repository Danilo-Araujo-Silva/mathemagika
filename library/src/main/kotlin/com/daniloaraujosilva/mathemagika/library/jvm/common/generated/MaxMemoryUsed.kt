package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MaxMemoryUsed
 * 
 * Full name:        System`MaxMemoryUsed
 * 
 *                   MaxMemoryUsed[] gives the maximum number of bytes used to store all data for the current Wolfram System session.
 * Usage:            MaxMemoryUsed[expr] gives the maximum number of bytes used during the evaluation of expr.
 * 
 * Options:          None
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/MaxMemoryUsed
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxMemoryUsed.html
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
fun maxMemoryUsed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxMemoryUsed", arguments.toMutableList(), options)
}
