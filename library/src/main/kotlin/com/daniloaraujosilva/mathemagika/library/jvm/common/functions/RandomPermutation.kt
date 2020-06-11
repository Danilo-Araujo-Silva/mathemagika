package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RandomPermutation
 *
 * Full name:        System`RandomPermutation
 *
 *                   RandomPermutation[gr] gives a pseudorandom permutation in the permutation group gr.
 * Usage:            RandomPermutation[gr, n] gives a list of n pseudorandom permutations in the permutation group gr.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RandomPermutation
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomPermutation.html
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
fun randomPermutation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomPermutation", arguments.toMutableList(), options)
}
