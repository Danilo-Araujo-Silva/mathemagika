package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GroupStabilizer
 *
 * Full name:        System`GroupStabilizer
 *
 *                   GroupStabilizer[group, {p , …, p }] returns the subgroup of elements of group that move none of the points p , …, p .
 *                                            1      n                                                                           1      n
 *                   GroupStabilizer[group, {p , …, p }, f] returns the stabilizer subgroup under the action given by the function f.
 * Usage:                                     1      n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GroupStabilizer
 * Documentation:    web: http://reference.wolfram.com/language/ref/GroupStabilizer.html
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
fun groupStabilizer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GroupStabilizer", arguments.toMutableList(), options)
}
