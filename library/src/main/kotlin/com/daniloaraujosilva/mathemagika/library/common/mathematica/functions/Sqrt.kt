package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Sqrt
 *
 * Full name:        System`Sqrt
 *
 * Usage:            Sqrt[z] or Sqrt[z] gives the square root of z.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Sqrt
 * Documentation:    web: http://reference.wolfram.com/language/ref/Sqrt.html
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
fun sqrt(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Sqrt", arguments.toMutableList(), options)
}
