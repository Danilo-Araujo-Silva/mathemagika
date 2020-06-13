package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NotReverseElement
 *
 * Full name:        System`NotReverseElement
 *
 * Usage:            NotReverseElement[x, y, …] displays as x ∌ y ∌ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotReverseElement
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotReverseElement.html
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
fun notReverseElement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotReverseElement", arguments.toMutableList(), options)
}