package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             InverseFourierCosTransform
 * 
 * Full name:        System`InverseFourierCosTransform
 * 
 *                   InverseFourierCosTransform[expr, ω, t] gives the symbolic inverse Fourier cosine transform of expr. 
 *                   InverseFourierCosTransform[expr, {ω , ω , …}, {t , t , …}] gives the multidimensional inverse Fourier cosine transform of expr. 
 * Usage:                                               1   2        1   2
 * 
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {0, 1}
 * Options:          GenerateConditions -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/InverseFourierCosTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseFourierCosTransform.html
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
fun inverseFourierCosTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseFourierCosTransform", arguments.toMutableList(), options)
}
