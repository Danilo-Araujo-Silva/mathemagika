package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotSubsetEqual
 *
 * Full name:        System`NotSubsetEqual
 *
 * Usage:            NotSubsetEqual[x, y, …] displays as x ⊈ y ⊈ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotSubsetEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotSubsetEqual.html
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
fun notSubsetEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotSubsetEqual", arguments.toMutableList(), options)
}
