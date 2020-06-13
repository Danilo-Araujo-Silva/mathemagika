package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NotTilde
 *
 * Full name:        System`NotTilde
 *
 * Usage:            NotTilde[x, y, …] displays as x ≁ y ≁ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotTilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotTilde.html
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
fun notTilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotTilde", arguments.toMutableList(), options)
}
