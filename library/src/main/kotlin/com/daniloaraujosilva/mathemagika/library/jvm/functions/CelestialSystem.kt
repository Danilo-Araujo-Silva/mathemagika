package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CelestialSystem
 *
 * Full name:        System`CelestialSystem
 *
 * Usage:            CelestialSystem is an option for SunPosition, MoonPosition, and related functions that specifies the coordinate system to use for the results.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CelestialSystem
 * Documentation:    web: http://reference.wolfram.com/language/ref/CelestialSystem.html
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
fun celestialSystem(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CelestialSystem", arguments.toMutableList(), options)
}
