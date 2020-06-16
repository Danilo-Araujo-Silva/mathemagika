package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FourierSinSeries
 *
 * Full name:        System`FourierSinSeries
 *
 *                                                            th
 *                   FourierSinSeries[expr, t, n] gives the n  -order Fourier sine series expansion of expr in t.
 *                   FourierSinSeries[expr, {t , t , …}, {n , n , …}] gives the multidimensional Fourier sine series of expr.
 * Usage:                                     1   2        1   2
 *
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {1, 1}
 * Options:          GenerateConditions -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FourierSinSeries
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierSinSeries.html
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
fun fourierSinSeries(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierSinSeries", arguments.toMutableList(), options)
}
