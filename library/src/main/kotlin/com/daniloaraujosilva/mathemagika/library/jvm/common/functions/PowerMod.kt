package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PowerMod
 *
 * Full name:        System`PowerMod
 *
 *                                            b
 *                   PowerMod[a, b, m] gives a  mod m.
 *                   PowerMod[a, -1, m] finds the modular inverse of a modulo m.
 *                                                         th
 * Usage:            PowerMod[a, 1/r, m] finds a modular r   root of a.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PowerMod
 * Documentation:    web: http://reference.wolfram.com/language/ref/PowerMod.html
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
fun powerMod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PowerMod", arguments.toMutableList(), options)
}
