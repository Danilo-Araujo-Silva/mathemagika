package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             VertexNormals
 *
 * Full name:        System`VertexNormals
 *
 * Usage:            VertexNormals is an option for graphics primitives which specifies the normal directions to assign to 3D vertices.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexNormals
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexNormals.html
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
fun vertexNormals(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexNormals", arguments.toMutableList(), options)
}
