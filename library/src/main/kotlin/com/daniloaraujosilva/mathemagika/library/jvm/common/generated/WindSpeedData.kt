package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             WindSpeedData
 * 
 * Full name:        System`WindSpeedData
 * 
 *                   WindSpeedData[] gives the most recent measurement for wind speed near the current location.
 *                   WindSpeedData[datespec] gives the wind speed value for the specified time near the current location.
 *                   WindSpeedData[locationspec] gives the most recent measurement for wind speed near the specified location.
 *                   WindSpeedData[locationspec, datespec] gives the value or values for the specified date and location.
 *                   WindSpeedData[{{location , date }, {location , date }, …}] gives values for all specified locations on the specified dates.
 * Usage:                                    1      1            2      2
 * 
 * Options:          UnitSystem :> $UnitSystem
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/WindSpeedData
 * Documentation:    web: http://reference.wolfram.com/language/ref/WindSpeedData.html
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
fun windSpeedData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WindSpeedData", arguments.toMutableList(), options)
}
