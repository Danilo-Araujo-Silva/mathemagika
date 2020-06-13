package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Throw
 *
 * Full name:        System`Throw
 *
 *                   Throw[value] stops evaluation and returns value as the value of the nearest enclosing Catch.
 * Usage:            Throw[value, tag] is caught only by Catch[expr, form], where tag matches form.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Throw
 * Documentation:    web: http://reference.wolfram.com/language/ref/Throw.html
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
fun `throw`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Throw", arguments.toMutableList(), options)
}
