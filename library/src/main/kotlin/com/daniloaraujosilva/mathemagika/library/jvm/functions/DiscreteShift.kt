package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteShift
 *
 * Full name:        System`DiscreteShift
 *
 *                   DiscreteShift[f, i] gives the discrete shift   (f(i))  f(i + 1).
 *                                                                 i
 *                                                                      n
 *                   DiscreteShift[f, {i, n}] gives the multiple shift   f.
 *                                                                      i
 *                   DiscreteShift[f, {i, n, h}] gives the multiple shift of step h.
 * Usage:            DiscreteShift[f, i, j, …] computes partial shifts with respect to i, j, ….
 *
 * Options:          Assumptions :> $Assumptions
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DiscreteShift
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteShift.html
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
fun discreteShift(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteShift", arguments.toMutableList(), options)
}
