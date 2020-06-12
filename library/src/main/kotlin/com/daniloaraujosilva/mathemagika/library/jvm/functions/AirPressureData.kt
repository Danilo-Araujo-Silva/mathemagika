package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AirPressureData
 *
 * Full name:        System`AirPressureData
 *
 *                   AirPressureData[] gives the most recent measurement for air pressure near the current location.
 *                   AirPressureData[datespec] gives the air pressure value for the specified time near the current location.
 *                   AirPressureData[locationspec] gives the most recent measurement for air pressure near the specified locations.
 *                   AirPressureData[locationspec, datespec] gives the value or values for the specified date and location.
 *                   AirPressureData[{{location , date }, {location , date }, …}] gives values for all specified locations on the specified dates.
 * Usage:                                      1      1            2      2
 *
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AirPressureData
 * Documentation:    web: http://reference.wolfram.com/language/ref/AirPressureData.html
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
fun airPressureData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AirPressureData", arguments.toMutableList(), options)
}
