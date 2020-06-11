package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SARIMAProcess
 *
 * Full name:        System`SARIMAProcess
 *
 *                   SARIMAProcess[{a , …, a }, d, {b , …, b }, {s, {α , …, α }, δ, {β , …, β }}, v] represents a seasonal integrated autoregressive moving-average process with ARIMA coefficients a , d, and b ; seasonal order s; seasonal ARIMA coefficients α , δ, and β ; seasonal integration order δ; and normal white noise with variance v.
 *                                   1      p        1      q         1      m        1      r                                                                                                       i          j                                                 i          j
 *                   SARIMAProcess[{a , …, a }, d, {b , …, b }, {s, {α , …, α }, δ, {β , …, β }}, Σ] represents a vector SARIMA process with coefficient matrices a , b , α , and β  and covariance matrix Σ.
 *                                   1      p        1      q         1      m        1      r                                                                     i   j   i       j
 *                   SARIMAProcess[{a , …}, {d , …}, {b , …}, {{s , …}, {α , …}, {δ , …}, {β , …}}, Σ] represents a vector SARIMA process with multiple integration orders d , seasonal orders s , and seasonal integration orders δ .
 *                                   1        1        1         1        1        1        1                                                                               i                   j                                   k
 *                   SARIMAProcess[{a , …, a }, d, {b , …, b }, {s, {α , …, α }, δ, {β , …, β }}, v, init] represents a SARIMA process with initial data init.
 *                                   1      p        1      q         1      m        1      r
 * Usage:            SARIMAProcess[c, …] represents a SARIMA process with constant c.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SARIMAProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/SARIMAProcess.html
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
fun sARIMAProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SARIMAProcess", arguments.toMutableList(), options)
}
