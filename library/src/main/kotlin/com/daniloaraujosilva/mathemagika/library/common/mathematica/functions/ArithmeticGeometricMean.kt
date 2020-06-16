package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ArithmeticGeometricMean
 *
 * Full name:        System`ArithmeticGeometricMean
 *
 * Usage:            ArithmeticGeometricMean[a, b] gives the arithmetic‐geometric mean of a and b.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Orderless
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ArithmeticGeometricMean
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArithmeticGeometricMean.html
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
fun arithmeticGeometricMean(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArithmeticGeometricMean", arguments.toMutableList(), options)
}
