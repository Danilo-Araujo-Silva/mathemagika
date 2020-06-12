package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Subsequences
 *
 * Full name:        System`Subsequences
 *
 *                   Subsequences[list] gives the list of all possible subsequences of list.
 *                   Subsequences[list, n] gives all subsequences containing at most n elements.
 *                   Subsequences[list, {n}] gives all subsequences containing exactly n elements.
 *                   Subsequences[list, {n   , n   }] gives all subsequences containing between n    and n    elements.
 *                                        min   max                                              min      max
 *                   Subsequences[list, nspec, s] limits the result to the first s subsequences.
 *                                                                           th
 * Usage:            Subsequences[list, nspec, {s}] gives if possible the s   subsequence.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Subsequences
 * Documentation:    web: http://reference.wolfram.com/language/ref/Subsequences.html
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
fun subsequences(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Subsequences", arguments.toMutableList(), options)
}
