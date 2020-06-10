package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PermutationMin
 * 
 * Full name:        System`PermutationMin
 * 
 * Usage:            PermutationMin[perm] returns the smallest integer moved by the permutation perm.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PermutationMin
 * Documentation:    web: http://reference.wolfram.com/language/ref/PermutationMin.html
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
fun permutationMin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PermutationMin", arguments.toMutableList(), options)
}
