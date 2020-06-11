package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VertexShapeFunction
 *
 * Full name:        System`VertexShapeFunction
 *
 * Usage:            VertexShapeFunction is an option and annotation for Graph and related functions that specifies a function to use to generate primitives for rendering each vertex.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexShapeFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexShapeFunction.html
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
fun vertexShapeFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexShapeFunction", arguments.toMutableList(), options)
}
