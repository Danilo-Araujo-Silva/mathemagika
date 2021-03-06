package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PowerSpectralDensity
 *
 * Full name:        System`PowerSpectralDensity
 *
 *                   PowerSpectralDensity[data, ω] estimates the power spectral density for data.
 *                   PowerSpectralDensity[data, ω, sspec] estimates the power spectral density for data with smoothing specification sspec.
 * Usage:            PowerSpectralDensity[tproc, ω] represents the power spectral density of a time series process tproc.
 *
 * Options:          FourierParameters -> {1, 1}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PowerSpectralDensity
 * Documentation:    web: http://reference.wolfram.com/language/ref/PowerSpectralDensity.html
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
fun powerSpectralDensity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PowerSpectralDensity", arguments.toMutableList(), options)
}
