package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DirectedEdges
 *
 * Full name:        System`DirectedEdges
 *
 * Usage:            DirectedEdges is an option for Graph, GraphPlot, and related functions that specifies whether edges should be taken to be directed.
 *
 * Options:          ArrowheadsSize -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DirectedEdges
 * Documentation:    web: http://reference.wolfram.com/language/ref/DirectedEdges.html
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
fun directedEdges(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DirectedEdges", arguments.toMutableList(), options)
}
