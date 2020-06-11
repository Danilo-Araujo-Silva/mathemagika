package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PrecedesEqual
 *
 * Full name:        System`PrecedesEqual
 *
 * Usage:            PrecedesEqual[x, y, …] displays as x ⪯ y ⪯ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/PrecedesEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrecedesEqual.html
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
fun precedesEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrecedesEqual", arguments.toMutableList(), options)
}
