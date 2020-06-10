package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FourierTrigSeries
 * 
 * Full name:        System`FourierTrigSeries
 * 
 *                                                             th
 *                   FourierTrigSeries[expr, t, n] gives the n  -order Fourier trigonometric series expansion of expr in t.
 *                   FourierTrigSeries[expr, {t , t , …}, {n , n , …}] gives the multidimensional Fourier trigonometric series of expr.
 * Usage:                                      1   2        1   2
 * 
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {1, 1}
 * Options:          GenerateConditions -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FourierTrigSeries
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierTrigSeries.html
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
fun fourierTrigSeries(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierTrigSeries", arguments.toMutableList(), options)
}
