package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CurryApplied
 *
 * Full name:        System`CurryApplied
 *
 *                   CurryApplied[f, n] represents an operator form of the function f of n arguments so that CurryApplied[f, n][x ] …[x ] is equivalent to f[x , …, x ].
 *                                                                                                                               1     n                      1      n
 *                   CurryApplied[n] represents an operator form of CurryApplied that can be applied to a function to represent an operator form with n arguments.
 *                   CurryApplied[f, {i , …, i }] represents an operator form of the function f of n arguments so that CurryApplied[f, {i , …, i }][x ] …[x ] is equivalent to f[x  , …, x  ].
 *                                     1      n                                                                                          1      n    1     n                      i       i
 *                                                                                                                                                                                 1       n
 *                   CurryApplied[f, k  {i , …, i }] represents an operator form that takes k arguments.
 * Usage:                                  1      n
 *
 * Options:          None
 *
 *                   NHoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CurryApplied
 * Documentation:    web: http://reference.wolfram.com/language/ref/CurryApplied.html
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
fun curryApplied(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CurryApplied", arguments.toMutableList(), options)
}
