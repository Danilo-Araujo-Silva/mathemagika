package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Cube
 *
 * Full name:        System`Cube
 *
 *                   Cube[] represents a regular cube centered at the origin with unit edge length.
 *                   Cube[l] represents a cube with edge length l.
 *                   Cube[{θ, ϕ}, …] represents a cube rotated by an angle θ with respect to the z axis and angle ϕ with respect to the y axis.
 * Usage:            Cube[{x, y, z}, …] represents a cube centered at {x, y, z}.
 *
 *                   VertexColors -> Automatic
 * Options:          VertexTextureCoordinates -> None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Cube
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cube.html
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
fun cube(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cube", arguments.toMutableList(), options)
}
