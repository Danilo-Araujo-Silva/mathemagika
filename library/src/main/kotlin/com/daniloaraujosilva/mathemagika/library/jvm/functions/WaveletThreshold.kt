package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WaveletThreshold
 *
 * Full name:        System`WaveletThreshold
 *
 *                   WaveletThreshold[dwd] thresholds the detail wavelet coefficients in the DiscreteWaveletData object dwd.
 *                   WaveletThreshold[dwd, tspec] thresholds the coefficients using the thresholding specification tspec.
 * Usage:            WaveletThreshold[dwd, tspec, wind] thresholds the wavelet coefficients given by the wavelet indices wind.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WaveletThreshold
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaveletThreshold.html
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
fun waveletThreshold(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaveletThreshold", arguments.toMutableList(), options)
}
