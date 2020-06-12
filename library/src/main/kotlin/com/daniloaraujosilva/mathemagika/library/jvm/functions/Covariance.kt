package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Covariance
 *
 * Full name:        System`Covariance
 *
 *                   Covariance[v , v ] gives the covariance between the vectors v  and v .
 *                               1   2                                            1      2
 *                   Covariance[m] gives the covariance matrix for the matrix m.
 *                   Covariance[m , m ] gives the covariance matrix for the matrices m  and m .
 *                               1   2                                                1      2
 *                   Covariance[dist] gives the covariance matrix for the multivariate symbolic distribution dist.
 *                                                           th
 * Usage:            Covariance[dist, i, j] gives the (i, j)   covariance for the multivariate symbolic distribution dist.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Covariance
 * Documentation:    web: http://reference.wolfram.com/language/ref/Covariance.html
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
fun covariance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Covariance", arguments.toMutableList(), options)
}
