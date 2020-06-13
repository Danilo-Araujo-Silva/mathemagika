package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TravelMethod
 *
 * Full name:        System`TravelMethod
 *
 * Usage:            TravelMethod is an option for TravelDirections and related functions that specifies the mode of transportation to assume.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TravelMethod
 * Documentation:    web: http://reference.wolfram.com/language/ref/TravelMethod.html
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
fun travelMethod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TravelMethod", arguments.toMutableList(), options)
}
