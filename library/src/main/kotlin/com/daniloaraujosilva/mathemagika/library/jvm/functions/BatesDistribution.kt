package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BatesDistribution
 *
 * Full name:        System`BatesDistribution
 *
 *                   BatesDistribution[n] represents the distribution of a mean of n random variables uniformly distributed from 0 to 1.
 * Usage:            BatesDistribution[n, {min, max}] represents the distribution of a mean of n random variables uniformly distributed from min to max.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BatesDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BatesDistribution.html
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
fun batesDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BatesDistribution", arguments.toMutableList(), options)
}
