package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GreaterGreater
 *
 * Full name:        System`GreaterGreater
 *
 * Usage:            GreaterGreater[x, y, …] displays as x ≫ y ≫ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/GreaterGreater
 * Documentation:    web: http://reference.wolfram.com/language/ref/GreaterGreater.html
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
fun greaterGreater(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GreaterGreater", arguments.toMutableList(), options)
}
