package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BinaryDistance
 *
 * Full name:        System`BinaryDistance
 *
 * Usage:            BinaryDistance[u, v] gives the binary distance between vectors u and v, equal to 0 if they are identical and 1 otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BinaryDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/BinaryDistance.html
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
fun binaryDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BinaryDistance", arguments.toMutableList(), options)
}
