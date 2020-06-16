package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FieldMasked
 *
 * Full name:        System`FieldMasked
 *
 * Usage:            FieldMasked is an option to InputField that determines whether to mask user input.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FieldMasked
 * Documentation:    web: http://reference.wolfram.com/language/ref/FieldMasked.html
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
fun fieldMasked(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FieldMasked", arguments.toMutableList(), options)
}
