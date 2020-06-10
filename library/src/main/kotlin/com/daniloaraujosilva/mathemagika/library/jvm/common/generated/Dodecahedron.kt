package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Dodecahedron
 * 
 * Full name:        System`Dodecahedron
 * 
 *                   Dodecahedron[] represents a regular dodecahedron centered at the origin with unit edge length.
 *                   Dodecahedron[l] represents a dodecahedron with edge length l.
 *                   Dodecahedron[{θ, ϕ}, …] represents a dodecahedron rotated by an angle θ with respect to the z axis and angle ϕ with respect to the y axis.
 * Usage:            Dodecahedron[{x, y, z}, …] represents a dodecahedron centered at {x, y, z}.
 * 
 *                   VertexColors -> Automatic
 * Options:          VertexTextureCoordinates -> None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Dodecahedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/Dodecahedron.html
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
fun dodecahedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dodecahedron", arguments.toMutableList(), options)
}
