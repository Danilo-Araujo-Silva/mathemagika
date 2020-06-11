package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NoncentralBetaDistribution
 *
 * Full name:        System`NoncentralBetaDistribution
 *
 * Usage:            NoncentralBetaDistribution[α, β, δ] represents a noncentral beta distribution with shape parameters α, β and noncentrality parameter δ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NoncentralBetaDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/NoncentralBetaDistribution.html
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
fun noncentralBetaDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NoncentralBetaDistribution", arguments.toMutableList(), options)
}
