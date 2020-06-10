package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SARMAProcess
 * 
 * Full name:        System`SARMAProcess
 * 
 *                   SARMAProcess[{a , …, a }, {b , …, b }, {s, {α , …, α }, {β , …, β }}, v] represents a weakly stationary seasonal autoregressive moving-average process with ARMA coefficients a  and b , seasonal order s, seasonal ARMA coefficients α  and β , and normal white noise with variance v.
 *                                  1      p     1      q         1      m     1      r                                                                                                             i      j                                                i      j
 *                   SARMAProcess[{a , …, a }, {b , …, b }, {s, {α , …, α }, {β , …, β }}, Σ]  represents a weakly stationary vector SARMA process driven by normal white noise, with covariance matrix Σ.
 *                                  1      p     1      q         1      m     1      r
 *                   SARMAProcess[{a , …, a }, {b , …, b }, {{s , …}, {α , …, α }, {β , …, β }}, Σ] represents a weakly stationary vector SARMA process with multiple seasonal orders s .
 *                                  1      p     1      q      1        1      m     1      r                                                                                          i
 *                   SARMAProcess[{a , …, a }, {b , …, b }, {s, {α , …, α }, {β , …, β }}, v, init]  represents a SARMA process with initial data init. 
 *                                  1      p     1      q         1      m     1      r
 * Usage:            SARMAProcess[c, …] represents a SARMA process with a constant c.
 * 
 * Options:          None
 * 
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SARMAProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/SARMAProcess.html
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
fun sARMAProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SARMAProcess", arguments.toMutableList(), options)
}
