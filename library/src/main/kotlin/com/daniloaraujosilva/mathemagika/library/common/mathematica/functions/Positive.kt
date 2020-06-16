package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Positive
 *
 * Full name:        System`Positive
 *
 * Usage:            Positive[x] gives True if x is a positive number.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Positive
 * Documentation:    web: http://reference.wolfram.com/language/ref/Positive.html
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
fun positive(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Positive", arguments.toMutableList(), options)
}
