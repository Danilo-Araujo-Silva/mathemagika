package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TraceDialog
 *
 * Full name:        System`TraceDialog
 *
 *                   TraceDialog[expr] initiates a dialog for every expression used in the evaluation of expr.
 *                   TraceDialog[expr, form] initiates a dialog only for expressions which match form.
 * Usage:            TraceDialog[expr, s] initiates dialogs only for expressions whose evaluations use transformation rules associated with the symbol s.
 *
 *                   MatchLocalNames -> True
 *                   TraceAbove -> False
 *                   TraceAction -> (StackInhibit[Message[TraceDialog::dgbgn]; Dialog[#1]; Message[TraceDialog::dgend]] & )
 *                   TraceDepth -> Infinity
 *                   TraceForward -> False
 *                   TraceInternal -> Automatic
 *                   TraceOff -> None
 * Options:          TraceOn -> None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TraceDialog
 * Documentation:    web: http://reference.wolfram.com/language/ref/TraceDialog.html
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
fun traceDialog(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TraceDialog", arguments.toMutableList(), options)
}
