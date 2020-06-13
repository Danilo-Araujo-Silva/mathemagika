package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TraceDepth
 *
 * Full name:        System`TraceDepth
 *
 * Usage:            TraceDepth is an option for Trace and related functions which specifies the maximum nesting of evaluation chains that are to be included.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TraceDepth
 * Documentation:    web: http://reference.wolfram.com/language/ref/TraceDepth.html
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
fun traceDepth(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TraceDepth", arguments.toMutableList(), options)
}
