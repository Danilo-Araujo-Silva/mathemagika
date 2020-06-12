package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GaborFilter
 *
 * Full name:        System`GaborFilter
 *
 *                   GaborFilter[data, r, k] filters data by convolving with a Gabor kernel of pixel radius r and wave vector k.
 *                   GaborFilter[data, r, k, ϕ] uses a Gabor kernel with phase shift ϕ.
 * Usage:            GaborFilter[data, {r, σ}, …]  uses a Gabor kernel with radius r  and standard deviation σ.
 *
 *                   Padding -> Fixed
 *                   Standardized -> True
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GaborFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaborFilter.html
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
fun gaborFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaborFilter", arguments.toMutableList(), options)
}
