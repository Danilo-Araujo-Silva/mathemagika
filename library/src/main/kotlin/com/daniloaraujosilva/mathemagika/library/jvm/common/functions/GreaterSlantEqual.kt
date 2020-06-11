package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GreaterSlantEqual
 *
 * Full name:        System`GreaterSlantEqual
 *
 * Usage:            GreaterSlantEqual[x, y, …] displays as x ⩾ y ⩾ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/GreaterSlantEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/GreaterSlantEqual.html
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
fun greaterSlantEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GreaterSlantEqual", arguments.toMutableList(), options)
}
