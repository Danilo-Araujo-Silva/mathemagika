package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ToString
 *
 * Full name:        System`ToString
 *
 *                   ToString[expr] gives a string corresponding to the printed form of expr in OutputForm.
 * Usage:            ToString[expr, form] gives the string corresponding to output in the specified form.
 *
 *                   CharacterEncoding -> Unicode
 *                   FormatType -> OutputForm
 *                   NumberMarks :> $NumberMarks
 *                   PageHeight -> Infinity
 *                   PageWidth -> Infinity
 *                   TotalHeight -> Infinity
 * Options:          TotalWidth -> Infinity
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ToString
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToString.html
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
fun toString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToString", arguments.toMutableList(), options)
}
