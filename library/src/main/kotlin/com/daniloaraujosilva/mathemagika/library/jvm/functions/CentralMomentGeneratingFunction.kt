package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CentralMomentGeneratingFunction
 *
 * Full name:        System`CentralMomentGeneratingFunction
 *
 *                   CentralMomentGeneratingFunction[dist, t] gives the central moment-generating function for the distribution dist as a function of the variable t.
 *                   CentralMomentGeneratingFunction[dist, {t , t , …}] gives the central moment-generating function for the multivariate distribution dist as a function of the variables t , t , ….
 * Usage:                                                    1   2                                                                                                                          1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CentralMomentGeneratingFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/CentralMomentGeneratingFunction.html
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
fun centralMomentGeneratingFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CentralMomentGeneratingFunction", arguments.toMutableList(), options)
}
