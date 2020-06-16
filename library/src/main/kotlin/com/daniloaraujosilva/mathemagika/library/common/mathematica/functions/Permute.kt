package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Permute
 *
 * Full name:        System`Permute
 *
 *                   Permute[expr, perm] permutes the positions of the elements of expr according to the permutation perm.
 * Usage:            Permute[expr, gr] returns the list of permuted forms of expr under the elements of the permutation group gr.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Permute
 * Documentation:    web: http://reference.wolfram.com/language/ref/Permute.html
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
fun permute(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Permute", arguments.toMutableList(), options)
}
