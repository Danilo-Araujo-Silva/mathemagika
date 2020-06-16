package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotSquareSubsetEqual
 *
 * Full name:        System`NotSquareSubsetEqual
 *
 * Usage:            NotSquareSubsetEqual[x, y, …] displays as x ⋢ y ⋢ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotSquareSubsetEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotSquareSubsetEqual.html
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
fun notSquareSubsetEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotSquareSubsetEqual", arguments.toMutableList(), options)
}
