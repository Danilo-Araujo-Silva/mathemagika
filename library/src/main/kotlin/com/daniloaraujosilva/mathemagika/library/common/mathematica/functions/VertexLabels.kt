package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VertexLabels
 *
 * Full name:        System`VertexLabels
 *
 * Usage:            VertexLabels is an option and annotation for Graph and related functions that specifies what labels and label positions should be used for vertices.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexLabels
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexLabels.html
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
fun vertexLabels(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexLabels", arguments.toMutableList(), options)
}
