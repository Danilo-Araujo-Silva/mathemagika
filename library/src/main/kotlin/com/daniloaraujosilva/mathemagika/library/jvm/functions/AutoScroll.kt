package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AutoScroll
 *
 * Full name:        System`AutoScroll
 *
 * Usage:            AutoScroll is an option to SelectionMove and related functions that specifies whether a notebook should automatically be scrolled to display the current selection.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AutoScroll
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutoScroll.html
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
fun autoScroll(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutoScroll", arguments.toMutableList(), options)
}
