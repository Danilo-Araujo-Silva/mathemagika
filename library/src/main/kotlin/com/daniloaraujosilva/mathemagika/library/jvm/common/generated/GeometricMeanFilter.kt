package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GeometricMeanFilter
 * 
 * Full name:        System`GeometricMeanFilter
 * 
 *                   GeometricMeanFilter[data, r] filters data by replacing every value by the geometric mean value in its range-r neighborhood.
 *                                                                                      th
 *                   GeometricMeanFilter[data, {r , r , …}] uses r  for filtering the i  dimension in data.
 * Usage:                                        1   2            i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GeometricMeanFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeometricMeanFilter.html
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
fun geometricMeanFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeometricMeanFilter", arguments.toMutableList(), options)
}
