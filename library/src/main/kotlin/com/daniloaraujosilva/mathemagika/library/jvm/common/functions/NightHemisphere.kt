package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NightHemisphere
 *
 * Full name:        System`NightHemisphere
 *
 *                   NightHemisphere[] is a two-dimensional GeoGraphics primitive that represents the half of the Earth currently in darkness.
 * Usage:            NightHemisphere[datespec] represents the night half of the Earth for the specified date.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NightHemisphere
 * Documentation:    web: http://reference.wolfram.com/language/ref/NightHemisphere.html
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
fun nightHemisphere(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NightHemisphere", arguments.toMutableList(), options)
}
