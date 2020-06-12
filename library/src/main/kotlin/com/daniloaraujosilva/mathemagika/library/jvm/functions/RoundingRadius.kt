package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RoundingRadius
 *
 * Full name:        System`RoundingRadius
 *
 * Usage:            RoundingRadius is an option for Rectangle, Framed, and related functions that specifies the radius of the circle to use in rendering rounded corners.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RoundingRadius
 * Documentation:    web: http://reference.wolfram.com/language/ref/RoundingRadius.html
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
fun roundingRadius(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RoundingRadius", arguments.toMutableList(), options)
}
