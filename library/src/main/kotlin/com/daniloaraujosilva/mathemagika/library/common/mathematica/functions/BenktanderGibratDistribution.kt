package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BenktanderGibratDistribution
 *
 * Full name:        System`BenktanderGibratDistribution
 *
 * Usage:            BenktanderGibratDistribution[a, b] represents a Benktander distribution of type I with parameters a and b.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BenktanderGibratDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BenktanderGibratDistribution.html
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
fun benktanderGibratDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BenktanderGibratDistribution", arguments.toMutableList(), options)
}
