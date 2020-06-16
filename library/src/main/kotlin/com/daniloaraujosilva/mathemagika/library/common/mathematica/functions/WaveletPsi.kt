package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WaveletPsi
 *
 * Full name:        System`WaveletPsi
 *
 *                   WaveletPsi[wave, x] gives the wavelet function ψ(x) for the symbolic wavelet wave evaluated at x.
 * Usage:            WaveletPsi[wave] gives the wavelet function as a pure function.
 *
 *                   MaxRecursion -> Automatic
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WaveletPsi
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaveletPsi.html
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
fun waveletPsi(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaveletPsi", arguments.toMutableList(), options)
}
