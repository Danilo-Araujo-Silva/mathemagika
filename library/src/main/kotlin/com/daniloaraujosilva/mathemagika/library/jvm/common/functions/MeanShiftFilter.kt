package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeanShiftFilter
 *
 * Full name:        System`MeanShiftFilter
 *
 *                   MeanShiftFilter[data, r, d] filters data by replacing every value by the mean of the pixels in a range-r neighborhood and whose value is within a distance d.
 *                                                                                     th
 *                   MeanShiftFilter[data, {r , r , …}, d] uses r  for filtering the i  dimension in data.
 * Usage:                                    1   2               i
 *
 *                   DistanceFunction -> EuclideanDistance
 * Options:          MaxIterations -> 1
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MeanShiftFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeanShiftFilter.html
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
fun meanShiftFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeanShiftFilter", arguments.toMutableList(), options)
}
