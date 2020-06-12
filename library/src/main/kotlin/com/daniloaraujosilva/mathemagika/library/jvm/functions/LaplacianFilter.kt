package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LaplacianFilter
 *
 * Full name:        System`LaplacianFilter
 *
 *                   LaplacianFilter[data, r] convolves data with a radius-r Laplacian kernel.
 *                   LaplacianFilter[data, {r , r , …}] uses radius r  at level i in data.
 * Usage:                                    1   2                   i
 *
 *                   Padding -> Fixed
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LaplacianFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/LaplacianFilter.html
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
fun laplacianFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LaplacianFilter", arguments.toMutableList(), options)
}
