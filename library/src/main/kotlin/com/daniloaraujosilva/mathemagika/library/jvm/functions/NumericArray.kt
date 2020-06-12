package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NumericArray
 *
 * Full name:        System`NumericArray
 *
 *                   NumericArray[array, type] creates a numeric array of the specified type.
 * Usage:            NumericArray[array, type, method] uses method to convert numbers into type.
 *
 * Options:          Tolerance -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NumericArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumericArray.html
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
fun numericArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumericArray", arguments.toMutableList(), options)
}
