package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RotationTransform
 *
 * Full name:        System`RotationTransform
 *
 *                   RotationTransform[θ] gives a TransformationFunction that represents a rotation in 2D by θ radians about the origin.
 *                   RotationTransform[θ, p] gives a 2D rotation about the 2D point p.
 *                   RotationTransform[θ, w] gives a 3D rotation around the direction of the 3D vector w.
 *                   RotationTransform[θ, w, p] gives a 3D rotation around the axis w anchored at the point p.
 *                   RotationTransform[{u, v}] gives a rotation about the origin that transforms the vector u to the direction of the vector v.
 *                   RotationTransform[{u, v}, p] gives a rotation about the point p that transforms u to the direction of v.
 * Usage:            RotationTransform[θ, {u, v}, …] gives a rotation by θ radians in the plane spanned by u and v.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RotationTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/RotationTransform.html
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
fun rotationTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RotationTransform", arguments.toMutableList(), options)
}
