package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Rotate
 *
 * Full name:        System`Rotate
 *
 *                   Rotate[g, θ] represents 2D graphics primitives or any other objects g rotated counterclockwise by θ radians about the center of their bounding box.
 *                   Rotate[g, θ, {x, y}] rotates about the point {x, y}.
 *                   Rotate[g, {u, v}] rotates around the origin, transforming the 2D or 3D vector u to v.
 *                   Rotate[g, θ, w] rotates 3D graphics primitives by θ radians around the 3D vector w anchored at the origin.
 *                   Rotate[g, θ, w, p] rotates around the 3D vector w anchored at p.
 * Usage:            Rotate[g, θ, {u, v}] rotates by angle θ in the plane spanned by 3D vectors u and v.
 *
 *                   BaseStyle -> {}
 * Options:          DefaultBaseStyle -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Rotate
 * Documentation:    web: http://reference.wolfram.com/language/ref/Rotate.html
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
fun rotate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Rotate", arguments.toMutableList(), options)
}
