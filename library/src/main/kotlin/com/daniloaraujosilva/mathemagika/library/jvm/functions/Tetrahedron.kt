package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Tetrahedron
 *
 * Full name:        System`Tetrahedron
 *
 *                   Tetrahedron[] represents a regular tetrahedron centered at the origin with unit edge length.
 *                   Tetrahedron[l] represents a tetrahedron with edge length l.
 *                   Tetrahedron[{θ, ϕ}, …] represents a tetrahedron rotated by an angle θ with respect to the z axis and angle ϕ with respect to the y axis.
 *                   Tetrahedron[{x, y, z}, …] represents a tetrahedron centered at {x, y, z}.
 *                   Tetrahedron[{p , p , p , p }] represents a general filled tetrahedron with corners p , p , p  and p .
 *                                 1   2   3   4                                                         1   2   3      4
 *                   Tetrahedron[{{p    , p    , p    , p    }, {p    , …}, …}] represents a collection of tetrahedra.
 * Usage:                           1, 1   1, 2   1, 3   1, 4     2, 1
 *
 *                   VertexColors -> Automatic
 * Options:          VertexTextureCoordinates -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Tetrahedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/Tetrahedron.html
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
fun tetrahedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Tetrahedron", arguments.toMutableList(), options)
}
