package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TideData
 *
 * Full name:        System`TideData
 *
 *                   TideData[spec] returns the tidal properties for a location or a set of tidal parameters.
 *                   TideData[spec, prop] returns the specified property for the location or tidal parameters indicated.
 * Usage:            TideData[spec, prop, datespec] returns the value of a specified property for a date or set of dates.
 *
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TideData
 * Documentation:    web: http://reference.wolfram.com/language/ref/TideData.html
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
fun tideData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TideData", arguments.toMutableList(), options)
}
