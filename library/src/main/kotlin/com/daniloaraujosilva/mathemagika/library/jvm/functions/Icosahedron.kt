package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Icosahedron
 *
 * Full name:        System`Icosahedron
 *
 *                   Icosahedron[] represents a regular icosahedron centered at the origin with unit edge length.
 *                   Icosahedron[l] represents an icosahedron with edge length l.
 *                   Icosahedron[{θ, ϕ}, …] represents an icosahedron rotated by an angle θ with respect to the z axis and angle ϕ with respect to the y axis.
 * Usage:            Icosahedron[{x, y, z}, …] represents an icosahedron centered at {x, y, z}.
 *
 *                   VertexColors -> Automatic
 * Options:          VertexTextureCoordinates -> None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Icosahedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/Icosahedron.html
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
fun icosahedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Icosahedron", arguments.toMutableList(), options)
}
