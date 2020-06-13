package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             IncidenceList
 *
 * Full name:        System`IncidenceList
 *
 *                   IncidenceList[g, v] gives a list of edges incident to vertex v.
 *                   IncidenceList[g, patt] gives a list of edges incident to vertices that match the pattern patt.
 *                   IncidenceList[g, patt, d] gives a list of incident edges d steps away.
 * Usage:            IncidenceList[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IncidenceList
 * Documentation:    web: http://reference.wolfram.com/language/ref/IncidenceList.html
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
fun incidenceList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncidenceList", arguments.toMutableList(), options)
}
