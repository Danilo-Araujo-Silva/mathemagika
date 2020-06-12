package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PermutationSupport
 *
 * Full name:        System`PermutationSupport
 *
 * Usage:            PermutationSupport[perm] returns the support of the permutation perm.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PermutationSupport
 * Documentation:    web: http://reference.wolfram.com/language/ref/PermutationSupport.html
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
fun permutationSupport(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PermutationSupport", arguments.toMutableList(), options)
}
