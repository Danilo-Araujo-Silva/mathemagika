package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Module
 *
 * Full name:        System`Module
 *
 *                   Module[{x, y, …}, expr] specifies that occurrences of the symbols x, y, … in expr should be treated as local.
 *                   Module[{x = x , …}, expr] defines initial values for x, ….
 * Usage:                         0
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Module
 * Documentation:    web: http://reference.wolfram.com/language/ref/Module.html
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
fun module(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Module", arguments.toMutableList(), options)
}
