package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Containing
 *
 * Full name:        System`Containing
 *
 * Usage:            Containing["outer", "inner"] represents an object of type outer containing objects of type inner.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Containing
 * Documentation:    web: http://reference.wolfram.com/language/ref/Containing.html
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
fun containing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Containing", arguments.toMutableList(), options)
}
