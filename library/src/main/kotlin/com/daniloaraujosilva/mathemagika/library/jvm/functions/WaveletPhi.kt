package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WaveletPhi
 *
 * Full name:        System`WaveletPhi
 *
 *                   WaveletPhi[wave, x] gives the scaling function ϕ(x) for the symbolic wavelet wave evaluated at x.
 * Usage:            WaveletPhi[wave] gives the scaling function as a pure function.
 *
 *                   MaxRecursion -> Automatic
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WaveletPhi
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaveletPhi.html
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
fun waveletPhi(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaveletPhi", arguments.toMutableList(), options)
}
