package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RotationMatrix
 * 
 * Full name:        System`RotationMatrix
 * 
 *                   RotationMatrix[θ] gives the 2D rotation matrix that rotates 2D vectors counterclockwise by θ radians.
 *                   RotationMatrix[θ, w] gives the 3D rotation matrix for a counterclockwise rotation around the 3D vector w.
 *                   RotationMatrix[{u, v}] gives the matrix that rotates the vector u to the direction of the vector v in any dimension.
 * Usage:            RotationMatrix[θ, {u, v}] gives the matrix that rotates by θ radians in the plane spanned by u and v.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/RotationMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/RotationMatrix.html
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
fun rotationMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RotationMatrix", arguments.toMutableList(), options)
}
