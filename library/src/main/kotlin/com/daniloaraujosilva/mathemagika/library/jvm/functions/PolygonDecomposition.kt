package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PolygonDecomposition
 *
 * Full name:        System`PolygonDecomposition
 *
 *                   PolygonDecomposition[poly] decomposes the polygon poly into a disjoint union of simpler polygons.
 * Usage:            PolygonDecomposition[poly, "type"] decomposes into polygons of the specified "type".
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PolygonDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolygonDecomposition.html
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
fun polygonDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolygonDecomposition", arguments.toMutableList(), options)
}
