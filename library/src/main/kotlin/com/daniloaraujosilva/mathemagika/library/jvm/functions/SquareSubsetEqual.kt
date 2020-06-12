package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SquareSubsetEqual
 *
 * Full name:        System`SquareSubsetEqual
 *
 * Usage:            SquareSubsetEqual[x, y, …] displays as x ⊑ y ⊑ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SquareSubsetEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/SquareSubsetEqual.html
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
fun squareSubsetEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SquareSubsetEqual", arguments.toMutableList(), options)
}
