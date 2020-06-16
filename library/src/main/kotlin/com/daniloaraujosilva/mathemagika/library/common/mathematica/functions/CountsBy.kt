package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CountsBy
 *
 * Full name:        System`CountsBy
 *
 *                   CountsBy[{e , e , …}, f] gives an association whose keys are the distinct values of the f[e ], and whose values give the number of times these f[e ] values appear.
 *                              1   2                                                                           i                                                      i
 * Usage:            CountsBy[f] represents an operator form of CountsBy that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CountsBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/CountsBy.html
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
fun countsBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CountsBy", arguments.toMutableList(), options)
}
