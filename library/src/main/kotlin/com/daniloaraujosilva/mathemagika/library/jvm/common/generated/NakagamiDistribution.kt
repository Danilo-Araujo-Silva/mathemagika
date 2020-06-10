package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NakagamiDistribution
 * 
 * Full name:        System`NakagamiDistribution
 * 
 * Usage:            NakagamiDistribution[μ, ω] represents a Nakagami distribution with shape parameter μ and spread parameter ω.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NakagamiDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/NakagamiDistribution.html
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
fun nakagamiDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NakagamiDistribution", arguments.toMutableList(), options)
}
