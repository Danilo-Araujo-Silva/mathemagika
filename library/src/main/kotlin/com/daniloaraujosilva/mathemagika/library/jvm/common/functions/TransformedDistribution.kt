package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TransformedDistribution
 *
 * Full name:        System`TransformedDistribution
 *
 *                   TransformedDistribution[expr, x  dist] represents the transformed distribution of expr where the random variable x follows the distribution dist.
 *                   TransformedDistribution[expr, {x , x , …}  dist] represents the transformed distribution of expr where {x , x , …} follows the multivariate distribution dist.
 *                                                   1   2                                                                     1   2
 *                   TransformedDistribution[expr, x  proc] represents the transformed distribution where expr contains expressions of the form x[t], referring the value at time t from the random process proc.
 *                   TransformedDistribution[expr, {x   dist , x   dist  , …}] represents a transformed distribution where x , x , … are independent and follow the distributions dist , dist , ….
 * Usage:                                            1       1   2       2                                                    1   2                                                     1      2
 *
 * Options:          Assumptions -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TransformedDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransformedDistribution.html
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
fun transformedDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransformedDistribution", arguments.toMutableList(), options)
}
