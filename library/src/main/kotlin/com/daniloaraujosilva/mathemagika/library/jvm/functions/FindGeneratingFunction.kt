package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindGeneratingFunction
 *
 * Full name:        System`FindGeneratingFunction
 *
 *                                                                                                                     th
 *                   FindGeneratingFunction[{a , a , …}, x] attempts to find a simple generating function in x whose n   series coefficient is a .
 *                                            0   1                                                                                              n
 *                                                                                                                             th
 *                   FindGeneratingFunction[{{n , a }, {n , a }, …}, x] attempts to find a simple generating function whose n    series coefficient is a .
 * Usage:                                      0   0     1   1                                                               i                           i
 *
 *                   FunctionSpace -> Automatic
 *                   Method -> Automatic
 *                   TimeConstraint -> 10
 * Options:          ValidationLength -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindGeneratingFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindGeneratingFunction.html
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
fun findGeneratingFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindGeneratingFunction", arguments.toMutableList(), options)
}
