package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotPrecedesSlantEqual
 *
 * Full name:        System`NotPrecedesSlantEqual
 *
 * Usage:            NotPrecedesSlantEqual[x, y, …] displays as x ⋠ y ⋠ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotPrecedesSlantEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotPrecedesSlantEqual.html
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
fun notPrecedesSlantEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotPrecedesSlantEqual", arguments.toMutableList(), options)
}
