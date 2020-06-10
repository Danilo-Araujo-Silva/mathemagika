package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HistoricalPeriodData
 * 
 * Full name:        System`HistoricalPeriodData
 * 
 *                   HistoricalPeriodData[entity, property] gives the value of the specified property for the historical period entity.
 *                   HistoricalPeriodData[{entity , entity , …}, property] gives a list of property values for the specified historical period entities.
 *                                               1        2
 * Usage:            HistoricalPeriodData[entity, property, annotation] gives the specified annotation associated with the given property.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/HistoricalPeriodData
 * Documentation:    web: http://reference.wolfram.com/language/ref/HistoricalPeriodData.html
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
fun historicalPeriodData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HistoricalPeriodData", arguments.toMutableList(), options)
}
