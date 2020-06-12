package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseContinuousWaveletTransform
 *
 * Full name:        System`InverseContinuousWaveletTransform
 *
 *                   InverseContinuousWaveletTransform[cwd] gives the inverse continuous wavelet transform of a ContinuousWaveletData object cwd.
 *                   InverseContinuousWaveletTransform[cwd, wave] gives the inverse transform using the wavelet wave.
 * Usage:            InverseContinuousWaveletTransform[cwd, wave, octvoc] gives the inverse transform from the wavelet coefficients specified by octvoc.
 *
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InverseContinuousWaveletTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseContinuousWaveletTransform.html
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
fun inverseContinuousWaveletTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseContinuousWaveletTransform", arguments.toMutableList(), options)
}
