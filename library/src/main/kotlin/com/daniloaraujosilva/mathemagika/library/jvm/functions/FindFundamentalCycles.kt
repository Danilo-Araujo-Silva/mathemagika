package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindFundamentalCycles
 *
 * Full name:        System`FindFundamentalCycles
 *
 * Usage:            FindFundamentalCycles[g] finds fundamental cycles of the graph g.
 *
 * Options:          EdgeWeight -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindFundamentalCycles
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindFundamentalCycles.html
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
fun findFundamentalCycles(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindFundamentalCycles", arguments.toMutableList(), options)
}
