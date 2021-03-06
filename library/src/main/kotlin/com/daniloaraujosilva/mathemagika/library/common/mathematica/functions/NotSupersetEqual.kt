package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotSupersetEqual
 *
 * Full name:        System`NotSupersetEqual
 *
 * Usage:            NotSupersetEqual[x, y, …] displays as x ⊉ y ⊉ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotSupersetEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotSupersetEqual.html
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
fun notSupersetEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotSupersetEqual", arguments.toMutableList(), options)
}
