package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Normalize
 *
 * Full name:        System`Normalize
 *
 *                   Normalize[v] gives the normalized form of a vector v.
 *                   Normalize[z] gives the normalized form of a complex number z.
 * Usage:            Normalize[expr, f] normalizes with respect to the norm function f.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Normalize
 * Documentation:    web: http://reference.wolfram.com/language/ref/Normalize.html
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
fun normalize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Normalize", arguments.toMutableList(), options)
}
