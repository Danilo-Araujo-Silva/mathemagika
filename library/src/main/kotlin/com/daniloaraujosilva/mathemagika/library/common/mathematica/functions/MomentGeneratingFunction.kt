package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MomentGeneratingFunction
 *
 * Full name:        System`MomentGeneratingFunction
 *
 *                   MomentGeneratingFunction[dist, t] gives the moment-generating function for the distribution dist as a function of the variable t.
 *                   MomentGeneratingFunction[dist, {t , t , …}] gives the moment-generating function for the multivariate distribution dist as a function of the variables t , t , … .
 * Usage:                                             1   2                                                                                                                  1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MomentGeneratingFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/MomentGeneratingFunction.html
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
fun momentGeneratingFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MomentGeneratingFunction", arguments.toMutableList(), options)
}
