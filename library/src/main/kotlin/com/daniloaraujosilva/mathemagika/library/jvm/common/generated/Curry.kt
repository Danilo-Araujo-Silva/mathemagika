package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Curry
 * 
 * Full name:        System`Curry
 * 
 *                   Curry[f, n] represents an operator form of the function f of n arguments so that Curry[f, n][x ] …[x ] is equivalent to f[x , …, x ].
 *                                                                                                                 1     n                      1      n
 *                   Curry[f] represents an operator form of the function f of two arguments so that Curry[f][y][x] is equivalent to f[x, y].
 *                   Curry[f, {i , …, i }] represents an operator form of the function f of n arguments so that Curry[f, {i , …, i }][x ] …[x ] is equivalent to f[x  , …, x  ].
 *                              1      n                                                                                   1      n    1     n                      i       i
 *                                                                                                                                                                   1       n
 *                   Curry[f, k  {i , …, i }] represents a k-arguments operator form of the function f of n arguments so that Curry[f, k  {i , …, i }][x ] …[x ] is equivalent to f[x  , …, x  ], with k ≥ Max[{i , …, i }].
 *                                  1      n                                                                                                  1      n    1     k                      i       i                   1      n
 * Usage:                                                                                                                                                                               1       n
 * 
 * Options:          None
 * 
 *                   NHoldRest
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Curry
 * Documentation:    web: http://reference.wolfram.com/language/ref/Curry.html
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
fun curry(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Curry", arguments.toMutableList(), options)
}
