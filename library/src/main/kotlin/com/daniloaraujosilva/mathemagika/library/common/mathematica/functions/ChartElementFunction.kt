package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ChartElementFunction
 *
 * Full name:        System`ChartElementFunction
 *
 * Usage:            ChartElementFunction is an option for charting functions such as BarChart that gives a function to use to generate the primitives for rendering each chart element.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChartElementFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChartElementFunction.html
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
fun chartElementFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChartElementFunction", arguments.toMutableList(), options)
}
