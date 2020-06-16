package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindGraphCommunities
 *
 * Full name:        System`FindGraphCommunities
 *
 *                   FindGraphCommunities[g] finds communities in the graph g.
 * Usage:            FindGraphCommunities[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindGraphCommunities
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindGraphCommunities.html
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
fun findGraphCommunities(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindGraphCommunities", arguments.toMutableList(), options)
}
