package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ArgumentCountQ
 *
 * Full name:        System`ArgumentCountQ
 *
 *                   ArgumentCountQ[head, len, min, max] tests whether the number len of arguments of a function head is between min and max.
 *                   ArgumentCountQ[head, len, {m , m , …, m }] tests whether the number len of arguments of a function head is one of the m .
 * Usage:                                        1   2      i                                                                               i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun argumentCountQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArgumentCountQ", arguments.toMutableList(), options)
}
