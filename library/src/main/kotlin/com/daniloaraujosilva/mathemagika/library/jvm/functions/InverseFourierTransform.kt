package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InverseFourierTransform
 *
 * Full name:        System`InverseFourierTransform
 *
 *                   InverseFourierTransform[expr, ω, t] gives the symbolic inverse Fourier transform of expr.
 *                   InverseFourierTransform[expr, {ω , ω , …}, {t , t , …}] gives the multidimensional inverse Fourier transform of expr.
 * Usage:                                            1   2        1   2
 *
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {0, 1}
 * Options:          GenerateConditions -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseFourierTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseFourierTransform.html
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
fun inverseFourierTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseFourierTransform", arguments.toMutableList(), options)
}
