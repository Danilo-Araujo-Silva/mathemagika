package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Subsets
 *
 * Full name:        System`Subsets
 *
 *                   Subsets[list] gives a list of all possible subsets of list.
 *                   Subsets[list, n] gives all subsets containing at most n elements.
 *                   Subsets[list, {n}] gives all subsets containing exactly n elements.
 *                   Subsets[list, {n   , n   }] gives all subsets containing between n    and n    elements.
 *                                   min   max                                         min      max
 *                   Subsets[list, nspec, s] limits the result to the first s subsets.
 *                                                                      th
 * Usage:            Subsets[list, nspec, {s}] gives if possible the s   subset.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Subsets
 * Documentation:    web: http://reference.wolfram.com/language/ref/Subsets.html
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
fun subsets(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Subsets", arguments.toMutableList(), options)
}
