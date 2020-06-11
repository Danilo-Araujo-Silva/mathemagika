package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LindleyDistribution
 *
 * Full name:        System`LindleyDistribution
 *
 * Usage:            LindleyDistribution[δ] represents a Lindley distribution with shape parameter δ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LindleyDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/LindleyDistribution.html
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
fun lindleyDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LindleyDistribution", arguments.toMutableList(), options)
}
