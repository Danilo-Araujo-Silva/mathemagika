package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VertexDataCoordinates
 *
 * Full name:        System`VertexDataCoordinates
 *
 * Usage:            VertexDataCoordinates is an option to Raster3D that determines how to map data to the displayed range.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexDataCoordinates
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexDataCoordinates.html
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
fun vertexDataCoordinates(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexDataCoordinates", arguments.toMutableList(), options)
}
