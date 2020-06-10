package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DateBounds
 * 
 * Full name:        System`DateBounds
 * 
 *                   DateBounds[{date , date , …}] gives the earliest and latest of the date .
 *                                   1      2                                               i
 *                   DateBounds[tseries] gives the first and last dates in the time series tseries.
 *                   DateBounds[bin] gives the first and last time stamps in the databin bin.
 *                   DateBounds[interval] gives the start and end dates of the date interval interval.
 * Usage:            DateBounds[interval, gran] gives the endpoints of interval in the specified granularity gran.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DateBounds
 * Documentation:    web: http://reference.wolfram.com/language/ref/DateBounds.html
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
fun dateBounds(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DateBounds", arguments.toMutableList(), options)
}
