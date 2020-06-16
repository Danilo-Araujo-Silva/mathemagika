package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VertexLabelStyle
 *
 * Full name:        System`VertexLabelStyle
 *
 * Usage:            VertexLabelStyle is an option and property for Graph and related functions that specifies the style to use for vertex labels.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexLabelStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexLabelStyle.html
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
fun vertexLabelStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexLabelStyle", arguments.toMutableList(), options)
}
