package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FourierTransform
 *
 * Full name:        System`FourierTransform
 *
 *                   FourierTransform[expr, t, ω] gives the symbolic Fourier transform of expr.
 *                   FourierTransform[expr, {t , t , …}, {ω , ω , …}] gives the multidimensional Fourier transform of expr.
 * Usage:                                     1   2        1   2
 *
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {0, 1}
 * Options:          GenerateConditions -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FourierTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierTransform.html
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
fun fourierTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierTransform", arguments.toMutableList(), options)
}
