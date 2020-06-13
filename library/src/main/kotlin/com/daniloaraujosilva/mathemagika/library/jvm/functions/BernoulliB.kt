package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BernoulliB
 *
 * Full name:        System`BernoulliB
 *
 *                   BernoulliB[n] gives the Bernoulli number B .
 *                                                             n
 *                   BernoulliB[n, x] gives the Bernoulli polynomial B (x).
 * Usage:                                                             n
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BernoulliB
 * Documentation:    web: http://reference.wolfram.com/language/ref/BernoulliB.html
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
fun bernoulliB(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BernoulliB", arguments.toMutableList(), options)
}
