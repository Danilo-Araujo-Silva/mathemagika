package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FractionalGaussianNoiseProcess
 *
 * Full name:        System`FractionalGaussianNoiseProcess
 *
 *                   FractionalGaussianNoiseProcess[μ, σ, h] represents a fractional Gaussian noise process with drift μ, volatility σ, and Hurst index h.
 * Usage:            FractionalGaussianNoiseProcess[h] represents a fractional Gaussian noise process with drift 0, volatility 1, and Hurst index h.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FractionalGaussianNoiseProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/FractionalGaussianNoiseProcess.html
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
fun fractionalGaussianNoiseProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FractionalGaussianNoiseProcess", arguments.toMutableList(), options)
}
