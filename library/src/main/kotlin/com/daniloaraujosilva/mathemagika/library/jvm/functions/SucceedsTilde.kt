package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SucceedsTilde
 *
 * Full name:        System`SucceedsTilde
 *
 * Usage:            SucceedsTilde[x, y, …] displays as x ≿ y ≿ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SucceedsTilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/SucceedsTilde.html
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
fun succeedsTilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SucceedsTilde", arguments.toMutableList(), options)
}
