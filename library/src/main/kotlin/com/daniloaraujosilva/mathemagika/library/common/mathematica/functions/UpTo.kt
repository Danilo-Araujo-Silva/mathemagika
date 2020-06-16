package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             UpTo
 *
 * Full name:        System`UpTo
 *
 * Usage:            UpTo[n] is a symbolic specification that represents up to n objects or positions. If n objects or positions are available, all are used. If fewer are available, only those available are used.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UpTo
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpTo.html
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
fun upTo(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpTo", arguments.toMutableList(), options)
}
