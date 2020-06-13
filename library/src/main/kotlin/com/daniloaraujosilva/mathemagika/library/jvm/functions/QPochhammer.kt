package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             QPochhammer
 *
 * Full name:        System`QPochhammer
 *
 *                   QPochhammer[a, q, n] gives the q-Pochhammer symbol (a ; q)  .
 *                                                                              n
 *                   QPochhammer[a, q] gives the q-Pochhammer symbol (a ; q) .
 *                                                                          ∞
 *                   QPochhammer[q] gives the q-Pochhammer symbol (q ; q) .
 * Usage:                                                                ∞
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/QPochhammer
 * Documentation:    web: http://reference.wolfram.com/language/ref/QPochhammer.html
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
fun qPochhammer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QPochhammer", arguments.toMutableList(), options)
}
