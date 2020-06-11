package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Lighter
 *
 * Full name:        System`Lighter
 *
 *                   Lighter[color] represents a lighter version of the specified color.
 *                   Lighter[color, f] represents a version of the specified color lightened by a fraction f.
 * Usage:            Lighter[image, …] gives a lighter version of an image.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Lighter
 * Documentation:    web: http://reference.wolfram.com/language/ref/Lighter.html
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
fun lighter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Lighter", arguments.toMutableList(), options)
}
