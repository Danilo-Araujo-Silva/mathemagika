package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LightingAngle
 *
 * Full name:        System`LightingAngle
 *
 * Usage:            LightingAngle is an option for ReliefPlot and related functions that specifies the angle from which simulated illumination is taken to come.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LightingAngle
 * Documentation:    web: http://reference.wolfram.com/language/ref/LightingAngle.html
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
fun lightingAngle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LightingAngle", arguments.toMutableList(), options)
}
