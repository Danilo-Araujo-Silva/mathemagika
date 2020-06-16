package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LeastSquaresFilterKernel
 *
 * Full name:        System`LeastSquaresFilterKernel
 *
 *                   LeastSquaresFilterKernel[{{ω , …, ω     }, {a , …, a }}, n] creates a k-band finite impulse response (FIR) filter kernel of length n designed using a least squares method, given the specified frequencies ω  and amplitudes a .
 *                                               1      k - 1     1      k                                                                                                                                                        i                 i
 * Usage:            LeastSquaresFilterKernel[{"type", spec}, n] uses the full filter specification {"type", spec}.
 *
 * Options:          WorkingPrecision -> MachinePrecision
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LeastSquaresFilterKernel
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeastSquaresFilterKernel.html
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
fun leastSquaresFilterKernel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeastSquaresFilterKernel", arguments.toMutableList(), options)
}
