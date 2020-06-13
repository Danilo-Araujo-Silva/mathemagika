package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WindingPolygon
 *
 * Full name:        System`WindingPolygon
 *
 *                   WindingPolygon[{p , p , …, p }] gives a polygon representing all points for which the closed contour p , p , …, p , p  winds around at least once.
 *                                    1   2      n                                                                         1   2      n   1
 *                   WindingPolygon[{{p  , p  , …}, {p  , p  , …}, …}] gives a polygon from the closed contours p  , p  , … and p  , p  , ….
 *                                     11   12        21   22                                                    11   12         21   22
 * Usage:            WindingPolygon[…, "wrule"] uses the specified winding rule "wrule" to define the polygon.
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
 *                   local: paclet:ref/WindingPolygon
 * Documentation:    web: http://reference.wolfram.com/language/ref/WindingPolygon.html
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
fun windingPolygon(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WindingPolygon", arguments.toMutableList(), options)
}
