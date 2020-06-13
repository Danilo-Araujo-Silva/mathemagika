package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TraceInternal
 *
 * Full name:        System`TraceInternal
 *
 * Usage:            TraceInternal is an option for Trace and related functions which, if True or False, specifies whether to trace evaluations of expressions generated internally by Mathematica. The intermediate Automatic setting traces a selected set of internal evaluations including Messages and sets or unsets of visible symbols.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun traceInternal(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TraceInternal", arguments.toMutableList(), options)
}
