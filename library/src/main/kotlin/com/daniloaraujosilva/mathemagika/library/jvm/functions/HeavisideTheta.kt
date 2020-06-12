package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HeavisideTheta
 *
 * Full name:        System`HeavisideTheta
 *
 *                   HeavisideTheta[x] represents the Heaviside theta function θ(x), equal to 0 for x < 0 and 1 for x > 0.
 *                   HeavisideTheta[x , x , …] represents the multidimensional Heaviside theta function, which is 1 only if all of the x  are positive.
 * Usage:                            1   2                                                                                              i
 *
 * Options:          None
 *
 *                   Listable
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HeavisideTheta
 * Documentation:    web: http://reference.wolfram.com/language/ref/HeavisideTheta.html
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
fun heavisideTheta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HeavisideTheta", arguments.toMutableList(), options)
}
