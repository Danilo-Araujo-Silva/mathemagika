package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GreaterEqualLess
 *
 * Full name:        System`GreaterEqualLess
 *
 * Usage:            GreaterEqualLess[x, y, …] displays as x ⋛ y ⋛ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/GreaterEqualLess
 * Documentation:    web: http://reference.wolfram.com/language/ref/GreaterEqualLess.html
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
fun greaterEqualLess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GreaterEqualLess", arguments.toMutableList(), options)
}
