package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             InverseFourierSinTransform
 * 
 * Full name:        System`InverseFourierSinTransform
 * 
 *                   InverseFourierSinTransform[expr, ω, t] gives the symbolic inverse Fourier sine transform of expr. 
 *                   InverseFourierSinTransform[expr, {ω , ω , …}, {t , t , …}] gives the multidimensional inverse Fourier sine transform of expr. 
 * Usage:                                               1   2        1   2
 * 
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {0, 1}
 * Options:          GenerateConditions -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/InverseFourierSinTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseFourierSinTransform.html
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
fun inverseFourierSinTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseFourierSinTransform", arguments.toMutableList(), options)
}
