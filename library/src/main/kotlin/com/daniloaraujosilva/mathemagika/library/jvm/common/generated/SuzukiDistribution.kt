package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SuzukiDistribution
 * 
 * Full name:        System`SuzukiDistribution
 * 
 * Usage:            SuzukiDistribution[μ, ν] represents the Suzuki distribution with shape parameters μ and ν.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SuzukiDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/SuzukiDistribution.html
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
fun suzukiDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SuzukiDistribution", arguments.toMutableList(), options)
}
