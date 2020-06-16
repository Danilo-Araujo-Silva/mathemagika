package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TraceBackward
 *
 * Full name:        System`TraceBackward
 *
 * Usage:            TraceBackward is an option for Trace and related functions that specifies whether to include preceding expressions on the evaluation chain that contains the pattern form sought.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TraceBackward
 * Documentation:    web: http://reference.wolfram.com/language/ref/TraceBackward.html
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
fun traceBackward(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TraceBackward", arguments.toMutableList(), options)
}
