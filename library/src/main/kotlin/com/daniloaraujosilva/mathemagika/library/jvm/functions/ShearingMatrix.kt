package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ShearingMatrix
 *
 * Full name:        System`ShearingMatrix
 *
 * Usage:            ShearingMatrix[θ, v, n] gives the matrix corresponding to shearing by θ radians along the direction of the vector v, and normal to the vector n.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ShearingMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShearingMatrix.html
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
fun shearingMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShearingMatrix", arguments.toMutableList(), options)
}
