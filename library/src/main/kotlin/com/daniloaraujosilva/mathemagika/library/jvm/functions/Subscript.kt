package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Subscript
 *
 * Full name:        System`Subscript
 *
 *                   Subscript[x, y] is an object that formats as x .
 *                                                                 y
 *                   Subscript[x, y , y , …] formats as x         .
 *                                 1   2                 y , y , …
 * Usage:                                                 1   2
 *
 * Options:          None
 *
 * Attributes:       NHoldRest
 *
 *                   local: paclet:ref/Subscript
 * Documentation:    web: http://reference.wolfram.com/language/ref/Subscript.html
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
fun subscript(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Subscript", arguments.toMutableList(), options)
}
