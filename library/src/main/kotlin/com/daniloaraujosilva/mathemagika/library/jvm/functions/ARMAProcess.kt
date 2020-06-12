package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ARMAProcess
 *
 * Full name:        System`ARMAProcess
 *
 *                   ARMAProcess[{a , …, a }, {b , …, b }, v] represents a weakly stationary autoregressive moving-average process with AR coefficients a , MA coefficients b , and normal white noise variance v.
 *                                 1      p     1      q                                                                                                 i                   j
 *                   ARMAProcess[{a , …, a }, {b , …, b }, Σ] represents a weakly stationary vector ARMA process with coefficient matrices a  and b  and covariance matrix Σ.
 *                                 1      p     1      q                                                                                    i      j
 *                   ARMAProcess[{a , …, a }, {b , …, b }, v, init] represents an ARMA process with initial data init.
 *                                 1      p     1      q
 * Usage:            ARMAProcess[c, …] represents an ARMA process with a constant c.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ARMAProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/ARMAProcess.html
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
fun aRMAProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ARMAProcess", arguments.toMutableList(), options)
}
