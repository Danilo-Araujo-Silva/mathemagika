package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ScalingMatrix
 *
 * Full name:        System`ScalingMatrix
 *
 *                   ScalingMatrix[{s , s , …}] gives the matrix corresponding to scaling by a factor s  along each coordinate axis.
 *                                   x   y                                                             i
 * Usage:            ScalingMatrix[s, v] gives the matrix corresponding to scaling by a factor s along the direction of the vector v.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ScalingMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScalingMatrix.html
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
fun scalingMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScalingMatrix", arguments.toMutableList(), options)
}
