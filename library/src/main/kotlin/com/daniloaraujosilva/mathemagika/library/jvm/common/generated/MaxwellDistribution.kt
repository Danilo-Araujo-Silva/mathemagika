package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MaxwellDistribution
 * 
 * Full name:        System`MaxwellDistribution
 * 
 * Usage:            MaxwellDistribution[σ] represents a Maxwell distribution with scale parameter σ.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MaxwellDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxwellDistribution.html
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
fun maxwellDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxwellDistribution", arguments.toMutableList(), options)
}
