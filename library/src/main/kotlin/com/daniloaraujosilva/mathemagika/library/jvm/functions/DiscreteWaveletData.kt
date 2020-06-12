package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteWaveletData
 *
 * Full name:        System`DiscreteWaveletData
 *
 *                   DiscreteWaveletData[{wind   coef , …}, wave, wtrans] yields a discrete wavelet data object with wavelet coefficients coef  corresponding to wavelet index wind , wavelet wave, and wavelet transform wtrans.
 *                                            1       1                                                                                        i                                    i
 *                   DiscreteWaveletData[{wind   coef , …}, wave, wtrans, {d , …}] yields a discrete wavelet data object assuming data dimensions {d , …}.
 * Usage:                                     1       1                      1                                                                       1
 *
 *                   Method -> Automatic
 *                   Padding -> Periodic
 *                   SampleRate -> Automatic
 * Options:          WorkingPrecision -> MachinePrecision
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DiscreteWaveletData
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteWaveletData.html
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
fun discreteWaveletData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteWaveletData", arguments.toMutableList(), options)
}
