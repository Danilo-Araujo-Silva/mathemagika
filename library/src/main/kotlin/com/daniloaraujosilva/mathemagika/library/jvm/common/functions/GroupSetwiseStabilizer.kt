package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GroupSetwiseStabilizer
 *
 * Full name:        System`GroupSetwiseStabilizer
 *
 *                   GroupSetwiseStabilizer[group, {p , …, p }] returns the subgroup of group for which the images of the points p  are still in the list {p , …, p }.
 *                                                   1      n                                                                     i                         1      n
 *                   GroupSetwiseStabilizer[group, {p , …, p }, f] returns the setwise stabilizer subgroup under the action given by the function f.
 * Usage:                                            1      n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GroupSetwiseStabilizer
 * Documentation:    web: http://reference.wolfram.com/language/ref/GroupSetwiseStabilizer.html
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
fun groupSetwiseStabilizer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GroupSetwiseStabilizer", arguments.toMutableList(), options)
}
