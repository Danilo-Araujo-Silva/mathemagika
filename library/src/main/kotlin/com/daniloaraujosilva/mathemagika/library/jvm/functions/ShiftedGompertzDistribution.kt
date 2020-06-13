package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ShiftedGompertzDistribution
 *
 * Full name:        System`ShiftedGompertzDistribution
 *
 * Usage:            ShiftedGompertzDistribution[λ, ξ] represents a shifted Gompertz distribution with scale parameter λ and shape parameter ξ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ShiftedGompertzDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShiftedGompertzDistribution.html
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
fun shiftedGompertzDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShiftedGompertzDistribution", arguments.toMutableList(), options)
}
