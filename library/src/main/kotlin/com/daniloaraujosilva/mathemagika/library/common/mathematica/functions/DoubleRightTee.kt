package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DoubleRightTee
 *
 * Full name:        System`DoubleRightTee
 *
 * Usage:            DoubleRightTee[x, y] displays as x ⊨ y.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DoubleRightTee
 * Documentation:    web: http://reference.wolfram.com/language/ref/DoubleRightTee.html
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
fun doubleRightTee(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DoubleRightTee", arguments.toMutableList(), options)
}
