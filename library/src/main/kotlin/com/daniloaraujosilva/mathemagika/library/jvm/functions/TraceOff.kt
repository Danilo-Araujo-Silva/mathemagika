package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TraceOff
 *
 * Full name:        System`TraceOff
 *
 * Usage:            TraceOff is an option for Trace and related functions which specifies forms inside which tracing should be switched off.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TraceOff
 * Documentation:    web: http://reference.wolfram.com/language/ref/TraceOff.html
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
fun traceOff(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TraceOff", arguments.toMutableList(), options)
}
