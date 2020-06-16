package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SquareUnion
 *
 * Full name:        System`SquareUnion
 *
 * Usage:            SquareUnion[x, y, …] displays as x ⊔ y ⊔ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SquareUnion
 * Documentation:    web: http://reference.wolfram.com/language/ref/SquareUnion.html
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
fun squareUnion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SquareUnion", arguments.toMutableList(), options)
}
