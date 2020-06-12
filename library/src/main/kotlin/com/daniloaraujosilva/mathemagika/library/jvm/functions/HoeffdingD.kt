package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HoeffdingD
 *
 * Full name:        System`HoeffdingD
 *
 *                   HoeffdingD[v , v ] gives Hoeffding's dependence measure  for the vectors v  and v .
 *                               1   2                                                          1      2
 *                   HoeffdingD[m] gives Hoeffding's dependence measure  for the matrix m.
 *                   HoeffdingD[m , m ] gives Hoeffding's dependence measure  for the matrices m  and m .
 *                               1   2                                                           1      2
 *                   HoeffdingD[dist] gives Hoeffding's  matrix for the multivariate symbolic distribution dist.
 *                                                           th
 * Usage:            HoeffdingD[dist, i, j] gives the (i, j)   element of  for the multivariate symbolic distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HoeffdingD
 * Documentation:    web: http://reference.wolfram.com/language/ref/HoeffdingD.html
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
fun hoeffdingD(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HoeffdingD", arguments.toMutableList(), options)
}
