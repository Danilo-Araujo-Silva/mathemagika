package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CharacteristicFunction
 *
 * Full name:        System`CharacteristicFunction
 *
 *                   CharacteristicFunction[dist, t] gives the characteristic function for the distribution dist as a function of the variable t.
 *                   CharacteristicFunction[dist, {t , t , …}] gives the characteristic function for the multivariate distribution dist as a function of the variables t , t , ….
 * Usage:                                           1   2                                                                                                               1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CharacteristicFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/CharacteristicFunction.html
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
fun characteristicFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CharacteristicFunction", arguments.toMutableList(), options)
}
