package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NumericFunction
 *
 * Full name:        System`NumericFunction
 *
 *                   NumericFunction is an attribute that can be assigned to a symbol f to indicate that f[arg , arg , …] should be considered a numeric quantity whenever all the arg  are numeric quantities.
 * Usage:                                                                                                     1     2                                                                 i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NumericFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumericFunction.html
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
fun numericFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumericFunction", arguments.toMutableList(), options)
}
