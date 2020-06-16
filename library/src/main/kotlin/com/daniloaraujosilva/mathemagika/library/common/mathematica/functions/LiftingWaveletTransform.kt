package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LiftingWaveletTransform
 *
 * Full name:        System`LiftingWaveletTransform
 *
 *                   LiftingWaveletTransform[data] gives the lifting wavelet transform (LWT) of an array of data.
 *                   LiftingWaveletTransform[data, wave] gives the lifting wavelet transform using the wavelet wave.
 * Usage:            LiftingWaveletTransform[data, wave, r] gives the lifting wavelet transform using r levels of refinement.
 *
 *                   Method -> Automatic
 *                   Padding -> Periodic
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LiftingWaveletTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/LiftingWaveletTransform.html
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
fun liftingWaveletTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LiftingWaveletTransform", arguments.toMutableList(), options)
}
