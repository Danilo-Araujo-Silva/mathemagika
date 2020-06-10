package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FourierSinTransform
 * 
 * Full name:        System`FourierSinTransform
 * 
 *                   FourierSinTransform[expr, t, ω] gives the symbolic Fourier sine transform of expr. 
 *                   FourierSinTransform[expr, {t , t , …}, {ω , ω , …}] gives the multidimensional Fourier sine transform of expr. 
 * Usage:                                        1   2        1   2
 * 
 *                   Assumptions :> $Assumptions
 *                   FourierParameters -> {0, 1}
 * Options:          GenerateConditions -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FourierSinTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/FourierSinTransform.html
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
fun fourierSinTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FourierSinTransform", arguments.toMutableList(), options)
}
