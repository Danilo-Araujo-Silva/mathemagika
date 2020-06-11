package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Distributed
 *
 * Full name:        System`Distributed
 *
 *                   Distributed[x, dist] or x  dist asserts that the random variable x is distributed according to the probability distribution dist.
 *                   Distributed[{x , x , …}, dist] or {x , x , …}  dist asserts that the random vector {x , x , …} is distributed according to the multivariate probability distribution dist.
 * Usage:                          1   2                 1   2                                             1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Distributed
 * Documentation:    web: http://reference.wolfram.com/language/ref/Distributed.html
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
fun distributed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Distributed", arguments.toMutableList(), options)
}
