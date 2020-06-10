package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             UniformSumDistribution
 * 
 * Full name:        System`UniformSumDistribution
 * 
 *                   UniformSumDistribution[n] represents the distribution of a sum of n random variables uniformly distributed from 0 to 1.
 * Usage:            UniformSumDistribution[n, {min, max}] represents the distribution of a sum of n random variables uniformly distributed from min to max.
 * 
 * Options:          None
 * 
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/UniformSumDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/UniformSumDistribution.html
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
fun uniformSumDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UniformSumDistribution", arguments.toMutableList(), options)
}
