package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FactorialMomentGeneratingFunction
 *
 * Full name:        System`FactorialMomentGeneratingFunction
 *
 *                   FactorialMomentGeneratingFunction[dist, t] gives the factorial moment-generating function for the distribution dist as a function of the variable t.
 *                   FactorialMomentGeneratingFunction[dist, {t , t , …}] gives the factorial moment-generating function for the multivariate distribution dist as a function of the variables t , t , ….
 * Usage:                                                      1   2                                                                                                                            1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FactorialMomentGeneratingFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/FactorialMomentGeneratingFunction.html
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
fun factorialMomentGeneratingFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FactorialMomentGeneratingFunction", arguments.toMutableList(), options)
}
