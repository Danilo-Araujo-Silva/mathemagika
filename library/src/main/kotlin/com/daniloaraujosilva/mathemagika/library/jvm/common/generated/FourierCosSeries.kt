package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FourierCosSeries
 * 
 * Full name:        System`FourierCosSeries
 * 
 *                                                            th
 *                   FourierCosSeries[expr, t, n] gives the n  -order Fourier cosine series expansion of expr in t.
 *                   FourierCosSeries[expr, {t , t , …}, {n , n , …}] gives the multidimensional Fourier cosine series of expr.
 * Usage:                                     1   2        1   2
 * 
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {1, 1}
 * Options:          GenerateConditions -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FourierCosSeries
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierCosSeries.html
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
fun fourierCosSeries(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierCosSeries", arguments.toMutableList(), options)
}
