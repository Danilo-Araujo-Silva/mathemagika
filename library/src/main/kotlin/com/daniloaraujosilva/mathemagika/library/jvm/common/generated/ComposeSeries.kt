package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ComposeSeries
 * 
 * Full name:        System`ComposeSeries
 * 
 *                   ComposeSeries[series , series , …] composes several power series. 
 * Usage:                                1        2
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ComposeSeries
 * Documentation:    web: http://reference.wolfram.com/language/ref/ComposeSeries.html
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
fun composeSeries(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ComposeSeries", arguments.toMutableList(), options)
}
