package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OrderedQ
 *
 * Full name:        System`OrderedQ
 *
 *                   OrderedQ[h[e , e , …]] gives True if the e  are in canonical order, and False otherwise.
 * Usage:                        1   2                         i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OrderedQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/OrderedQ.html
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
fun orderedQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OrderedQ", arguments.toMutableList(), options)
}
