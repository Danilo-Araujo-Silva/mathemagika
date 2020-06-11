package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CountryData
 *
 * Full name:        System`CountryData
 *
 *                   CountryData["tag", property] gives the value of the specified property for the country, country-like entity, or group of countries specified by "tag".
 * Usage:            CountryData["tag", {property, …, dates}] gives time series for certain economic and other properties.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CountryData
 * Documentation:    web: http://reference.wolfram.com/language/ref/CountryData.html
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
fun countryData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CountryData", arguments.toMutableList(), options)
}
