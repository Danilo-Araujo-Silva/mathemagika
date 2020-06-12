package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PrecedesSlantEqual
 *
 * Full name:        System`PrecedesSlantEqual
 *
 * Usage:            PrecedesSlantEqual[x, y, …] displays as x ≼ y ≼ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/PrecedesSlantEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrecedesSlantEqual.html
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
fun precedesSlantEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrecedesSlantEqual", arguments.toMutableList(), options)
}
