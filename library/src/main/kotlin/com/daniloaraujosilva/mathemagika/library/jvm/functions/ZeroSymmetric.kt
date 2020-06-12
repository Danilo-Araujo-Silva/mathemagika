package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ZeroSymmetric
 *
 * Full name:        System`ZeroSymmetric
 *
 *                   ZeroSymmetric[{s , …, s }] represents the symmetry of a zero tensor in the slots s .
 * Usage:                            1      n                                                          i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ZeroSymmetric
 * Documentation:    web: http://reference.wolfram.com/language/ref/ZeroSymmetric.html
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
fun zeroSymmetric(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ZeroSymmetric", arguments.toMutableList(), options)
}
