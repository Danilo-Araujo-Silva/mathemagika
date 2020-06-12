package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PermutationCyclesQ
 *
 * Full name:        System`PermutationCyclesQ
 *
 * Usage:            PermutationCyclesQ[expr] returns True if expr is a permutation in disjoint cyclic form, and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PermutationCyclesQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PermutationCyclesQ.html
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
fun permutationCyclesQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PermutationCyclesQ", arguments.toMutableList(), options)
}
