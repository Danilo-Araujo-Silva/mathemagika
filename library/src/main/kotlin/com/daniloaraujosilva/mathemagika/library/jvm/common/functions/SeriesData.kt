package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SeriesData
 *
 * Full name:        System`SeriesData
 *
 *                   SeriesData[x, x , {a , a , …}, n   , n   , den] represents a power series in the variable x about the point x . The a  are the coefficients in the power series. The powers of (x - x ) that appear are n   /den, (n    + 1)/den, …, n   /den.
 * Usage:                           0    0   1       min   max                                                                    0       i                                                               0                   min        min               max
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SeriesData
 * Documentation:    web: http://reference.wolfram.com/language/ref/SeriesData.html
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
fun seriesData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SeriesData", arguments.toMutableList(), options)
}
