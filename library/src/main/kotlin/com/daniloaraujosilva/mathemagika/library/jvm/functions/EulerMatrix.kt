package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EulerMatrix
 *
 * Full name:        System`EulerMatrix
 *
 *                   EulerMatrix[{α, β, γ}] gives the Euler 3D rotation matrix formed by rotating by α around the current z axis, then by β around the current y axis, and then by γ around the current z axis.
 * Usage:            EulerMatrix[{α, β, γ}, {a, b, c}] gives the Euler 3D rotation matrix corresponding, first rotating by α around the current a axis, then by β around the current b axis, and finally by γ around the current c axis.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EulerMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/EulerMatrix.html
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
fun eulerMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EulerMatrix", arguments.toMutableList(), options)
}
