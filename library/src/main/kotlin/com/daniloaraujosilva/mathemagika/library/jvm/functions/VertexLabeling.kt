package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VertexLabeling
 *
 * Full name:        System`VertexLabeling
 *
 * Usage:            VertexLabeling is an option for GraphPlot and related functions which specifies whether labeling should be included by default for vertices in graphs.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexLabeling
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexLabeling.html
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
fun vertexLabeling(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexLabeling", arguments.toMutableList(), options)
}
