package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Correlation
 *
 * Full name:        System`Correlation
 *
 *                   Correlation[v , v ] gives the correlation between the vectors v  and v .
 *                                1   2                                             1      2
 *                   Correlation[m] gives the correlation matrix for the matrix m.
 *                   Correlation[m , m ] gives the correlation matrix for the matrices m  and m .
 *                                1   2                                                 1      2
 *                   Correlation[dist] gives the correlation matrix for the multivariate symbolic distribution dist.
 *                                                            th
 * Usage:            Correlation[dist, i, j] gives the (i, j)   correlation for the multivariate symbolic distribution dist.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Correlation
 * Documentation:    web: http://reference.wolfram.com/language/ref/Correlation.html
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
fun correlation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Correlation", arguments.toMutableList(), options)
}
