package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TraceForward
 * 
 * Full name:        System`TraceForward
 * 
 * Usage:            TraceForward is an option for Trace and related functions which specifies whether to include later expressions on the evaluation chain that contains the pattern form sought. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/TraceForward
 * Documentation:    web: http://reference.wolfram.com/language/ref/TraceForward.html
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
fun traceForward(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TraceForward", arguments.toMutableList(), options)
}
