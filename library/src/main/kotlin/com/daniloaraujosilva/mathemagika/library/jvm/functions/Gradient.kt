package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Gradient
 *
 * Full name:        System`Gradient
 *
 * Usage:            Gradient is an option for FindMinimum and related functions that specifies the gradient vector to assume for the function being extremized.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Gradient
 * Documentation:    web: http://reference.wolfram.com/language/ref/Gradient.html
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
fun gradient(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Gradient", arguments.toMutableList(), options)
}
