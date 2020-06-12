package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LengthWhile
 *
 * Full name:        System`LengthWhile
 *
 *                   LengthWhile[list, crit] gives the number of contiguous elements e  starting at the beginning of list for which crit[e ] is True.
 * Usage:                                                                             i                                                   i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LengthWhile
 * Documentation:    web: http://reference.wolfram.com/language/ref/LengthWhile.html
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
fun lengthWhile(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LengthWhile", arguments.toMutableList(), options)
}
