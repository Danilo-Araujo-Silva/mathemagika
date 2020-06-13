package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PermutationReplace
 *
 * Full name:        System`PermutationReplace
 *
 *                   PermutationReplace[expr, perm] replaces each part in expr by its image under the permutation perm.
 * Usage:            PermutationReplace[expr, gr] returns the list of images of expr under all elements of the permutation group gr.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PermutationReplace
 * Documentation:    web: http://reference.wolfram.com/language/ref/PermutationReplace.html
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
fun permutationReplace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PermutationReplace", arguments.toMutableList(), options)
}
