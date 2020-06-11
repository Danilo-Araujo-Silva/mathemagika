package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TukeyLambdaDistribution
 *
 * Full name:        System`TukeyLambdaDistribution
 *
 *                   TukeyLambdaDistribution[λ] represents Tukey's lambda distribution with shape parameter λ.
 *                   TukeyLambdaDistribution[λ, μ, σ] represents Tukey's lambda distribution with location parameter μ and scale parameter σ.
 *                   TukeyLambdaDistribution[{λ , λ }, μ, {σ , σ }] represents the generalized Tukey's lambda distribution with location parameter μ, scale parameters σ  and σ , and shape parameters λ  and λ .
 * Usage:                                      1   2        1   2                                                                                                       1      2                        1      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TukeyLambdaDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/TukeyLambdaDistribution.html
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
fun tukeyLambdaDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TukeyLambdaDistribution", arguments.toMutableList(), options)
}
