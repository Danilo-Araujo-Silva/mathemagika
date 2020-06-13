package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AstronomicalData
 *
 * Full name:        System`AstronomicalData
 *
 *                   AstronomicalData["name", "property"] gives the value of the specified property of the astronomical object with the specified name.
 * Usage:            AstronomicalData["name", {"property", date}] gives the value of a property at a particular date and time.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AstronomicalData
 * Documentation:    web: http://reference.wolfram.com/language/ref/AstronomicalData.html
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
fun astronomicalData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AstronomicalData", arguments.toMutableList(), options)
}
