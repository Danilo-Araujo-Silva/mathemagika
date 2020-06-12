package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ActiveStyle
 *
 * Full name:        System`ActiveStyle
 *
 * Usage:            ActiveStyle is an option for Hyperlink and related constructs that specifies styles to add when the constructs are active, typically as a result of the mouse being over them.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ActiveStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/ActiveStyle.html
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
fun activeStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ActiveStyle", arguments.toMutableList(), options)
}
