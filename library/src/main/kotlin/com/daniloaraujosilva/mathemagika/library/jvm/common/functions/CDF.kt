package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CDF
 *
 * Full name:        System`CDF
 *
 *                   CDF[dist, x] gives the cumulative distribution function for the distribution dist evaluated at x.
 *                   CDF[dist, {x , x , …}] gives the multivariate cumulative distribution function for the distribution dist evaluated at {x , x , …}.
 *                               1   2                                                                                                       1   2
 * Usage:            CDF[dist] gives the CDF as a pure function.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CDF
 * Documentation:    web: http://reference.wolfram.com/language/ref/CDF.html
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
fun cDF(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CDF", arguments.toMutableList(), options)
}
