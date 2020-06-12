package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultLabelStyle
 *
 * Full name:        System`DefaultLabelStyle
 *
 * Usage:            DefaultLabelStyle is a low-level option for formatting and related constructs that specifies the default style to use in displaying their label-like elements.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultLabelStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultLabelStyle.html
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
fun defaultLabelStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultLabelStyle", arguments.toMutableList(), options)
}
