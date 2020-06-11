package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ReverseElement
 *
 * Full name:        System`ReverseElement
 *
 * Usage:            ReverseElement[x, y, …] displays as x ∋ y ∋ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/ReverseElement
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReverseElement.html
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
fun reverseElement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReverseElement", arguments.toMutableList(), options)
}
