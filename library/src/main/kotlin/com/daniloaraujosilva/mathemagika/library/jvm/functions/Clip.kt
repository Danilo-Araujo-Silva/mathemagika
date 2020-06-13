package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Clip
 *
 * Full name:        System`Clip
 *
 *                   Clip[x] gives x clipped to be between -1 and +1.
 *                   Clip[x, {min, max}] gives x for min ≤ x ≤ max, min for x < min and max for x > max.
 *                   Clip[x, {min, max}, {v   , v   }] gives v    for x < min and v    for x > max.
 * Usage:                                  min   max          min                  max
 *
 * Options:          None
 *
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Clip
 * Documentation:    web: http://reference.wolfram.com/language/ref/Clip.html
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
fun clip(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Clip", arguments.toMutableList(), options)
}
