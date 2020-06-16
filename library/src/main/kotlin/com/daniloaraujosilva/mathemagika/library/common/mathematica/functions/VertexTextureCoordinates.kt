package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VertexTextureCoordinates
 *
 * Full name:        System`VertexTextureCoordinates
 *
 * Usage:            VertexTextureCoordinates is an option for graphics primitives that specifies the texture coordinates to assign to vertices.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexTextureCoordinates
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexTextureCoordinates.html
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
fun vertexTextureCoordinates(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexTextureCoordinates", arguments.toMutableList(), options)
}
