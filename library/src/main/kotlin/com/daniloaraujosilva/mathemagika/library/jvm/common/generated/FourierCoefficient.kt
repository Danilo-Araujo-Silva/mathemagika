package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FourierCoefficient
 * 
 * Full name:        System`FourierCoefficient
 * 
 *                                                              th
 *                   FourierCoefficient[expr, t, n] gives the n   coefficient in the Fourier series expansion of expr.
 *                   FourierCoefficient[expr, {t , t , …}, {n , n , …}] gives a multidimensional Fourier coefficient.
 * Usage:                                       1   2        1   2
 * 
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {1, 1}
 * Options:          GenerateConditions -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FourierCoefficient
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierCoefficient.html
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
fun fourierCoefficient(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierCoefficient", arguments.toMutableList(), options)
}
