package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Monitor
 * 
 * Full name:        System`Monitor
 * 
 * Usage:            Monitor[expr, mon] generates a temporary monitor cell in which the continually updated current value of mon is displayed during the course of evaluation of expr. 
 * 
 * Options:          None
 * 
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Monitor
 * Documentation:    web: http://reference.wolfram.com/language/ref/Monitor.html
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
fun monitor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Monitor", arguments.toMutableList(), options)
}
