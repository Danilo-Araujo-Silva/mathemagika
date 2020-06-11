package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PermutationList
 *
 * Full name:        System`PermutationList
 *
 *                   PermutationList[perm] returns a permutation list representation of permutation perm.
 * Usage:            PermutationList[perm, len] returns a permutation list of length len.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PermutationList
 * Documentation:    web: http://reference.wolfram.com/language/ref/PermutationList.html
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
fun permutationList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PermutationList", arguments.toMutableList(), options)
}
