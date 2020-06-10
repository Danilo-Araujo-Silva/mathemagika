package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TimeSeriesMap
 * 
 * Full name:        System`TimeSeriesMap
 * 
 * Usage:            TimeSeriesMap[f, tseries] applies f to the values in tseries.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TimeSeriesMap
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeSeriesMap.html
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
fun timeSeriesMap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeSeriesMap", arguments.toMutableList(), options)
}
