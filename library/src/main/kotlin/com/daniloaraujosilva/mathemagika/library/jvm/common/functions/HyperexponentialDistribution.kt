package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HyperexponentialDistribution
 *
 * Full name:        System`HyperexponentialDistribution
 *
 *                   HyperexponentialDistribution[{α , …, α }, {λ , …, λ }] represents an m-phase hyperexponential distribution with phase probabilities α  and rates λ .
 * Usage:                                           1      m     1      m                                                                                 i            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HyperexponentialDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/HyperexponentialDistribution.html
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
fun hyperexponentialDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HyperexponentialDistribution", arguments.toMutableList(), options)
}
