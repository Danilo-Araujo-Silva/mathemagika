package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PlanarGraphQ
 *
 * Full name:        System`PlanarGraphQ
 *
 * Usage:            PlanarGraphQ[g] yields True if g is a planar graph and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PlanarGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlanarGraphQ.html
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
fun planarGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlanarGraphQ", arguments.toMutableList(), options)
}
