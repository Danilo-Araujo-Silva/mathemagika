package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BeckmannDistribution
 *
 * Full name:        System`BeckmannDistribution
 *
 *                   BeckmannDistribution[μ , μ , σ , σ ] represents the Beckmann distribution with means μ  and μ  and standard deviations σ  and σ .
 *                                         1   2   1   2                                                   1      2                          1      2
 *                   BeckmannDistribution[μ , μ , σ , σ , ρ] represents the Beckmann distribution with means μ  and μ , standard deviations σ  and σ , and correlation ρ.
 * Usage:                                  1   2   1   2                                                      1      2                       1      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BeckmannDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BeckmannDistribution.html
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
fun beckmannDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BeckmannDistribution", arguments.toMutableList(), options)
}
