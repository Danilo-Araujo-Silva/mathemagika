package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PermutationListQ
 *
 * Full name:        System`PermutationListQ
 *
 * Usage:            PermutationListQ[expr] returns True if expr is a valid permutation list and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PermutationListQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PermutationListQ.html
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
fun permutationListQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PermutationListQ", arguments.toMutableList(), options)
}
