package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ARIMAProcess
 *
 * Full name:        System`ARIMAProcess
 *
 *                                                                                                                                                    th
 *                   ARIMAProcess[{a , …, a }, d, {b , …, b }, v] represents an autoregressive integrated moving-average process y(t) such that its d   difference is a weakly stationary ARMAProcess[{a , …, a }, {b , …, b }, v].
 *                                  1      p        1      q                                                                                                                                             1      p     1      q
 *                                                                                                                                               th
 *                   ARIMAProcess[{a , …, a }, d, {b , …, b }, Σ] represents a vector ARIMA process (y  (t), … , y  (t)) such that its (d, …, d)   difference is a vector weakly stationary ARMAProcess.
 *                                  1      p        1      q                                          1           n
 *                                                                                                                                                           th
 *                   ARIMAProcess[{a , …, a }, {d , …, d }, {b , …, b }, Σ] represents a vector ARIMA process (y  (t), … , y  (t)) such that its (d , …, d )   difference is a vector weakly stationary ARMAProcess.
 *                                  1      p     1      n     1      q                                          1           n                      1      n
 *                   ARIMAProcess[{a , …, a }, d, {b , …, b }, v, init] represents an ARIMA process with initial data init.
 *                                  1      p        1      q
 * Usage:            ARIMAProcess[c, …] represents an ARIMA process with a constant c.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ARIMAProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/ARIMAProcess.html
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
fun aRIMAProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ARIMAProcess", arguments.toMutableList(), options)
}
