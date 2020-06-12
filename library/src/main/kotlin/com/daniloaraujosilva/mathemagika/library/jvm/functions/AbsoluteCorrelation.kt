package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AbsoluteCorrelation
 *
 * Full name:        System`AbsoluteCorrelation
 *
 *                   AbsoluteCorrelation[v , v ] gives the absolute correlation between the vectors v  and v .
 *                                        1   2                                                      1      2
 *                   AbsoluteCorrelation[m] gives the absolute correlation matrix for the matrix m.
 *                   AbsoluteCorrelation[m , m ] gives the absolute correlation matrix for the matrices m  and m .
 *                                        1   2                                                          1      2
 *                   AbsoluteCorrelation[dist] gives the absolute correlation matrix for the multivariate symbolic distribution dist.
 *                                                                    th
 * Usage:            AbsoluteCorrelation[dist, i, j] gives the (i, j)   absolute correlation for the multivariate symbolic distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AbsoluteCorrelation
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbsoluteCorrelation.html
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
fun absoluteCorrelation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbsoluteCorrelation", arguments.toMutableList(), options)
}
