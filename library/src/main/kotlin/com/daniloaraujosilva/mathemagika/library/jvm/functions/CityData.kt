package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CityData
 *
 * Full name:        System`CityData
 *
 *                   CityData[name, "property"] gives the value of the specified property for the city with the specified name.
 * Usage:            CityData[name] gives a list of the full specifications of cities whose names are consistent with name.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CityData
 * Documentation:    web: http://reference.wolfram.com/language/ref/CityData.html
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
fun cityData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CityData", arguments.toMutableList(), options)
}
