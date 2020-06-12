package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DerivativeFilter
 *
 * Full name:        System`DerivativeFilter
 *
 *                                                                       th
 *                   DerivativeFilter[data, {n , n , …}] computes the n    derivative of data at level i.
 *                                            1   2                    i
 *                   DerivativeFilter[data, {n , n , …}, σ] computes the derivative at a Gaussian scale of standard deviation σ.
 *                                            1   2
 *                   DerivativeFilter[data, {der , der , …}, …] computes several derivatives der , der , ….
 * Usage:                                       1     2                                         1     2
 *
 *                   InterpolationOrder -> Automatic
 * Options:          Padding -> Fixed
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DerivativeFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/DerivativeFilter.html
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
fun derivativeFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DerivativeFilter", arguments.toMutableList(), options)
}
