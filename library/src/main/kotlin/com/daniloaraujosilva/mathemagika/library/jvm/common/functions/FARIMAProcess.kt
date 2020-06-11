package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FARIMAProcess
 *
 * Full name:        System`FARIMAProcess
 *
 *                                                                                                                                                                  th
 *                   FARIMAProcess[{a , …, a }, d, {b , …, b }, v] represents an autoregressive fractionally integrated moving-average process y(t) such that its d   difference is an ARMAProcess[{a , …, a }, {b , …, b , v].
 *                                   1      p        1      q                                                                                                                                         1      p     1      q
 *                                                                                                                                                                                                th
 *                   FARIMAProcess[{a , …, a }, d, {b , …, b }, Σ] represents a vector autoregressive fractionally integrated moving-average process (y  (t), … , y  (t)) such that its (d, …, d)   difference is a vector ARMAProcess.
 *                                   1      p        1      q                                                                                          1           n
 *                                                                                                                                                                                                            th
 *                   FARIMAProcess[{a , …, a }, {d , …, d }, {b , …, b }, Σ] represents a vector autoregressive fractionally integrated moving-average process (y  (t), … , y  (t)) such that its (d , …, d )   difference is a vector ARMAProcess.
 * Usage:                            1      p     1      n     1      q                                                                                          1           n                      1      n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FARIMAProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/FARIMAProcess.html
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
fun fARIMAProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FARIMAProcess", arguments.toMutableList(), options)
}
