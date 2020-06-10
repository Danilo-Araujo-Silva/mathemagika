package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StudentTDistribution
 * 
 * Full name:        System`StudentTDistribution
 * 
 *                   StudentTDistribution[ν] represents a Student t distribution with ν degrees of freedom.
 * Usage:            StudentTDistribution[μ, σ, ν] represents a Student t distribution with location parameter μ, scale parameter σ, and ν degrees of freedom.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/StudentTDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/StudentTDistribution.html
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
fun studentTDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StudentTDistribution", arguments.toMutableList(), options)
}
