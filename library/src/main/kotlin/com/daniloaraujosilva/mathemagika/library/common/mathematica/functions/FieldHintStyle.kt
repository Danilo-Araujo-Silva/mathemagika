package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FieldHintStyle
 *
 * Full name:        System`FieldHintStyle
 *
 * Usage:            FieldHintStyle is an option for InputField that specifies the style to use for displaying the field hint.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FieldHintStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/FieldHintStyle.html
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
fun fieldHintStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FieldHintStyle", arguments.toMutableList(), options)
}
