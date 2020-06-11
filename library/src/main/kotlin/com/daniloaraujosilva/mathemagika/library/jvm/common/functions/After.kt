package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             After
 *
 * Full name:        System`After
 *
 * Usage:            After is a symbol that represents the region after an object for purposes of placement.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/After
 * Documentation:    web: http://reference.wolfram.com/language/ref/After.html
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
fun after(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("After", arguments.toMutableList(), options)
}
