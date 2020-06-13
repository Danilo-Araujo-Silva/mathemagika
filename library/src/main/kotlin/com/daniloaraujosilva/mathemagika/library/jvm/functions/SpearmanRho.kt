package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SpearmanRho
 *
 * Full name:        System`SpearmanRho
 *
 *                   SpearmanRho[v , v ] gives Spearman's rank correlation coefficient ρ for the vectors v  and v .
 *                                1   2                                                                   1      2
 *                   SpearmanRho[m] gives Spearman's rank correlation coefficient ρ for the matrix m.
 *                   SpearmanRho[m , m ] gives Spearman's rank correlation coefficient ρ for the matrices m  and m .
 *                                1   2                                                                    1      2
 *                   SpearmanRho[dist] gives Spearman's rank correlation matrix for the multivariate symbolic distribution dist.
 *                                                            th
 * Usage:            SpearmanRho[dist, i, j] gives the (i, j)   Spearman rank correlation for the multivariate symbolic distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpearmanRho
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpearmanRho.html
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
fun spearmanRho(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpearmanRho", arguments.toMutableList(), options)
}
