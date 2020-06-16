package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DateTicksFormat
 *
 * Full name:        System`DateTicksFormat
 *
 * Usage:            DateTicksFormat is an option for DateListPlot which specifies how date tick labels should be formatted.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DateTicksFormat
 * Documentation:    web: http://reference.wolfram.com/language/ref/DateTicksFormat.html
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
fun dateTicksFormat(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DateTicksFormat", arguments.toMutableList(), options)
}
