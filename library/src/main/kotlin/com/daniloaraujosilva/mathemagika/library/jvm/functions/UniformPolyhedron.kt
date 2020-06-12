package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UniformPolyhedron
 *
 * Full name:        System`UniformPolyhedron
 *
 *                   UniformPolyhedron["name"] gives the uniform polyhedron with the given name.
 *                   UniformPolyhedron[{n, m}] gives the uniform polyhedron with n sides of each face and m faces meeting at each vertex point.
 *                   UniformPolyhedron[{r, θ, ϕ}, …] rescales the uniform polyhedron by a factor r and rotates by an angle θ with respect to the z axis and angle ϕ with respect to the y axis.
 * Usage:            UniformPolyhedron[{x, y, z}, {r, θ, ϕ}, …] centers the uniform polyhedron at {x, y, z}.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UniformPolyhedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/UniformPolyhedron.html
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
fun uniformPolyhedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UniformPolyhedron", arguments.toMutableList(), options)
}
