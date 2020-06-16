package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindPermutation
 *
 * Full name:        System`FindPermutation
 *
 *                   FindPermutation[expr] gives a permutation that produces expr by permuting Sort[expr].
 *                   FindPermutation[expr , expr ] gives a permutation that converts expr  to expr  for two expressions that differ only in the order of their arguments.
 * Usage:                                1      2                                        1        2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindPermutation
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindPermutation.html
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
fun findPermutation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindPermutation", arguments.toMutableList(), options)
}
