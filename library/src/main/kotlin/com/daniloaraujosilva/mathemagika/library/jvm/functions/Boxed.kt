package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Boxed
 *
 * Full name:        System`Boxed
 *
 * Usage:            Boxed is an option for Graphics3D that specifies whether to draw the edges of the bounding box in a three‐dimensional picture.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Boxed
 * Documentation:    web: http://reference.wolfram.com/language/ref/Boxed.html
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
fun boxed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Boxed", arguments.toMutableList(), options)
}
