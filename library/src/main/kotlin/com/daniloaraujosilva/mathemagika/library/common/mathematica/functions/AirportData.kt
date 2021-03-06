package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AirportData
 *
 * Full name:        System`AirportData
 *
 *                   AirportData[entity, property] gives the value of the specified property for the airport entity.
 *                   AirportData[{entity , entity , …}, property] gives a list of property values for the specified airport entities.
 *                                      1        2
 * Usage:            AirportData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AirportData
 * Documentation:    web: http://reference.wolfram.com/language/ref/AirportData.html
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
fun airportData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AirportData", arguments.toMutableList(), options)
}
