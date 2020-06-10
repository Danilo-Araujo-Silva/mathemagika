package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             WakebyDistribution
 * 
 * Full name:        System`WakebyDistribution
 * 
 * Usage:            WakebyDistribution[α, β, γ, δ, μ] represents Wakeby distribution with shape parameters β and δ, scale parameters α and γ, and location parameter μ.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/WakebyDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/WakebyDistribution.html
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
fun wakebyDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WakebyDistribution", arguments.toMutableList(), options)
}
