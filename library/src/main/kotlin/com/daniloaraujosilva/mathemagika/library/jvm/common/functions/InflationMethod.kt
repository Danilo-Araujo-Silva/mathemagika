package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InflationMethod
 *
 * Full name:        System`InflationMethod
 *
 * Usage:            InflationMethod is an option for InflationAdjust that specifies what time series data is to be used for adjustment in time.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/InflationMethod
 * Documentation:    web: http://reference.wolfram.com/language/ref/InflationMethod.html
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
fun inflationMethod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InflationMethod", arguments.toMutableList(), options)
}
