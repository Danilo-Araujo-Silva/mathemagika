package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GompertzMakehamDistribution
 * 
 * Full name:        System`GompertzMakehamDistribution
 * 
 *                   GompertzMakehamDistribution[λ, ξ] represents a Gompertz distribution with scale parameter λ and frailty parameter ξ.
 * Usage:            GompertzMakehamDistribution[λ, ξ, θ, α] represents a Gompertz–Makeham distribution with parameters λ, ξ, θ, and α.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GompertzMakehamDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/GompertzMakehamDistribution.html
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
fun gompertzMakehamDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GompertzMakehamDistribution", arguments.toMutableList(), options)
}
