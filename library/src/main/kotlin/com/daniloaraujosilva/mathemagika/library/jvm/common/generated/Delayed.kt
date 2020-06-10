package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Delayed
 * 
 * Full name:        System`Delayed
 * 
 *                   Delayed[expr] represents an expression whose evaluation is delayed until its value is externally requested.
 *                   Delayed[expr, fmt] specifies that the result from evaluating expr should be given in format fmt.
 * Usage:            Delayed[expr, {fmt, rform}] specifies that the result should be given as a response of the form rform.
 * 
 *                   CachePersistence -> 0
 * Options:          UpdateInterval -> Infinity
 * 
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Delayed
 * Documentation:    web: http://reference.wolfram.com/language/ref/Delayed.html
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
fun delayed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Delayed", arguments.toMutableList(), options)
}
