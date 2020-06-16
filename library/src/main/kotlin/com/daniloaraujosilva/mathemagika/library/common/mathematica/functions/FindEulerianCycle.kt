package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindEulerianCycle
 *
 * Full name:        System`FindEulerianCycle
 *
 *                   FindEulerianCycle[g] finds an Eulerian cycle in the graph g.
 *                   FindEulerianCycle[g, k] finds at most k Eulerian cycles.
 * Usage:            FindEulerianCycle[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindEulerianCycle
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindEulerianCycle.html
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
fun findEulerianCycle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindEulerianCycle", arguments.toMutableList(), options)
}
