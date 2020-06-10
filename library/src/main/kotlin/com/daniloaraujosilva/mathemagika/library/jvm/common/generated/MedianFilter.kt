package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MedianFilter
 * 
 * Full name:        System`MedianFilter
 * 
 *                   MedianFilter[image, r] filters image by replacing every value by the median in its range-r neighborhood. 
 *                                                                               th
 *                   MedianFilter[data, {r , r , …}] uses r  for filtering the i  dimension in data.
 * Usage:                                 1   2            i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MedianFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/MedianFilter.html
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
fun medianFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MedianFilter", arguments.toMutableList(), options)
}
