package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PermutationGroup
 *
 * Full name:        System`PermutationGroup
 *
 *                   PermutationGroup[{perm , …, perm }] represents the group generated by multiplication of the permutations perm , …, perm .
 * Usage:                                  1         n                                                                            1         n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PermutationGroup
 * Documentation:    web: http://reference.wolfram.com/language/ref/PermutationGroup.html
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
fun permutationGroup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PermutationGroup", arguments.toMutableList(), options)
}
