package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FullGraphics
 *
 * Full name:        System`FullGraphics
 *
 * Usage:            FullGraphics[g] takes a graphics object, and generates a new one in which objects specified by graphics options are given as explicit lists of graphics primitives.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FullGraphics
 * Documentation:    web: http://reference.wolfram.com/language/ref/FullGraphics.html
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
fun fullGraphics(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FullGraphics", arguments.toMutableList(), options)
}
