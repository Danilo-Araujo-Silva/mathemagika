package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Octahedron
 * 
 * Full name:        System`Octahedron
 * 
 *                   Octahedron[] represents a regular octahedron centered at the origin with unit edge length.
 *                   Octahedron[l] represents an octahedron with edge length l.
 *                   Octahedron[{θ, ϕ}, …] represents an octahedron rotated by an angle θ with respect to the z axis and angle ϕ with respect to the y axis.
 * Usage:            Octahedron[{x, y, z}, …] represents an octahedron centered at {x, y, z}.
 * 
 *                   VertexColors -> Automatic
 * Options:          VertexTextureCoordinates -> None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Octahedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/Octahedron.html
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
fun octahedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Octahedron", arguments.toMutableList(), options)
}
