package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             IncidenceMatrix
 *
 * Full name:        System`IncidenceMatrix
 *
 *                   IncidenceMatrix[g] gives the vertex-edge incidence matrix of the graph g.
 * Usage:            IncidenceMatrix[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IncidenceMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/IncidenceMatrix.html
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
fun incidenceMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncidenceMatrix", arguments.toMutableList(), options)
}
