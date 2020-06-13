package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             KendallTau
 *
 * Full name:        System`KendallTau
 *
 *                   KendallTau[v , v ] gives Kendall's rank correlation coefficient τ for the vectors v  and v .
 *                               1   2                                                                  1      2
 *                   KendallTau[m] gives Kendall's rank correlation coefficients τ for the matrix m.
 *                   KendallTau[m , m ] gives Kendall's rank correlation coefficients τ for the matrices m  and m .
 *                               1   2                                                                    1      2
 *                   KendallTau[dist] gives Kendall's rank correlation matrix for the multivariate symbolic distribution dist.
 *                                                           th
 * Usage:            KendallTau[dist, i, j] gives the (i, j)   Kendall rank correlation for the multivariate symbolic distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KendallTau
 * Documentation:    web: http://reference.wolfram.com/language/ref/KendallTau.html
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
fun kendallTau(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KendallTau", arguments.toMutableList(), options)
}
