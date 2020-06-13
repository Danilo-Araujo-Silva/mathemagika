package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ProbabilityDistribution
 *
 * Full name:        System`ProbabilityDistribution
 *
 *                   ProbabilityDistribution[pdf, {x, x   , x   }] represents the continuous distribution with PDF pdf in the variable x where the pdf is taken to be zero for x < x    and x > x   .
 *                                                     min   max                                                                                                                    min          max
 *                   ProbabilityDistribution[pdf, {x, x   , x   , dx}] represents the discrete distribution with PDF pdf in the variable x where the pdf is taken to be zero for x < x    and x > x   .
 *                                                     min   max                                                                                                                      min          max
 *                   ProbabilityDistribution[pdf, {x, …}, {y, …}, …] represents a multivariate distribution with PDF pdf in the variables x, y, …, etc.
 *                   ProbabilityDistribution[{"CDF", cdf}, …] represents a probability distribution with CDF given by cdf.
 *                   ProbabilityDistribution[{"SF", sf}, …] represents a probability distribution with survival function given by sf.
 * Usage:            ProbabilityDistribution[{"HF", hf}, …] represents a probability distribution with hazard function given by hf.
 *
 *                   Assumptions :> True
 * Options:          Method -> Automatic
 *
 *                   NHoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ProbabilityDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProbabilityDistribution.html
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
fun probabilityDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProbabilityDistribution", arguments.toMutableList(), options)
}
