package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BinormalDistribution
 *
 * Full name:        System`BinormalDistribution
 *
 *                                                                                                                                                       2                        2
 *                   BinormalDistribution[{μ , μ }, {σ , σ }, ρ] represents a bivariate normal distribution with mean {μ , μ } and covariance matrix {{σ  , ρ σ  σ }, {ρ σ  σ , σ  }}.
 *                                          1   2     1   2                                                             1   2                           1      1  2       1  2   2
 *                   BinormalDistribution[{σ , σ }, ρ] represents a bivariate normal distribution with zero mean.
 *                                          1   2
 * Usage:            BinormalDistribution[ρ] represents a bivariate normal distribution with zero mean and covariance matrix {{1, ρ }, {ρ, 1}}.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BinormalDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BinormalDistribution.html
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
fun binormalDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BinormalDistribution", arguments.toMutableList(), options)
}
