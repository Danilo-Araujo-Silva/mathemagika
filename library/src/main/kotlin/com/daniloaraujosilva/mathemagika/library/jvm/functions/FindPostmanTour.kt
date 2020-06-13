package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FindPostmanTour
 *
 * Full name:        System`FindPostmanTour
 *
 *                   FindPostmanTour[g] finds a Chinese postman tour in the graph g of minimal length.
 *                   FindPostmanTour[g, k] finds at most k Chinese postman tours.
 * Usage:            FindPostmanTour[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindPostmanTour
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindPostmanTour.html
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
fun findPostmanTour(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindPostmanTour", arguments.toMutableList(), options)
}
