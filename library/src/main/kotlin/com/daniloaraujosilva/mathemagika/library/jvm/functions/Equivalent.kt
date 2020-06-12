package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Equivalent
 *
 * Full name:        System`Equivalent
 *
 *                   Equivalent[e , e , …] represents the logical equivalence e  ⇔ e  ⇔ …, giving True when all of the e  are the same.
 * Usage:                        1   2                                         1    2                                   i
 *
 * Options:          None
 *
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Equivalent
 * Documentation:    web: http://reference.wolfram.com/language/ref/Equivalent.html
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
fun equivalent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Equivalent", arguments.toMutableList(), options)
}
