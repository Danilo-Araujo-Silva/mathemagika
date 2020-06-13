package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HarmonicMeanFilter
 *
 * Full name:        System`HarmonicMeanFilter
 *
 *                   HarmonicMeanFilter[data, r] filters data by replacing every value by the harmonic mean value in its range-r neighborhood.
 *                                                                                     th
 *                   HarmonicMeanFilter[data, {r , r , …}] uses r  for filtering the i  dimension in data.
 * Usage:                                       1   2            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HarmonicMeanFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/HarmonicMeanFilter.html
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
fun harmonicMeanFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HarmonicMeanFilter", arguments.toMutableList(), options)
}
