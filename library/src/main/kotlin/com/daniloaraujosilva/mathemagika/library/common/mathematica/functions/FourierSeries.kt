package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FourierSeries
 *
 * Full name:        System`FourierSeries
 *
 *                                                         th
 *                   FourierSeries[expr, t, n] gives the n  -order Fourier series expansion of expr in t.
 *                   FourierSeries[expr, {t , t , …}, {n , n , …}] gives the multidimensional Fourier series.
 * Usage:                                  1   2        1   2
 *
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {1, 1}
 * Options:          GenerateConditions -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FourierSeries
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierSeries.html
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
fun fourierSeries(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierSeries", arguments.toMutableList(), options)
}
