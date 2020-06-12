package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FourierCosTransform
 *
 * Full name:        System`FourierCosTransform
 *
 *                   FourierCosTransform[expr, t, ω] gives the symbolic Fourier cosine transform of expr.
 *                   FourierCosTransform[expr, {t , t , …}, {ω , ω , …}] gives the multidimensional Fourier cosine transform of expr.
 * Usage:                                        1   2        1   2
 *
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {0, 1}
 * Options:          GenerateConditions -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FourierCosTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierCosTransform.html
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
fun fourierCosTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierCosTransform", arguments.toMutableList(), options)
}
