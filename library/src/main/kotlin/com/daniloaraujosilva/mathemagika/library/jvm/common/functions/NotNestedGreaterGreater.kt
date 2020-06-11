package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotNestedGreaterGreater
 *
 * Full name:        System`NotNestedGreaterGreater
 *
 * Usage:            NotNestedGreaterGreater[x, y, …] displays as x  y  ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotNestedGreaterGreater
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotNestedGreaterGreater.html
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
fun notNestedGreaterGreater(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotNestedGreaterGreater", arguments.toMutableList(), options)
}
