package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BernoulliDistribution
 * 
 * Full name:        System`BernoulliDistribution
 * 
 * Usage:            BernoulliDistribution[p] represents a Bernoulli distribution with probability parameter p.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/BernoulliDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BernoulliDistribution.html
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
fun bernoulliDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BernoulliDistribution", arguments.toMutableList(), options)
}
