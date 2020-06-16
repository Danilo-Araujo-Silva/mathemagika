package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CrossingPolygon
 *
 * Full name:        System`CrossingPolygon
 *
 *                   CrossingPolygon[{p , p , …, p }] gives a Polygon representing all points for which a ray from the point in any direction in the plane crosses the line segments {p , p }, …, {p     , p }, {p , p } an odd number of times.
 *                                     1   2      n                                                                                                                                    1   2        n - 1   n     n   1
 *                   CrossingPolygon[{{p  , p  , …}, {p  , p  , …}, …}] gives a Polygon from the line segments {p  , p  }, …, {p  , p  }, ….
 * Usage:                               11   12        21   22                                                   11   12        21   22
 *
 *                   BaseStyle -> {}
 *                   DefaultBaseStyle -> {}
 *                   VertexColors -> Automatic
 *                   VertexNormals -> Automatic
 * Options:          VertexTextureCoordinates -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CrossingPolygon
 * Documentation:    web: http://reference.wolfram.com/language/ref/CrossingPolygon.html
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
fun crossingPolygon(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CrossingPolygon", arguments.toMutableList(), options)
}
