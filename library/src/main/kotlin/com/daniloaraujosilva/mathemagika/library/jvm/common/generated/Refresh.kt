package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Refresh
 * 
 * Full name:        System`Refresh
 * 
 *                   Refresh[expr, opts] represents an object whose value in a Dynamic should be refreshed at times specified by the options opts. 
 * Usage:            Refresh[expr, None] specifies that the value of expr should never automatically be refreshed. 
 * 
 *                   TrackedSymbols -> Automatic
 * Options:          UpdateInterval -> Infinity
 * 
 *                   HoldFirst
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Refresh
 * Documentation:    web: http://reference.wolfram.com/language/ref/Refresh.html
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
fun refresh(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Refresh", arguments.toMutableList(), options)
}
