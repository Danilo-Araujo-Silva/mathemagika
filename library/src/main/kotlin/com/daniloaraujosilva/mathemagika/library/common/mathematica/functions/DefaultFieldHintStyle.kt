package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultFieldHintStyle
 *
 * Full name:        System`DefaultFieldHintStyle
 *
 * Usage:            DefaultFieldHintStyle is a low-level option for InputField that specifies the default style to use for displaying the field hint.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultFieldHintStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultFieldHintStyle.html
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
fun defaultFieldHintStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultFieldHintStyle", arguments.toMutableList(), options)
}
