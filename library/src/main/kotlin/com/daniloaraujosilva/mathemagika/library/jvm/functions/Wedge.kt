package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Wedge
 *
 * Full name:        System`Wedge
 *
 * Usage:            Wedge[x, y, …] displays as x ⋀ y ⋀ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Wedge
 * Documentation:    web: http://reference.wolfram.com/language/ref/Wedge.html
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
fun wedge(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Wedge", arguments.toMutableList(), options)
}
