package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OverTilde
 *
 * Full name:        System`OverTilde
 *
 * Usage:            OverTilde[expr] displays with a tilde over expr.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/OverTilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/OverTilde.html
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
fun overTilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OverTilde", arguments.toMutableList(), options)
}
