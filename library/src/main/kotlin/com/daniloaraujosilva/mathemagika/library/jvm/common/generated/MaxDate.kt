package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MaxDate
 * 
 * Full name:        System`MaxDate
 * 
 *                   MaxDate[{date , date , …}] gives the latest date of the date .
 *                                1      2                                       i
 *                   MaxDate[interval] gives the endpoint of the date interval interval.
 * Usage:            MaxDate[interval, gran] gives the endpoint of interval as specified by granularity gran.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MaxDate
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxDate.html
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
fun maxDate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxDate", arguments.toMutableList(), options)
}
