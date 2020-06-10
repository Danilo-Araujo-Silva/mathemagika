package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FourierSequenceTransform
 * 
 * Full name:        System`FourierSequenceTransform
 * 
 *                   FourierSequenceTransform[expr, n, ω] gives the Fourier sequence transform of expr.
 *                   FourierSequenceTransform[expr, {n , n , …}, {ω , ω , …}] gives the multidimensional Fourier sequence transform. 
 * Usage:                                             1   2        1   2
 * 
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {1, 1}
 * Options:          GenerateConditions -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FourierSequenceTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierSequenceTransform.html
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
fun fourierSequenceTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierSequenceTransform", arguments.toMutableList(), options)
}
