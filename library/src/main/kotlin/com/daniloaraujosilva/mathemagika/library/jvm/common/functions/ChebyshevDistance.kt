package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ChebyshevDistance
 *
 * Full name:        System`ChebyshevDistance
 *
 * Usage:            ChebyshevDistance[u, v] gives the Chebyshev or sup norm distance between vectors u and v.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ChebyshevDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChebyshevDistance.html
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
fun chebyshevDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChebyshevDistance", arguments.toMutableList(), options)
}
