package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GreaterTilde
 *
 * Full name:        System`GreaterTilde
 *
 * Usage:            GreaterTilde[x, y, …] displays as x ≳ y ≳ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/GreaterTilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/GreaterTilde.html
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
fun greaterTilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GreaterTilde", arguments.toMutableList(), options)
}
