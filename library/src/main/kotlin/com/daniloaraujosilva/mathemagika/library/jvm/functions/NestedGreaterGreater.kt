package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NestedGreaterGreater
 *
 * Full name:        System`NestedGreaterGreater
 *
 * Usage:            NestedGreaterGreater[x, y, …] displays as x ⪢ y ⪢ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NestedGreaterGreater
 * Documentation:    web: http://reference.wolfram.com/language/ref/NestedGreaterGreater.html
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
fun nestedGreaterGreater(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NestedGreaterGreater", arguments.toMutableList(), options)
}
