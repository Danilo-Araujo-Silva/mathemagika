package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StateFeedbackGains
 *
 * Full name:        System`StateFeedbackGains
 *
 *                   StateFeedbackGains[ssm, {p , p , …, p }] gives the state feedback gain matrix for the state-space model ssm, such that the poles of the closed-loop system are p .
 *                                             1   2      n                                                                                                                          i
 *                   StateFeedbackGains[{ssm, {in , …}}, …] specifies control inputs in  to use.
 * Usage:                                        1                                     i
 *
 *                   Method -> Automatic
 * Options:          Tolerance -> 0.01
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StateFeedbackGains
 * Documentation:    web: http://reference.wolfram.com/language/ref/StateFeedbackGains.html
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
fun stateFeedbackGains(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StateFeedbackGains", arguments.toMutableList(), options)
}
