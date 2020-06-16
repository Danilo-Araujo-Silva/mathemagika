package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TraceScan
 *
 * Full name:        System`TraceScan
 *
 *                   TraceScan[f, expr] applies f to all expressions used in the evaluation of expr.
 *                   TraceScan[f, expr, form] includes only those expressions which match form.
 *                   TraceScan[f, expr, s] includes all evaluations which use transformation rules associated with the symbol s.
 * Usage:            TraceScan[f, expr, form, fp] applies f before evaluation and fp after evaluation to expressions used in the evaluation of expr.
 *
 *                   MatchLocalNames -> True
 *                   TraceAbove -> False
 *                   TraceDepth -> Infinity
 *                   TraceForward -> False
 *                   TraceInternal -> Automatic
 *                   TraceOff -> None
 * Options:          TraceOn -> None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TraceScan
 * Documentation:    web: http://reference.wolfram.com/language/ref/TraceScan.html
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
fun traceScan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TraceScan", arguments.toMutableList(), options)
}
