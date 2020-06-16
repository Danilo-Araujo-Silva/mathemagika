package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RandomFunction
 *
 * Full name:        System`RandomFunction
 *
 *                   RandomFunction[proc, {t   , t   }] generates a pseudorandom function from the process proc from t    to t   .
 *                                          min   max                                                                 min     max
 *                   RandomFunction[proc, {t   , t   , dt}] generates a pseudorandom function from t    to t    in steps of dt.
 *                                          min   max                                               min     max
 * Usage:            RandomFunction[proc, …, n] generates an ensemble of n pseudorandom functions.
 *
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RandomFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomFunction.html
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
fun randomFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomFunction", arguments.toMutableList(), options)
}
