package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TraceAbove
 *
 * Full name:        System`TraceAbove
 *
 * Usage:            TraceAbove is an option for Trace and related functions which specifies whether to include evaluation chains which contain the evaluation chain containing the pattern form sought.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TraceAbove
 * Documentation:    web: http://reference.wolfram.com/language/ref/TraceAbove.html
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
fun traceAbove(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TraceAbove", arguments.toMutableList(), options)
}
