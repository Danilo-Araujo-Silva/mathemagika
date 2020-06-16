package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             OperatorApplied
 *
 * Full name:        System`OperatorApplied
 *
 *                   OperatorApplied[f, n] represents an operator form of the function f of n arguments so that OperatorApplied[f, n][x ] …[x ] is equivalent to f[x , …, x ].
 *                                                                                                                                     1     n                      1      n
 *                   OperatorApplied[f] represents an operator form of the function f of two arguments so that OperatorApplied[f][y][x] is equivalent to f[x, y].
 *                   OperatorApplied[f, {i , …, i }] represents an operator form of the function f of n arguments so that OperatorApplied[f, {i , …, i }][x ] …[x ] is equivalent to f[x  , …, x  ].
 *                                        1      n                                                                                             1      n    1     n                      i       i
 *                                                                                                                                                                                       1       n
 *                   OperatorApplied[f, k  {i , …, i }] represents an operator form that takes k arguments.
 * Usage:                                     1      n
 *
 * Options:          None
 *
 *                   NHoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/OperatorApplied
 * Documentation:    web: http://reference.wolfram.com/language/ref/OperatorApplied.html
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
fun operatorApplied(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OperatorApplied", arguments.toMutableList(), options)
}
