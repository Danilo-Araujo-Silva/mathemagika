package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EqualTilde
 *
 * Full name:        System`EqualTilde
 *
 * Usage:            EqualTilde[x, y, …] displays as x ≂ y ≂ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/EqualTilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/EqualTilde.html
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
fun equalTilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EqualTilde", arguments.toMutableList(), options)
}
