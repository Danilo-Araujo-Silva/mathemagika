package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BrayCurtisDistance
 *
 * Full name:        System`BrayCurtisDistance
 *
 * Usage:            BrayCurtisDistance[u, v] gives the Bray–Curtis distance between vectors u and v.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BrayCurtisDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/BrayCurtisDistance.html
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
fun brayCurtisDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BrayCurtisDistance", arguments.toMutableList(), options)
}
