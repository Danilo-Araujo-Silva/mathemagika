package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SquareSuperset
 *
 * Full name:        System`SquareSuperset
 *
 * Usage:            SquareSuperset[x, y, …] displays as x ⊐ y ⊐ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SquareSuperset
 * Documentation:    web: http://reference.wolfram.com/language/ref/SquareSuperset.html
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
fun squareSuperset(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SquareSuperset", arguments.toMutableList(), options)
}
