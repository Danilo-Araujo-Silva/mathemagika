package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             WeibullDistribution
 * 
 * Full name:        System`WeibullDistribution
 * 
 *                   WeibullDistribution[α, β] represents a Weibull distribution with shape parameter α and scale parameter β.
 * Usage:            WeibullDistribution[α, β, μ] represents a Weibull distribution with shape parameter α, scale parameter β, and location parameter μ.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/WeibullDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeibullDistribution.html
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
fun weibullDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeibullDistribution", arguments.toMutableList(), options)
}
