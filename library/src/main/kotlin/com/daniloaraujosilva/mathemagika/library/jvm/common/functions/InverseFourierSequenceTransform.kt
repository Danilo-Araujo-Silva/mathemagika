package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseFourierSequenceTransform
 *
 * Full name:        System`InverseFourierSequenceTransform
 *
 *                   InverseFourierSequenceTransform[expr, ω, n] gives the inverse discrete-time Fourier transform of expr.
 *                   InverseFourierSequenceTransform[expr, {ω , ω , …}, {n , n , …}] gives the multidimensional inverse Fourier sequence transform.
 * Usage:                                                    1   2        1   2
 *
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {1, 1}
 * Options:          GenerateConditions -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseFourierSequenceTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseFourierSequenceTransform.html
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
fun inverseFourierSequenceTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseFourierSequenceTransform", arguments.toMutableList(), options)
}
