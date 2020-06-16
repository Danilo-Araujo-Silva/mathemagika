package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Polyhedron
 *
 * Full name:        System`Polyhedron
 *
 *                   Polyhedron[{f , …, f }] represents a filled polyhedron inside the closed surfaces with polygon faces f .
 *                                1      n                                                                                 i
 *                   Polyhedron[{f , …, f }  {{g , …, g }, …}] represents a polyhedron with voids {g , …, g }, ….
 *                                1      n       1      m                                            1      m
 *                   Polyhedron[{poly , poly , …}] represents a collection of polyhedra poly .
 *                                   1      2                                               i
 *                   Polyhedron[{p , …, p }, data] represents a polyhedron in which coordinates given as integers i in data are taken to be p .
 * Usage:                         1      n                                                                                                   i
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
 *                   local: paclet:ref/Polyhedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/Polyhedron.html
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
fun polyhedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Polyhedron", arguments.toMutableList(), options)
}
