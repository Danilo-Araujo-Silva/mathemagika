package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HistogramDistribution
 * 
 * Full name:        System`HistogramDistribution
 * 
 *                   HistogramDistribution[{x , x , …}] represents the probability distribution corresponding to a histogram of the data values x .
 *                                           1   2                                                                                               i
 *                   HistogramDistribution[{{x , y , …}, {x , y , …}, …}] represents a multivariate histogram distribution based on data values {x , y , …}.
 *                                            1   1        2   2                                                                                  i   i
 * Usage:            HistogramDistribution[…, bspec] represents a histogram distribution with bins specified by bspec.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/HistogramDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/HistogramDistribution.html
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
fun histogramDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HistogramDistribution", arguments.toMutableList(), options)
}
