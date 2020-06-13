package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FourierSinCoefficient
 *
 * Full name:        System`FourierSinCoefficient
 *
 *                                                                 th
 *                   FourierSinCoefficient[expr, t, n] gives the n   coefficient in the Fourier sine series expansion of expr.
 *                   FourierSinCoefficient[expr, {t , t , …}, {n , n , …}] gives a multidimensional Fourier sine coefficient.
 * Usage:                                          1   2        1   2
 *
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {1, 1}
 * Options:          GenerateConditions -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FourierSinCoefficient
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierSinCoefficient.html
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
fun fourierSinCoefficient(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierSinCoefficient", arguments.toMutableList(), options)
}
