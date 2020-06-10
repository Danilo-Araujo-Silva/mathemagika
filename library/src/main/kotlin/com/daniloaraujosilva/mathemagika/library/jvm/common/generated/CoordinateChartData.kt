package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CoordinateChartData
 * 
 * Full name:        System`CoordinateChartData
 * 
 *                   CoordinateChartData[chart, property] gives the value of the specified property for chart.
 *                   CoordinateChartData[chart, property, {x , x , …, x }] gives the value of the specified property for chart evaluated at the point {x , x , …, x }.
 * Usage:                                                   1   2      n                                                                                1   2      n
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CoordinateChartData
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoordinateChartData.html
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
fun coordinateChartData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoordinateChartData", arguments.toMutableList(), options)
}
