package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WindVectorData
 *
 * Full name:        System`WindVectorData
 *
 *                   WindVectorData[] gives the most recent weather station measurement for wind vector near the current location.
 *                   WindVectorData[datespec] gives the wind vector value for the specified time near the current location.
 *                   WindVectorData[locationspec] gives the most recent measurement for wind vector near the specified location.
 *                   WindVectorData[locationspec, datespec] gives the value or values for the specified date and location.
 *                   WindVectorData[{{location , date }, {location , date }, …}] gives values for all specified locations on the specified dates.
 * Usage:                                     1      1            2      2
 *
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WindVectorData
 * Documentation:    web: http://reference.wolfram.com/language/ref/WindVectorData.html
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
fun windVectorData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WindVectorData", arguments.toMutableList(), options)
}
