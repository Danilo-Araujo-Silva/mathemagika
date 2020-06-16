package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NBernoulliB
 *
 * Full name:        System`NBernoulliB
 *
 *                                                                     th
 *                   NBernoulliB[n] gives the numerical value of the n   Bernoulli number.
 * Usage:            NBernoulliB[n, d] gives the result to d-digit precision.
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
fun nBernoulliB(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NBernoulliB", arguments.toMutableList(), options)
}
