package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Polygon
 *
 * Full name:        System`Polygon
 *
 *                   Polygon[{p , …, p }] represents a filled polygon with points p .
 *                             1      n                                            i
 *                   Polygon[{p , …, p }  {{q , …, q }, …}] represents a polygon with holes {q , …, q }, ….
 *                             1      n       1      m                                         1      m
 *                   Polygon[{poly , poly , …}] represents a collection of polygons poly .
 *                                1      2                                              i
 *                   Polygon[{p , …, p }, data] represents a polygon in which coordinates given as integers i in data are taken to be p .
 * Usage:                      1      n                                                                                                i
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
 *                   local: paclet:ref/Polygon
 * Documentation:    web: http://reference.wolfram.com/language/ref/Polygon.html
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
fun polygon(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Polygon", arguments.toMutableList(), options)
}
