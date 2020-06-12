package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PowerModList
 *
 * Full name:        System`PowerModList
 *
 *                                                                                     r    s
 * Usage:            PowerModList[a, s/r, m] gives a list of all x modulo m for which x  ≡ a  mod m.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PowerModList
 * Documentation:    web: http://reference.wolfram.com/language/ref/PowerModList.html
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
fun powerModList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PowerModList", arguments.toMutableList(), options)
}
