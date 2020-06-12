package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindEdgeCut
 *
 * Full name:        System`FindEdgeCut
 *
 *                   FindEdgeCut[g] finds a smallest edge cut of the graph g.
 *                   FindEdgeCut[g, s, t] finds a smallest s-t edge cut of the graph g.
 * Usage:            FindEdgeCut[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          EdgeWeight -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindEdgeCut
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindEdgeCut.html
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
fun findEdgeCut(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindEdgeCut", arguments.toMutableList(), options)
}
