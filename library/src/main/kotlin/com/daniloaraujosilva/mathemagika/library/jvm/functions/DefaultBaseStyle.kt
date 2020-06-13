package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultBaseStyle
 *
 * Full name:        System`DefaultBaseStyle
 *
 * Usage:            DefaultBaseStyle is a low-level option for formatting and related constructs that specifies a default base style to use before BaseStyle.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultBaseStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultBaseStyle.html
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
fun defaultBaseStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultBaseStyle", arguments.toMutableList(), options)
}
