package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ChartBaseStyle
 *
 * Full name:        System`ChartBaseStyle
 *
 * Usage:            ChartBaseStyle is an option for charting functions that specifies the base style for all chart elements.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChartBaseStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChartBaseStyle.html
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
fun chartBaseStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChartBaseStyle", arguments.toMutableList(), options)
}
