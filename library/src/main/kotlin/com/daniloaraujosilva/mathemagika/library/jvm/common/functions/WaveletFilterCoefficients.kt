package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WaveletFilterCoefficients
 *
 * Full name:        System`WaveletFilterCoefficients
 *
 * Usage:            WaveletFilterCoefficients[wave, filt] gives the filter coefficients for the symbolic wavelet wave of type filt.
 *
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WaveletFilterCoefficients
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaveletFilterCoefficients.html
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
fun waveletFilterCoefficients(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaveletFilterCoefficients", arguments.toMutableList(), options)
}
