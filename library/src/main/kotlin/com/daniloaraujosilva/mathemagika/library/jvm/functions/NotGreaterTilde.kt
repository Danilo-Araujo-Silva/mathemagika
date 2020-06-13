package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NotGreaterTilde
 *
 * Full name:        System`NotGreaterTilde
 *
 * Usage:            NotGreaterTilde[x, y, …] displays as x ≵ y ≵ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotGreaterTilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotGreaterTilde.html
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
fun notGreaterTilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotGreaterTilde", arguments.toMutableList(), options)
}
