package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InflationAdjust
 *
 * Full name:        System`InflationAdjust
 *
 *                   InflationAdjust[quantity, targetdate] attempts to adjust the specified quantity purchasing power to targetdate.
 *                   InflationAdjust[quantity] uses the current year as targetdate.
 *                   InflationAdjust[quantity, targetunit] converts the currency to targetunit after adjusting to the current year.
 * Usage:            InflationAdjust[timeseries, targetdate] attempts to adjust the specified timeseries data purchasing power to targetdate.
 *
 * Options:          InflationMethod -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InflationAdjust
 * Documentation:    web: http://reference.wolfram.com/language/ref/InflationAdjust.html
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
fun inflationAdjust(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InflationAdjust", arguments.toMutableList(), options)
}
