package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Darker
 *
 * Full name:        System`Darker
 *
 *                   Darker[color] represents a darker version of the specified color.
 *                   Darker[color, f] represents a version of the specified color darkened by a fraction f.
 * Usage:            Darker[image, …] gives a darker version of an image.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Darker
 * Documentation:    web: http://reference.wolfram.com/language/ref/Darker.html
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
fun darker(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Darker", arguments.toMutableList(), options)
}
