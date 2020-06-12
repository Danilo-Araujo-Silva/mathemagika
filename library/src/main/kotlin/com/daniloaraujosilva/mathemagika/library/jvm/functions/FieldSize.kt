package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FieldSize
 *
 * Full name:        System`FieldSize
 *
 * Usage:            FieldSize is an option for InputField, PopupMenu, and related functions that specifies the size of the field allowed for input or contents.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FieldSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/FieldSize.html
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
fun fieldSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FieldSize", arguments.toMutableList(), options)
}
