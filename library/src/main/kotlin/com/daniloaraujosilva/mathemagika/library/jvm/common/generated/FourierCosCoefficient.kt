package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FourierCosCoefficient
 * 
 * Full name:        System`FourierCosCoefficient
 * 
 *                                                                 th
 *                   FourierCosCoefficient[expr, t, n] gives the n   coefficient in the Fourier cosine series expansion of expr.
 *                   FourierCosCoefficient[expr, {t , t , …}, {n , n , …}] gives a multidimensional Fourier cosine coefficient.
 * Usage:                                          1   2        1   2
 * 
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {1, 1}
 * Options:          GenerateConditions -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FourierCosCoefficient
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierCosCoefficient.html
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
fun fourierCosCoefficient(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierCosCoefficient", arguments.toMutableList(), options)
}
