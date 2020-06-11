package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CumulantGeneratingFunction
 *
 * Full name:        System`CumulantGeneratingFunction
 *
 *                   CumulantGeneratingFunction[dist, t] gives the cumulant-generating function for the distribution dist as a function of the variable t.
 *                   CumulantGeneratingFunction[dist, {t , t , …}] gives the cumulant-generating function for the multivariate distribution dist as a function of the variables t , t , … .
 * Usage:                                               1   2                                                                                                                    1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CumulantGeneratingFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/CumulantGeneratingFunction.html
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
fun cumulantGeneratingFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CumulantGeneratingFunction", arguments.toMutableList(), options)
}
