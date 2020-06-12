package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotSquareSupersetEqual
 *
 * Full name:        System`NotSquareSupersetEqual
 *
 * Usage:            NotSquareSupersetEqual[x, y, …] displays as x ⋣ y ⋣ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotSquareSupersetEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotSquareSupersetEqual.html
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
fun notSquareSupersetEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotSquareSupersetEqual", arguments.toMutableList(), options)
}