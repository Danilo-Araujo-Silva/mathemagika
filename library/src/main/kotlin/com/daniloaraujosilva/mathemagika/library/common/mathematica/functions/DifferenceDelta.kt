package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DifferenceDelta
 *
 * Full name:        System`DifferenceDelta
 *
 *                   DifferenceDelta[f, i] gives the discrete difference   f = f(i + 1) - f(i).
 *                                                                        i
 *                                                                             n
 *                   DifferenceDelta[f, {i, n}] gives the multiple difference   f.
 *                                                                             i
 *                   DifferenceDelta[f, {i, n, h}] gives the multiple difference with step h.
 * Usage:            DifferenceDelta[f, i, j, …] computes the partial difference with respect to i, j, ….
 *
 * Options:          Assumptions :> $Assumptions
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DifferenceDelta
 * Documentation:    web: http://reference.wolfram.com/language/ref/DifferenceDelta.html
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
fun differenceDelta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DifferenceDelta", arguments.toMutableList(), options)
}
