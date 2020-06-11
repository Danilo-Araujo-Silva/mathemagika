package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LabelStyle
 *
 * Full name:        System`LabelStyle
 *
 * Usage:            LabelStyle is an option for formatting and related constructs that specifies the style to use in displaying their label-like elements.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LabelStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/LabelStyle.html
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
fun labelStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LabelStyle", arguments.toMutableList(), options)
}
