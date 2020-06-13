package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             And
 *
 * Full name:        System`And
 *
 *                   e  && e  && … is the logical AND function. It evaluates its arguments in order, giving False immediately if any of them are False, and True if they are all True.
 * Usage:             1     2
 *
 * Options:          None
 *
 *                   Flat
 *                   HoldAll
 *                   OneIdentity
 * Attributes:       Protected
 *
 *                   local: paclet:ref/And
 * Documentation:    web: http://reference.wolfram.com/language/ref/And.html
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
fun and(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("And", arguments.toMutableList(), options)
}
