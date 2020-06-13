package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EulerAngles
 *
 * Full name:        System`EulerAngles
 *
 *                   EulerAngles[r] gives Euler angles {α, β, γ} corresponding to the rotation matrix r.
 * Usage:            EulerAngles[r, {a, b, c}] gives Euler angles {α, β, γ} with rotation order {a, b, c}.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EulerAngles
 * Documentation:    web: http://reference.wolfram.com/language/ref/EulerAngles.html
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
fun eulerAngles(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EulerAngles", arguments.toMutableList(), options)
}
