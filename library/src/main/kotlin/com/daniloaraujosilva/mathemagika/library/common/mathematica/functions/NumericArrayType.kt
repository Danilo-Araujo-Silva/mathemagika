package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NumericArrayType
 *
 * Full name:        System`NumericArrayType
 *
 * Usage:            NumericArrayType[array] gives the underlying type of values used for each element in the NumericArray object.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NumericArrayType
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumericArrayType.html
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
fun numericArrayType(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumericArrayType", arguments.toMutableList(), options)
}
