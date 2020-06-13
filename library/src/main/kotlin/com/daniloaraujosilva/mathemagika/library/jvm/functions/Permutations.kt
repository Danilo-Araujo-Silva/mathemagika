package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Permutations
 *
 * Full name:        System`Permutations
 *
 *                   Permutations[list] generates a list of all possible permutations of the elements in list.
 *                   Permutations[list, n] gives all permutations containing at most n elements.
 * Usage:            Permutations[list, {n}] gives all permutations containing exactly n elements.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Permutations
 * Documentation:    web: http://reference.wolfram.com/language/ref/Permutations.html
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
fun permutations(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Permutations", arguments.toMutableList(), options)
}
