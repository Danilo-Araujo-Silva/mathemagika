package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TracePrint
 *
 * Full name:        System`TracePrint
 *
 *                   TracePrint[expr] prints all expressions used in the evaluation of expr.
 *                   TracePrint[expr, form] includes only those expressions which match form.
 * Usage:            TracePrint[expr, s] includes all evaluations which use transformation rules associated with the symbol s.
 *
 *                   MatchLocalNames -> True
 *                   TraceAbove -> False
 *                   TraceAction -> (Print[Indent[TraceLevel[] - 1], #1] & )
 *                   TraceDepth -> Infinity
 *                   TraceForward -> False
 *                   TraceInternal -> Automatic
 *                   TraceOff -> None
 * Options:          TraceOn -> None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TracePrint
 * Documentation:    web: http://reference.wolfram.com/language/ref/TracePrint.html
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
fun tracePrint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TracePrint", arguments.toMutableList(), options)
}
