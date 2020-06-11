package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OutputResponse
 *
 * Full name:        System`OutputResponse
 *
 *                   OutputResponse[sys, u, {t, t   , t   }] gives the numeric output response of systems model sys to the input u for t    ≤ t ≤ t   .
 *                                               min   max                                                                              min        max
 *                   OutputResponse[sys, {u[0], u[1], …}] gives the output response of the discrete-time system sys to the input sequence u[i].
 *                   OutputResponse[sys, u, t] gives the symbolic output response of system sys to the input u as a function of time t.
 *                   OutputResponse[sys, {u , …, u }, …] gives the output response for multiple inputs u .
 * Usage:                                  1      m                                                     i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/OutputResponse
 * Documentation:    web: http://reference.wolfram.com/language/ref/OutputResponse.html
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
fun outputResponse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OutputResponse", arguments.toMutableList(), options)
}
