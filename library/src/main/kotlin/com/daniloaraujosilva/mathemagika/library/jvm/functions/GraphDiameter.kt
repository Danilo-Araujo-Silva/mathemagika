package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GraphDiameter
 *
 * Full name:        System`GraphDiameter
 *
 *                   GraphDiameter[g] gives the greatest distance between any pair of vertices in the graph g.
 * Usage:            GraphDiameter[{v  w, …}] uses rules v  w to specify the graph g.
 *
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GraphDiameter
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphDiameter.html
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
fun graphDiameter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphDiameter", arguments.toMutableList(), options)
}
