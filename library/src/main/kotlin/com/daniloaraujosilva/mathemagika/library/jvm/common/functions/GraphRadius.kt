package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GraphRadius
 *
 * Full name:        System`GraphRadius
 *
 *                   GraphRadius[g] gives the minimum eccentricity of the vertices in the graph g.
 * Usage:            GraphRadius[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GraphRadius
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphRadius.html
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
fun graphRadius(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphRadius", arguments.toMutableList(), options)
}
