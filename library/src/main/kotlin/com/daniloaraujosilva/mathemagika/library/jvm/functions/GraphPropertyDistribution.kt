package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GraphPropertyDistribution
 *
 * Full name:        System`GraphPropertyDistribution
 *
 *                   GraphPropertyDistribution[expr, x  gdist] represents the distribution of the property expr where the random variable x follows the graph distribution gdist.
 *                   GraphPropertyDistribution[expr, {x   gdist , x   gdist , …}] represents the distribution where x , x , … are independent and follow the graph distributions gdist , gdist , ….
 * Usage:                                              1        1   2        2                                         1   2                                                            1       2
 *
 * Options:          Assumptions :> $Assumptions
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GraphPropertyDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphPropertyDistribution.html
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
fun graphPropertyDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphPropertyDistribution", arguments.toMutableList(), options)
}
