package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ValidationLength
 *
 * Full name:        System`ValidationLength
 *
 * Usage:            ValidationLength is an option to FindSequenceFunction and related functions that specifies the number of elements in the input sequence that should be used to validate a potential representation found.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ValidationLength
 * Documentation:    web: http://reference.wolfram.com/language/ref/ValidationLength.html
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
fun validationLength(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ValidationLength", arguments.toMutableList(), options)
}
