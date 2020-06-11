package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Trace
 *
 * Full name:        System`Trace
 *
 *                   Trace[expr] generates a list of all expressions used in the evaluation of expr.
 *                   Trace[expr, form] includes only those expressions that match form.
 * Usage:            Trace[expr, s] includes all evaluations that use transformation rules associated with the symbol s.
 *
 *                   MatchLocalNames -> True
 *                   TraceAbove -> False
 *                   TraceBackward -> False
 *                   TraceDepth -> Infinity
 *                   TraceForward -> False
 *                   TraceInternal -> Automatic
 *                   TraceOff -> None
 *                   TraceOn -> None
 * Options:          TraceOriginal -> False
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Trace
 * Documentation:    web: http://reference.wolfram.com/language/ref/Trace.html
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
fun trace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Trace", arguments.toMutableList(), options)
}
