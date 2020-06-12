package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TraceOriginal
 *
 * Full name:        System`TraceOriginal
 *
 * Usage:            TraceOriginal is an option for Trace and related functions which specifies whether to test the form of each expression before its head and arguments are evaluated.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TraceOriginal
 * Documentation:    web: http://reference.wolfram.com/language/ref/TraceOriginal.html
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
fun traceOriginal(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TraceOriginal", arguments.toMutableList(), options)
}
