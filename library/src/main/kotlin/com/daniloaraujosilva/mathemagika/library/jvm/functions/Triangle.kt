package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Triangle
 *
 * Full name:        System`Triangle
 *
 *                   Triangle[{p , p , p }] represents a filled triangle with corner points p , p , and p .
 *                              1   2   3                                                    1   2       3
 *                   Triangle[{{p  , p  , p  }, …}] represents a collection of triangles.
 * Usage:                        11   12   13
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
 *                   local: paclet:ref/Triangle
 * Documentation:    web: http://reference.wolfram.com/language/ref/Triangle.html
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
fun triangle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Triangle", arguments.toMutableList(), options)
}
