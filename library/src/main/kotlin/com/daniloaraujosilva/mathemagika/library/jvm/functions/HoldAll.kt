package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HoldAll
 *
 * Full name:        System`HoldAll
 *
 * Usage:            HoldAll is an attribute that specifies that all arguments to a function are to be maintained in an unevaluated form.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HoldAll
 * Documentation:    web: http://reference.wolfram.com/language/ref/HoldAll.html
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
fun holdAll(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HoldAll", arguments.toMutableList(), options)
}
