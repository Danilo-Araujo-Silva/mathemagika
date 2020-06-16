package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GoodmanKruskalGamma
 *
 * Full name:        System`GoodmanKruskalGamma
 *
 *                   GoodmanKruskalGamma[v , v ] gives the Goodman–Kruskal γ coefficient for the vectors v  and v .
 *                                        1   2                                                           1      2
 *                   GoodmanKruskalGamma[m] gives the Goodman–Kruskal γ coefficients for the matrix m.
 *                   GoodmanKruskalGamma[m , m ] gives the Goodman–Kruskal γ coefficients for the matrices m  and m .
 *                                        1   2                                                             1      2
 *                   GoodmanKruskalGamma[dist] gives the γ coefficient matrix for the multivariate symbolic distribution dist.
 *                                                                    th
 * Usage:            GoodmanKruskalGamma[dist, i, j] gives the (i, j)   γ coefficient for the multivariate symbolic distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GoodmanKruskalGamma
 * Documentation:    web: http://reference.wolfram.com/language/ref/GoodmanKruskalGamma.html
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
fun goodmanKruskalGamma(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GoodmanKruskalGamma", arguments.toMutableList(), options)
}
