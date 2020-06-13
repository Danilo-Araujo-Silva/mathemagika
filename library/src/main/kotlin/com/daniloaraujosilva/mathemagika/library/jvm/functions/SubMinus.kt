package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SubMinus
 *
 * Full name:        System`SubMinus
 *
 *                   SubMinus[expr] displays as expr .
 * Usage:                                           -
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SubMinus
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubMinus.html
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
fun subMinus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubMinus", arguments.toMutableList(), options)
}
