package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WindDirectionData
 *
 * Full name:        System`WindDirectionData
 *
 *                   WindDirectionData[] gives the most recent measurement for wind direction near the current location.
 *                   WindDirectionData[datespec] gives the wind direction value for the specified time near the current location.
 *                   WindDirectionData[locationspec] gives the most recent measurement for wind direction near the specified location.
 *                   WindDirectionData[locationspec, datespec] gives the value or values for the specified date and location.
 *                   WindDirectionData[{{location , date }, {location , date }, …}] gives values for all specified locations on the specified dates.
 * Usage:                                        1      1            2      2
 *
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WindDirectionData
 * Documentation:    web: http://reference.wolfram.com/language/ref/WindDirectionData.html
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
fun windDirectionData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WindDirectionData", arguments.toMutableList(), options)
}
