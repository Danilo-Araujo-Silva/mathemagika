package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AirTemperatureData
 *
 * Full name:        System`AirTemperatureData
 *
 *                   AirTemperatureData[] gives the most recent measurement for air temperature near the current location.
 *                   AirTemperatureData[datespec] gives the air temperature value for the specified time near the current location.
 *                   AirTemperatureData[locationspec] gives the most recent measurement for air temperature near the specified location.
 *                   AirTemperatureData[locationspec, datespec] gives the value or values for the specified date and location.
 *                   AirTemperatureData[{{location , date }, {location , date }, …}] gives values for all specified locations on the specified dates.
 * Usage:                                         1      1            2      2
 *
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AirTemperatureData
 * Documentation:    web: http://reference.wolfram.com/language/ref/AirTemperatureData.html
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
fun airTemperatureData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AirTemperatureData", arguments.toMutableList(), options)
}
