package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SquareSupersetEqual
 *
 * Full name:        System`SquareSupersetEqual
 *
 * Usage:            SquareSupersetEqual[x, y, …] displays as x ⊒ y ⊒ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SquareSupersetEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/SquareSupersetEqual.html
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
fun squareSupersetEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SquareSupersetEqual", arguments.toMutableList(), options)
}
