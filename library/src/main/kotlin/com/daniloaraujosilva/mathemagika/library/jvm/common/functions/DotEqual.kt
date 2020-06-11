package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DotEqual
 *
 * Full name:        System`DotEqual
 *
 * Usage:            DotEqual[x, y, …] displays as x ≐ y ≐ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DotEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/DotEqual.html
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
fun dotEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DotEqual", arguments.toMutableList(), options)
}
