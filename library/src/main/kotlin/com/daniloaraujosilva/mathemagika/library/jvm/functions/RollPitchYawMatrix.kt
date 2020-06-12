package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RollPitchYawMatrix
 *
 * Full name:        System`RollPitchYawMatrix
 *
 *                   RollPitchYawMatrix[{α, β, γ}] gives the 3D rotation matrix formed by rotating by α around the initial z axis, then by β around the initial y axis, and then by γ around the initial x axis.
 * Usage:            RollPitchYawMatrix[{α, β, γ}, {a, b, c}] gives the 3D rotation matrix formed by rotating by α around the fixed a axis, then by β around the fixed b axis, and then by γ around the fixed c axis.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RollPitchYawMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/RollPitchYawMatrix.html
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
fun rollPitchYawMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RollPitchYawMatrix", arguments.toMutableList(), options)
}
