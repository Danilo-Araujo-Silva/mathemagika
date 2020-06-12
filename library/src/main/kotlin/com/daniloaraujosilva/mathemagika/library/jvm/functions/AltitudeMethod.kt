package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AltitudeMethod
 *
 * Full name:        System`AltitudeMethod
 *
 * Usage:            AltitudeMethod is an option for SunPosition, MoonPosition, and related functions that determines whether to take atmospheric refraction into account when computing altitude.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AltitudeMethod
 * Documentation:    web: http://reference.wolfram.com/language/ref/AltitudeMethod.html
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
fun altitudeMethod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AltitudeMethod", arguments.toMutableList(), options)
}
