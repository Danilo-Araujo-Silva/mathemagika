package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RollPitchYawAngles
 *
 * Full name:        System`RollPitchYawAngles
 *
 *                   RollPitchYawAngles[r] gives the roll-pitch-yaw angles {α, β, γ} corresponding to the rotation matrix r.
 * Usage:            RollPitchYawAngles[r, {a, b, c}] gives the roll-pitch-yaw angles {α, β, γ} corresponding to rotation order {a, b, c}.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RollPitchYawAngles
 * Documentation:    web: http://reference.wolfram.com/language/ref/RollPitchYawAngles.html
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
fun rollPitchYawAngles(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RollPitchYawAngles", arguments.toMutableList(), options)
}
