package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VertexCapacity
 *
 * Full name:        System`VertexCapacity
 *
 * Usage:            VertexCapacity is an option and annotation for Graph and related functions that specifies a vertex capacity.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexCapacity
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexCapacity.html
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
fun vertexCapacity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexCapacity", arguments.toMutableList(), options)
}
