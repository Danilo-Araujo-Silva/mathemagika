package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HypoexponentialDistribution
 * 
 * Full name:        System`HypoexponentialDistribution
 * 
 *                   HypoexponentialDistribution[{λ , …, λ }] represents an m-phase hypoexponential distribution with rates λ , …, λ .
 * Usage:                                          1      m                                                                  1      m
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/HypoexponentialDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/HypoexponentialDistribution.html
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
fun hypoexponentialDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HypoexponentialDistribution", arguments.toMutableList(), options)
}
